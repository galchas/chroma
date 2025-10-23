package cafe.adriel.chroma.view.tuner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cafe.adriel.chroma.ktx.keepScreenOn
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class TunerActivity : AppCompatActivity() {

    private val viewModel by viewModel<TunerViewModel> { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = TunerAndroidView(this)
        view.viewModel = viewModel
        setContentView(view)
        keepScreenOn()
    }
}
