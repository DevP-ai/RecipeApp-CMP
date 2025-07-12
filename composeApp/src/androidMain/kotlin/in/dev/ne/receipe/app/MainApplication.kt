package `in`.dev.ne.receipe.app

import android.app.Application
import `in`.dev.ne.receipe.app.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class MainApplication: Application() {

    private val androidModules = module {

    }
    override fun onCreate() {
        super.onCreate()
    }

    fun setUpKoin(){
        initKoin(additionalModule = listOf(androidModules)){
            androidContext(applicationContext)
        }
    }
}