package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.PersonRepository

class GetPersonCreditsUseCase(private val repository: PersonRepository) {
    fun getMovieCredits(personId: Int) = repository.getPersonMovieCredits(personId)
    fun getTvCredits(personId: Int) = repository.getPersonTvCredits(personId)
}
