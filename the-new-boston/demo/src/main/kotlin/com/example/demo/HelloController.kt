package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("api/hello")
class HelloController {

    @GetMapping("/")
    fun hello(): String = "Hello, Kotlin REST API"

}
