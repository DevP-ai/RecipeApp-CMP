package `in`.dev.ne.receipe.app

import `in`.dev.ne.receipe.app.di.initKoin
import org.koin.dsl.module

val iosModules = module {

}

fun initKoinIOS() = initKoin(additionalModule = listOf(iosModules))
