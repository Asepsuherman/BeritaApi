package id.utdi.asepsuherman.beritaapi.model

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)