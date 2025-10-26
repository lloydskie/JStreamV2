Release preparation

1) Update version in `app/build.gradle` (done: versionCode=2, versionName=1.1.0)

2) Generate Signed AAB
   - Create `keystore.properties` (local, not committed) containing keystore path and passwords.
   - Add signingConfigs to `app/build.gradle` and reference `keystore.properties`.
   - Build signed AAB: `./gradlew bundleRelease` or via Android Studio: Build > Generate Signed Bundle / APK.

3) Testing checklist
   - Test on API levels 26, 29, 30, 33
   - Test on at least one low-memory device
   - Verify offline mode, My List, Search, Player, deep links

4) Store listing checklist
   - App title and short description
   - Full description mentioning: no file storage, only 3rd party links (TMDB, Vidking)
   - At least 5 screenshots (phone & tablet variations)
   - Feature graphic (1024x500)
   - Privacy policy URL (mention TMDB and Vidking usage)

5) Privacy policy notes
   - Explain what data is collected (search history, favorites stored locally)
   - Link to TMDB/third-party policies for content and tracking used by remote services

6) Compliance
   - Ensure no copyrighted content is distributed (streaming uses third-party links)
   - Follow Google Play policies for advertising and permissions

7) Post-release
   - Monitor crash reports and ANRs
   - Rotate API keys if necessary and avoid committing them
