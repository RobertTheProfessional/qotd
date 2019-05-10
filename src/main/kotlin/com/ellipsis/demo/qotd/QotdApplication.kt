package com.ellipsis.demo.qotd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QotdApplication

fun main(args: Array<String>) {
    runApplication<QotdApplication>(*args)
}
