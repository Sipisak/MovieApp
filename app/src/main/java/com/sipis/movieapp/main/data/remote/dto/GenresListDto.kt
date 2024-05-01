package com.sipis.movieapp.main.data.remote.dto

import com.sipis.movieapp.main.domain.models.Genre

data class GenresListDto(
    val genres: List<Genre>
)