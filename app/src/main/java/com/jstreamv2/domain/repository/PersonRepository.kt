package com.jstreamv2.domain.repository

import com.jstreamv2.data.model.PersonMovieCreditsResponse
import com.jstreamv2.data.model.PersonTvCreditsResponse
import kotlinx.coroutines.flow.Flow

interface PersonRepository {
    fun getPersonMovieCredits(personId: Int): Flow<Result<PersonMovieCreditsResponse>>
    fun getPersonTvCredits(personId: Int): Flow<Result<PersonTvCreditsResponse>>
}
