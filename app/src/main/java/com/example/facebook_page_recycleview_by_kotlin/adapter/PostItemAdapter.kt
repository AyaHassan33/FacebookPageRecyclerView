package com.example.facebook_page_recycleview_by_kotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.facebook_page_recycleview_by_kotlin.R
import com.example.facebook_page_recycleview_by_kotlin.model.PostItemModel

class PostItemAdapter(val postData:ArrayList<PostItemModel>) :Adapter<PostItemAdapter.PostViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_item_layout,parent,false))
    }

    override fun getItemCount(): Int {
       return postData.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.userName.text=postData.get(position).userName
        holder.postText.text=postData.get(position).postText
        holder.postLink.text=postData.get(position).postLink
        holder.postTime.text=postData.get(position).postTime
        holder.likeCount.text=postData.get(position).likeCount
        holder.commentAndShareCount.text=postData.get(position).commentAndShareCount
        holder.imagePost.setImageResource(postData.get(position).imagePost)
        holder.imageProfile.setImageResource(postData.get(position).imageProfile)
    }


    class PostViewHolder(view: View) : ViewHolder(view){
        val userName:TextView=view.findViewById(R.id.user_name)
        val imageProfile:ImageView=view.findViewById(R.id.image_profile)
        val postTime:TextView=view.findViewById(R.id.post_time)
        val postText:TextView=view.findViewById(R.id.post_text)
        val postLink:TextView=view.findViewById(R.id.link_post)
        val imagePost:ImageView=view.findViewById(R.id.image_post)
        val likeCount:TextView=view.findViewById(R.id.like_count)
        val commentAndShareCount:TextView=view.findViewById(R.id.count_comment_and_share)
    }



}