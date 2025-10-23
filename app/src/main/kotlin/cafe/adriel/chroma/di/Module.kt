package cafe.adriel.chroma.di

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.lifecycle.lifecycleScope
import cafe.adriel.chroma.manager.MessagingManager
import cafe.adriel.chroma.manager.PermissionManager
import cafe.adriel.chroma.manager.SettingsManager
import cafe.adriel.chroma.manager.TunerManager
import cafe.adriel.chroma.view.tuner.TunerActivity
import cafe.adriel.chroma.view.tuner.TunerScreen
import cafe.adriel.chroma.view.tuner.TunerViewModel
import cafe.adriel.satchel.Satchel
import cafe.adriel.satchel.storer.file.FileSatchelStorer
import java.io.File
import kotlinx.coroutines.CoroutineScope
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    // Activity-bound components using parameters
    factory { (activity: TunerActivity) ->
        PermissionManager(
            activity = activity
        )
    }

    factory { (activity: TunerActivity) ->
        MessagingManager(
            context = activity
        )
    }

    factory { (activity: TunerActivity) ->
        TunerManager(
            settingsManager = get(),
            permissionManager = get(parameters = { org.koin.core.parameter.parametersOf(activity) }),
            lifecycleOwner = activity
        )
    }

    // ViewModel that wires activity-bound dependencies via parameters
    viewModel { (activity: TunerActivity) ->
        TunerViewModel(
            tunerManager = get(parameters = { org.koin.core.parameter.parametersOf(activity) }),
            settingsManager = get(),
            permissionManager = get(parameters = { org.koin.core.parameter.parametersOf(activity) }),
            messagingManager = get(parameters = { org.koin.core.parameter.parametersOf(activity) })
        )
    }

    // UI wrapper class can be created directly where needed; no DI binding required

    single {
        SettingsManager(
            storage = get(),
            scope = get()
        )
    }

    single {
        Satchel.with(
            storer = FileSatchelStorer(
                file = File(get<Application>().filesDir, "settings.storage")
            )
        )
    }

    single<CoroutineScope> {
        ProcessLifecycleOwner.get().lifecycleScope
    }
}
