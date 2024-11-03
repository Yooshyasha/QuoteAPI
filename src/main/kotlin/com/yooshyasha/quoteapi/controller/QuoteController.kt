package com.yooshyasha.quoteapi.controller

import com.yooshyasha.quoteapi.model.Quote
import com.yooshyasha.quoteapi.service.quote.QuoteService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/quote")
class QuoteController(
    private val quoteService: QuoteService
) {
    @PostMapping("/saveQuote")
    fun saveQuote(@RequestBody quote: Quote) : ResponseEntity<Quote> {
        quoteService.createQuote(quote)

        return ResponseEntity.ok(quote)
    }

    @GetMapping("/getQuote/{id}")
    fun getQuote(@PathVariable id: Long) : ResponseEntity<Quote> {
        return ResponseEntity.ok(quoteService.getQuote(id))
    }

    @GetMapping("/getAllQuotes")
    fun getAllQuotes(): ResponseEntity<List<Quote>> {
        return ResponseEntity.ok(quoteService.getAllQuotes())
    }

    @PutMapping("/updateQuote")
    fun updateQuote(@RequestBody quote: Quote) : ResponseEntity<Quote> {
        return ResponseEntity.ok(quoteService.updateQuote(quote))
    }

    @DeleteMapping("/removeQuote/{id}")
    fun removeQuote(@PathVariable id: Long) {
        quoteService.removeQuote(id)
    }
}