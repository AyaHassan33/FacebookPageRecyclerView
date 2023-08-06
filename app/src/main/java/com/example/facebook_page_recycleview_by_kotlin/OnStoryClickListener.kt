package com.example.facebook_page_recycleview_by_kotlin

import com.example.facebook_page_recycleview_by_kotlin.model.StoryItemModel


interface OnStoryClickListener {
    fun onStoryClick(item : StoryItemModel,position: Int)
}