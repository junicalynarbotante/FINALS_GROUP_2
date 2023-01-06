package com.example.openskills.models

data class Result(
    val categories: List<Category>,
    val company: Company,
    val contents: String,
    val id: Int,
    val levels: List<Level>,
    val locations: List<Location>,
    val model_type: String,
    val name: String,
    val publication_date: String,
    val refs: Refs,
    val short_name: String,
    val tags: List<Tag>,
    val type: String
)