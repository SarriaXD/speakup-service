package com.sarria.speakup.controller

import com.sarria.speakup.service.VideoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class VideoController(
    private val videoService: VideoService
) {

    @GetMapping("/getVideo")
    fun getVideo(@RequestParam originalVideoPath: String): String {
        return videoService.getVideo(originalVideoPath)
    }
}