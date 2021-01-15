package com.example.poccronjob

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocCronJobApplication

fun main(args: Array<String>) {
	runApplication<PocCronJobApplication>(*args)
}
