package com.sipis.movieapp.media_details.domain.repository

import com.sipis.movieapp.main.domain.models.Media
import com.sipis.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface DetailsRepository {

    suspend fun getDetails(
        type: String,
        isRefresh: Boolean,
        id: Int,
        apiKey: String
    ): Flow<Resource<Media>>

}










