package com.example.poccronjob

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("/pocCronJob")
class PocCronJobController {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @GetMapping
    fun test() {
        log.info("CronJob test: ${LocalDateTime.now()}")
    }
}