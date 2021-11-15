package com.example.di

import com.example.reposiroty.TestRepo
import com.example.utils.Constants
import org.koin.dsl.module
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo



val mainModule = module {
    single {
        val client = KMongo.createClient("mongodb+srv://sutzu:alumil@cluster0.jjuyk.mongodb.net/"+Constants.DB_NAME+"?retryWrites=true&w=majority").coroutine
        client.getDatabase(Constants.DB_NAME)
    }

    single<TestRepo>{
        TestRepo(get())
    }
}