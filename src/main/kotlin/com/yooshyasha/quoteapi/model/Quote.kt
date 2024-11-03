package com.yooshyasha.quoteapi.model

import jakarta.persistence.*

@Entity
@Table(name = "quotes")
data class Quote (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var author: String = "",
    var text: String = "",
    var category: String = "",
)