# JStream V2

A Netflix-like streaming app for Android using MVVM and Clean Architecture.

## Project Structure
```
app/src/main/java/com/jstreamv2/
├── data/
│   ├── local/         # Room database, DAOs
│   ├── remote/        # Retrofit API services
│   ├── repository/    # Repository implementations
│   └── model/         # DTOs and entities
├── domain/
│   ├── model/         # Domain models
│   ├── repository/    # Repository interfaces
│   └── usecase/       # Business logic use cases
├── presentation/
│   ├── ui/            # Composable screens
│   ├── viewmodel/     # ViewModels
│   ├── navigation/    # Navigation setup
│   └── theme/         # Material3 theme
├── di/                # Hilt modules
└── util/              # Utilities, constants, extensions
```

## Dependencies
- MVVM, Clean Architecture
- Hilt (DI)
- Jetpack Navigation Component
- Jetpack Compose (Material3)
- Retrofit + OkHttp
- Coil
- Room
- WebView
- Kotlin Coroutines + Flow

## Setup
1. Ensure JDK 17 is installed and configured.
2. Clone the repository.
3. Run `./gradlew build` to verify dependencies.
4. Open in Android Studio (Arctic Fox or newer).

## Architecture
- Data layer: Handles local/remote data sources and repository implementations.
- Domain layer: Contains business logic and domain models.
- Presentation layer: UI, navigation, and ViewModels.
- DI: Hilt modules for dependency injection.
- Util: Shared utilities and extensions.
