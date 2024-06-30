package com.sarria.speakup.repository

import com.sarria.speakup.entity.VideoInfo
import org.springframework.data.jpa.repository.JpaRepository

interface VideoInfoRepository : JpaRepository<VideoInfo, Long>