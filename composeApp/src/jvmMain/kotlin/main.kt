
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import dev.boringx.creative.ImageRotating
import java.awt.Dimension

fun main() = application {
    Window(
        title = "creative-coding",
        state = rememberWindowState(width = 1280.dp, height = 720.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(256, 256)
        ImageRotating()
    }
}