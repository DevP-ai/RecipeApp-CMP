package `in`.dev.ne.receipe.app.di

import `in`.dev.ne.receipe.app.dbFactory.DatabaseFactory
import org.koin.dsl.module

val jsModule = module {
    single {
        DatabaseFactory()
    }
}

fun initKoinJs() = initKoin(additionalModule = listOf(jsModule))