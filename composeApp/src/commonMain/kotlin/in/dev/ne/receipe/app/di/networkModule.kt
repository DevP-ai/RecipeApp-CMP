package `in`.dev.ne.receipe.app.di

import `in`.dev.ne.receipe.app.features.common.data.api.httpClient
import io.ktor.client.HttpClient
import org.koin.dsl.module

fun networkModule() = module {
    single <HttpClient>{
        httpClient
    }
}