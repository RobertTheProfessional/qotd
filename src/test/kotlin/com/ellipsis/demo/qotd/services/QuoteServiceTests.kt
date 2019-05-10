package com.ellipsis.demo.qotd.services

import com.ellipsis.demo.qotd.quotes.AngelouQuotes
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@SpringBootTest
@RunWith(SpringRunner::class)
class QuoteServiceTests {

    @Autowired
    private lateinit var service: QuoteService

    @Test
    fun `Is the author correct?`() {
        Assert.assertEquals("Maya Angelou", service.getQuote().author)
    }

    @Test
    fun `Is the first quote correct?`() {
        Assert.assertEquals("I’ve learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.", service.getQuote().message)
    }

    @Test
    fun `Is the first quote and third quote unequal?`() {
        Assert.assertNotEquals(AngelouQuotes.quotes.last(), AngelouQuotes.quotes.first())
    }

}