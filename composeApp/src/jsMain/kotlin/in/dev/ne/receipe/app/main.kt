package `in`.dev.ne.receipe.app

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import `in`.dev.ne.receipe.app.di.initKoinJs
import kotlinx.browser.document

val koinJs = initKoinJs()
@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        App()
    }
}