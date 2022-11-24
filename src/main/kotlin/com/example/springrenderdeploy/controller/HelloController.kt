package com.example.springrenderdeploy.controller

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {
    @GetMapping(path = ["/"])
    fun hello(model: Model): String {
        return "hello!"
    }
}
