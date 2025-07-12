package `in`.dev.ne.receipe.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform