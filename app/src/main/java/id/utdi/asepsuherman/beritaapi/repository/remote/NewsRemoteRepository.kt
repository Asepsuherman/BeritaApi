package id.utdi.asepsuherman.beritaapi.repository.remote

import id.utdi.asepsuherman.beritaapi.api.RetrofitInstance

class NewsRemoteRepository {

    suspend fun getHeadlines(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getHeadlines(countryCode, pageNumber)

    suspend fun search(query: String, pageNumber: Int) =
        RetrofitInstance.api.search(query, pageNumber)

}