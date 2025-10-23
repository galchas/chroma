package cafe.adriel.chroma.view.tuner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cafe.adriel.chroma.ktx.keepScreenOn
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class TunerActivity : AppCompatActivity() {

    private val tunerViewModel: TunerViewModel by viewModel { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TunerAndroidView(this)
        // Explicitly set the ViewModel so the view renders immediately
        view.viewModel = tunerViewModel
        setContentView(view)
        keepScreenOn()
    }
}
