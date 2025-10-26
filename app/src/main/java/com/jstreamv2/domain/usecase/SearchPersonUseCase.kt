package com.jstreamv2.domain.usecase

import com.jstreamv2.domain.repository.SearchRepository

class SearchPersonUseCase(private val repository: SearchRepository) {
    operator fun invoke(query: String, page: Int = 1) = repository.searchPerson(query, page)
}
