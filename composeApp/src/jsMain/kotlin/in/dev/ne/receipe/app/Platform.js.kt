package `in`.dev.ne.receipe.app

class jsPlatform: Platform {
    override val name: String = "Web with Kotlin/js"
}

actual fun getPlatform(): Platform = jsPlatform()