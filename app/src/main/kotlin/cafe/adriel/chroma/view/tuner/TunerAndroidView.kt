package cafe.adriel.chroma.view.tuner

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.compose.ui.platform.ComposeView
import androidx.core.view.updateLayoutParams

/**
 * Android View wrapper for the Tuner screen so it can be embedded in non-Compose apps.
 * Internally it renders the existing Compose-based UI via ComposeView.
 */
class TunerAndroidView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : FrameLayout(context, attrs) {

    private val composeView = ComposeView(context)

    var viewModel: TunerViewModel? = null
        set(value) {
            field = value
            // Render only when ViewModel is provided
            composeView.setContent {
                value?.let { vm ->
                    TunerScreen(vm).Content()
                }
            }
        }

    init {
        addView(composeView)
        composeView.updateLayoutParams<LayoutParams> {
            width = LayoutParams.MATCH_PARENT
            height = LayoutParams.MATCH_PARENT
        }
    }
}
