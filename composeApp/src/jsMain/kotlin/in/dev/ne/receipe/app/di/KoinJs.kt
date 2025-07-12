package `in`.dev.ne.receipe.app.di

import `in`.dev.ne.receipe.app.di.initKoin
import org.koin.dsl.module

val jsModule = module {

}

fun initKoinJs() = initKoin(additionalModule = listOf(jsModule))