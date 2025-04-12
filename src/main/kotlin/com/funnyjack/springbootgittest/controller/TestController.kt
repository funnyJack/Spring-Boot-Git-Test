package com.funnyjack.springbootgittest.controller

import com.funnyjack.springbootgittest.service.ServiceA
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class TestController(
    private val serviceA: ServiceA
) {
    @GetMapping("/greeting")
    fun greeting(){
        serviceA.greeting()
    }
}
