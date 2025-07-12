package `in`.dev.ne.receipe.app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import `in`.dev.ne.receipe.app.di.initKoinJvm


val koinJvm = initKoinJvm()

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "RecipeApp-CMP",
    ) {
        App()
    }
}