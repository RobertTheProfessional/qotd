package com.ellipsis.demo.qotd.services

import com.ellipsis.demo.qotd.domain.Quote
import com.ellipsis.demo.qotd.quotes.AngelouQuotes
import org.springframework.stereotype.Service

@Service
class QuoteService {

    fun getQuote(): Quote {

        val message = AngelouQuotes.quotes.first()
        val author = AngelouQuotes.author

        return Quote(author, message)

    }

}