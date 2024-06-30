package com.sarria.speakup.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@FeignClient(name = "videoTransformClient", url = "http://video-transform-service:1234")
interface VideoTransformClient {
    @GetMapping("/video_transform")
    fun callVideoTransform(@RequestParam originalVideoPath: String): String
}