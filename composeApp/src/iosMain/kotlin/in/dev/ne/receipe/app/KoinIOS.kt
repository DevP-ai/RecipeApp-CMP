package `in`.dev.ne.receipe.app

import `in`.dev.ne.receipe.app.dbFactory.DatabaseFactory
import `in`.dev.ne.receipe.app.di.initKoin
import org.koin.dsl.module

val iosModules = module {
    single {
        DatabaseFactory()
    }
}

fun initKoinIOS() = initKoin(additionalModule = listOf(iosModules))
