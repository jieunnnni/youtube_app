package com.example.youtube_app.service

import com.example.youtube_app.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/cbb293eb-e8b2-4079-ba82-472d1c0419d1")
    fun listVideos(): Call<VideoDto>
}