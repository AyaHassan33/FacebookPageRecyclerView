package com.example.facebook_page_recycleview_by_kotlin.model

data class PostItemModel(
    val userName: String,
    val imageProfile:Int,
    val postTime: String,
    val postText:String,
    val postLink: String,
    val imagePost:Int,
    val likeCount: String,
    val commentAndShareCount:String

)