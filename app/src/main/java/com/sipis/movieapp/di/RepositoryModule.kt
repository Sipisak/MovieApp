package com.sipis.movieapp.di

import com.sipis.movieapp.media_details.data.repository.DetailsRepositoryImpl
import com.sipis.movieapp.media_details.data.repository.ExtraDetailsRepositoryImpl
import com.sipis.movieapp.media_details.domain.repository.DetailsRepository
import com.sipis.movieapp.media_details.domain.repository.ExtraDetailsRepository
import com.sipis.movieapp.main.data.repository.GenreRepositoryImpl
import com.sipis.movieapp.main.data.repository.MediaRepositoryImpl
import com.sipis.movieapp.search.data.repository.SearchRepositoryImpl
import com.sipis.movieapp.main.domain.repository.GenreRepository
import com.sipis.movieapp.main.domain.repository.MediaRepository
import com.sipis.movieapp.search.domain.repository.SearchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMediaRepository(
        mediaRepositoryImpl: MediaRepositoryImpl
    ): MediaRepository

    @Binds
    @Singleton
    abstract fun bindSearchRepository(
        searchRepositoryImpl: SearchRepositoryImpl
    ): SearchRepository

    @Binds
    @Singleton
    abstract fun bindGenreRepository(
        genreRepositoryImpl: GenreRepositoryImpl
    ): GenreRepository

    @Binds
    @Singleton
    abstract fun bindDetailsRepository(
        detailsRepositoryImpl: DetailsRepositoryImpl
    ): DetailsRepository

    @Binds
    @Singleton
    abstract fun bindExtraDetailsRepository(
       extraDetailsRepositoryImpl: ExtraDetailsRepositoryImpl
    ): ExtraDetailsRepository

}
