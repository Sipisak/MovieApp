package com.sipis.movieapp.search.domain.repository

import com.sipis.movieapp.util.Resource
import com.sipis.movieapp.main.domain.models.Media
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchList(
        fetchFromRemote: Boolean,
        query: String,
        page: Int,
        apiKey: String
    ): Flow<Resource<List<Media>>>

}










