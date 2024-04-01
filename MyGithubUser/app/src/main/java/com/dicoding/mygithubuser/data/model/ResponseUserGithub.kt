package com.dicoding.mygithubuser.data.model

data class ResponseUserGithub(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)