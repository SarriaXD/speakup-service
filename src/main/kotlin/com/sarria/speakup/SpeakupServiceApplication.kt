package com.sarria.speakup

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpeakupServiceApplication

fun main(args: Array<String>) {
    runApplication<SpeakupServiceApplication>(*args)
}
