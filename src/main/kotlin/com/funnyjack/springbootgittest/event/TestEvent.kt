package com.funnyjack.springbootgittest.event

import org.springframework.context.ApplicationEvent

class TestEvent(source:Any, val number:Int): ApplicationEvent(source)
