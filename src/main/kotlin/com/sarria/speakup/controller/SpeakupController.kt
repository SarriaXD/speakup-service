package com.sarria.speakup.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SpeakupController {

    @GetMapping("hello/{text}")
    fun sayHello(@PathVariable("text") text: String): String {
        return text
    }
}