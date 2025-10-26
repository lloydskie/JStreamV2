API keys and secrets

- Do NOT commit API keys to source control.
- Use `gradle.properties` (local) and BuildConfig fields to inject keys at build time.

Example (root `gradle.properties` - local only):

TMDB_API_KEY=your_tmdb_api_key_here

In `app/build.gradle`:

android {
    defaultConfig {
        buildConfigField "String", "TMDB_API_KEY", '"' + (project.hasProperty('TMDB_API_KEY') ? project.property('TMDB_API_KEY') : "") + '"'
    }
}

Access via `BuildConfig.TMDB_API_KEY` in code.

For production secrets consider using Android Keystore and remote secret management.
