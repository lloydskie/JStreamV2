package presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import domain.usecase.GetRecommendationsUseCase;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RecommendationsViewModel_Factory implements Factory<RecommendationsViewModel> {
  private final Provider<GetRecommendationsUseCase> useCaseProvider;

  public RecommendationsViewModel_Factory(Provider<GetRecommendationsUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public RecommendationsViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static RecommendationsViewModel_Factory create(
      Provider<GetRecommendationsUseCase> useCaseProvider) {
    return new RecommendationsViewModel_Factory(useCaseProvider);
  }

  public static RecommendationsViewModel newInstance(GetRecommendationsUseCase useCase) {
    return new RecommendationsViewModel(useCase);
  }
}
