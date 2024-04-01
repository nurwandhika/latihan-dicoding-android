package com.dicoding.mygithubuser.data.remote

import com.dicoding.mygithubuser.data.model.ResponseUserGithub
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface GithubService {

    @GET("search/users?q=nurwan")
    suspend fun getUserGithub(@QueryMap map: Map<String, Any>):ResponseUserGithub
}