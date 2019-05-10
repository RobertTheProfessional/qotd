package com.ellipsis.demo.qotd.controllers

import com.ellipsis.demo.qotd.domain.QuoteEntity
import com.ellipsis.demo.qotd.services.QuoteService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/quotes")
class QuoteController(val service: QuoteService) {

    @GetMapping
    fun getQuote(): QuoteEntity {
        return QuoteEntity(service.getQuote())
    }

}