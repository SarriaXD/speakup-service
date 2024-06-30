package com.sarria.speakup.service

import org.springframework.stereotype.Service

@Service
class VideoService(
    private val videoTransformClient: VideoTransformClient
) {

    fun getVideo(originalVideoPath: String): String {
        return videoTransformClient.callVideoTransform(originalVideoPath)
    }
}