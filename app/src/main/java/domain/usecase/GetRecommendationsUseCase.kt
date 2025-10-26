package domain.usecase

import data.repository.RecommendationsRepository

class GetRecommendationsUseCase(private val repository: RecommendationsRepository) {
    suspend operator fun invoke() = repository.getRecommendations()
}
