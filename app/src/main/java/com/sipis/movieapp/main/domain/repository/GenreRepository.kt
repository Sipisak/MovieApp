package com.sipis.movieapp.main.domain.repository

import com.sipis.movieapp.util.Resource
import com.sipis.movieapp.main.domain.models.Genre
import kotlinx.coroutines.flow.Flow

interface GenreRepository {
    suspend fun getGenres(
        fetchFromRemote: Boolean,
        type: String,
        apiKey: String
    ): Flow<Resource<List<Genre>>>
}










