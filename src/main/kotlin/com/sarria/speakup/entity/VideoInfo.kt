package com.sarria.speakup.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class VideoInfo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val originalVideoPath: String,
    val finalVideoPath: String?,
    val isProcessing: Boolean?
)