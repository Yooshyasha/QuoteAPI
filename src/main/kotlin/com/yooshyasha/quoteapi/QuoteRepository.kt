package com.yooshyasha.quoteapi

import com.yooshyasha.quoteapi.model.Quote
import org.springframework.data.jpa.repository.JpaRepository

interface QuoteRepository : JpaRepository<Quote, Long>