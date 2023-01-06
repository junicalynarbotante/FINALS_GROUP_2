package com.example.openskills.models

data class OpenSkillsModel(
    val aggregations: Aggregations,
    val items_per_page: Int,
    val page: Int,
    val page_count: Int,
    val results: List<Result>,
    val timed_out: Boolean,
    val took: Int,
    val total: Int
)