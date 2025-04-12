package com.funnyjack.springbootgittest.service

import com.funnyjack.springbootgittest.event.TestEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class ServiceB {
    @EventListener
    fun handleTestEvent(event: TestEvent) {
        println("ServiceB received number is: ${event.number}")
    }
}
