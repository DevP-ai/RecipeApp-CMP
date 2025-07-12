package `in`.dev.ne.receipe.app.di

import org.koin.dsl.module

val jvmModule = module {

}

fun initKoinJvm() = initKoin(additionalModule = listOf(jvmModule))
