package presentation.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import data.repository.VideoProgressRepository;
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
public final class PlayerViewModel_Factory implements Factory<PlayerViewModel> {
  private final Provider<VideoProgressRepository> progressRepoProvider;

  public PlayerViewModel_Factory(Provider<VideoProgressRepository> progressRepoProvider) {
    this.progressRepoProvider = progressRepoProvider;
  }

  @Override
  public PlayerViewModel get() {
    return newInstance(progressRepoProvider.get());
  }

  public static PlayerViewModel_Factory create(
      Provider<VideoProgressRepository> progressRepoProvider) {
    return new PlayerViewModel_Factory(progressRepoProvider);
  }

  public static PlayerViewModel newInstance(VideoProgressRepository progressRepo) {
    return new PlayerViewModel(progressRepo);
  }
}
