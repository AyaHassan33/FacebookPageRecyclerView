package com.example.facebook_page_recycleview_by_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.facebook_page_recycleview_by_kotlin.OnStoryClickListener
import com.example.facebook_page_recycleview_by_kotlin.R
import com.example.facebook_page_recycleview_by_kotlin.model.StoryItemModel

class StoryItemAdapter(val storyData:ArrayList<StoryItemModel>):Adapter<StoryItemAdapter.StoryViewHolder>() {

    var onStoryClickListener :OnStoryClickListener?=null

    class StoryViewHolder(view: View) : ViewHolder(view){
        val text: TextView =view.findViewById(R.id.user_name_store)
        val imageStory: ImageView =view.findViewById(R.id.story_image)
        val imageProfileStory: ImageView =view.findViewById(R.id.profile_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        return StoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.story_item_layout,parent,false))
    }

    override fun getItemCount(): Int {
        return storyData.size
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.text.text=storyData.get(position).userNameStory
        holder.imageStory.setImageResource(storyData.get(position).storyImage)
        holder.imageProfileStory.setImageResource(storyData.get(position).profileImage)
        holder.imageStory.setOnClickListener{
            onStoryClickListener?.onStoryClick(storyData.get(position),position)
        }
    }
}