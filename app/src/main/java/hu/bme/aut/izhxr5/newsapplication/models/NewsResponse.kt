package hu.bme.aut.izhxr5.newsapplication.models

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)