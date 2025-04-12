package com.funnyjack.springbootgittest.service

import com.funnyjack.springbootgittest.event.TestEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class ServiceA(
    private val applicationEventPublisher: ApplicationEventPublisher
) {
    fun greeting() {
        applicationEventPublisher.publishEvent(TestEvent(this,2))
    }
}
