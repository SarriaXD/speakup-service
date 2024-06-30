package com.sarria.speakup.service

import com.sarria.speakup.entity.VideoInfo
import com.sarria.speakup.repository.VideoInfoRepository
import org.springframework.stereotype.Service

@Service
class VideoService(
    private val videoTransformClient: VideoTransformClient,
    private val videoInfoRepository: VideoInfoRepository
) {

    fun getVideos(): List<VideoInfo> {
        return videoInfoRepository.findAll()
    }

    fun getVideo(originalVideoPath: String): String {
        val videoTransformResult = videoTransformClient.callVideoTransform(originalVideoPath)
        val videoInfo = VideoInfo(originalVideoPath = originalVideoPath, finalVideoPath = videoTransformResult, isProcessing = false)
        videoInfoRepository.save(videoInfo)
        return "$videoInfo"
    }
}