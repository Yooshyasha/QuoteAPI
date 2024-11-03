package com.yooshyasha.quoteapi.service.quote

import com.yooshyasha.quoteapi.QuoteRepository
import com.yooshyasha.quoteapi.model.Quote
import org.springframework.stereotype.Service

@Service
class QuoteService(
    private val quoteRepository: QuoteRepository
) {
    fun createQuote(quote: Quote): Quote {
        return quoteRepository.save(quote)
    }

    fun updateQuote(quote: Quote): Quote {
        return quoteRepository.save(quote)
    }

    fun getQuote(id: Long): Quote {
        return quoteRepository.getReferenceById(id)
    }

    fun removeQuote(id: Long) {
        quoteRepository.deleteById(id)
    }

    fun getAllQuotes(): List<Quote> {
        return quoteRepository.findAll()
    }
}