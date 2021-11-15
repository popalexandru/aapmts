package com.example.reposiroty

import org.litote.kmongo.coroutine.CoroutineDatabase

class TestRepo(
    db: CoroutineDatabase
) {
    private val tests = db.getCollection<String>()

    suspend fun addSomethingInDb(){
        tests.insertOne("testing")
    }
}