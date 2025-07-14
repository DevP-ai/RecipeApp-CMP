package `in`.dev.ne.receipe.app.di

import `in`.dev.ne.receipe.app.dbFactory.DatabaseFactory
import org.koin.dsl.module

val jvmModule = module {
    single {
        DatabaseFactory()
    }
}

fun initKoinJvm() = initKoin(additionalModule = listOf(jvmModule))
