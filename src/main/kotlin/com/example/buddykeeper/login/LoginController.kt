package com.example.buddykeeper.login

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoginController {

    @GetMapping("/")
    fun entryRedirect() : String{
        return "Hello World"
    }

    @GetMapping("/login")
    fun login() : String{
        return "You are in Login"
    }
}