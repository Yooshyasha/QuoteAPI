package com.yooshyasha.quoteapi.model

import jakarta.persistence.GeneratedValue
import org.springframework.data.annotation.Id

data class Quote (
    @Id @GeneratedValue
    var id: Long = 0L,

    var author: String = "",
    var text: String = "",
    var category: String = "",
)