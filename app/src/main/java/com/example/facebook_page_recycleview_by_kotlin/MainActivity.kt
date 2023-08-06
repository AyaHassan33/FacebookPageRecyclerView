package com.example.facebook_page_recycleview_by_kotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.facebook_page_recycleview_by_kotlin.adapter.PostItemAdapter
import com.example.facebook_page_recycleview_by_kotlin.adapter.StoryItemAdapter
import com.example.facebook_page_recycleview_by_kotlin.model.PostItemModel
import com.example.facebook_page_recycleview_by_kotlin.model.StoryItemModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerViewPost: RecyclerView
    lateinit var postItemAdapter: PostItemAdapter
    lateinit var postDataArray:ArrayList<PostItemModel>
    lateinit var recyclerViewStory:RecyclerView
    lateinit var storyData:ArrayList<StoryItemModel>
    lateinit var storyDataAdapter: StoryItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewPost=findViewById(R.id.post_recycle_view)
        recyclerViewStory=findViewById(R.id.recycler_stories)
        initDataPost()
        postItemAdapter= PostItemAdapter(postDataArray)
        recyclerViewPost.adapter=postItemAdapter
        createAdapterOfStory()

    }

    fun initDataPost(){
        postDataArray= ArrayList()
        postDataArray.add(PostItemModel("aya",R.drawable.ic_image_profile1,"3 hr "
            ,getString(R.string.post_text_aya),"https://techterms.com/definition/android",R.drawable.android,
            "40k","1.8k comments . 10 share"))
        postDataArray.add(PostItemModel("manna",R.drawable.ic_smail_face,"1 min ",
            getString(R.string.fullstack_def),"https://www.w3schools.com/whatis/whatis_fullstack.",
            R.drawable.fullstack,"3k","1.8k comments . 10 share"))
        postDataArray.add(PostItemModel("osama",R.drawable.ic_man,"10 hr ",getString(R.string.ai_def),
            "https://ai.google/",R.drawable.ai,"588k","1.8k comments . 10 share"))
        postDataArray.add(PostItemModel("ali",R.drawable.person,"3 hr ",getString(R.string.ui_ux),
            "https://careerfoundry.com/en/blog/ux-design",R.drawable.image_post,"56k","1.8k comments . 10 share"))
        postDataArray.add(PostItemModel("alaa",R.drawable.ic_face,"9 mar ",getString(R.string.java_def),
            "https://www.java.com/",R.drawable.java,"4k", "7k comments . 400 share"))
        postDataArray.add(PostItemModel("amr",R.drawable.person,"20 hr ",getString(R.string.ios_def),
            "https://www.apple.com",R.drawable.ios,"10k","5k comments . 1k share"))

    }
    fun createAdapterOfStory(){
        initDataStory()
        storyDataAdapter=StoryItemAdapter(storyData)
        storyDataAdapter.onStoryClickListener=object :OnStoryClickListener{
            override fun onStoryClick(item: StoryItemModel, position: Int) {
                var intent = Intent(this@MainActivity,NewAppClickStory::class.java)
                startActivity(intent)
            }

        }
        recyclerViewStory.adapter=storyDataAdapter

    }

    fun initDataStory(){
        storyData= ArrayList()
        for (i in postDataArray.indices) {
            storyData.add(
                StoryItemModel(
                    postDataArray.get(i).userName,
                    postDataArray.get(i).imagePost,
                    postDataArray.get(i).imageProfile
                )
            )
        }

    }


}

/*
*



*
*
*
*
*
*
* */