package `in`.dev.ne.receipe.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "RecipeApp-CMP",
    ) {
        App()
    }
}