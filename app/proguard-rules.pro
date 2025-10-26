# ProGuard rules for JStreamV2
# Keep rules can be added here as needed.

# Retrofit / OkHttp
-keep class okhttp3.** { *; }
-dontwarn okhttp3.**

# Retrofit annotations and service interfaces
-keepattributes Signature
-keepattributes *Annotation*
-keep class retrofit2.** { *; }
-dontwarn retrofit2.**

# Gson
-keep class com.google.gson.stream.** { *; }
-keep class com.google.gson.** { *; }
-dontwarn com.google.gson.**

# Room (keep entities, DAOs, and the generated classes)
-keepclassmembers class * extends androidx.room.RoomDatabase {
	public static <fields> *;
}
-keepclassmembers class * {
	@androidx.room.* <methods>;
}
-keep class androidx.room.** { *; }

# Hilt / Dagger
-keep class dagger.hilt.** { *; }
-keep class dagger.** { *; }
-dontwarn dagger.hilt.**

# Kotlin coroutines
-dontwarn kotlinx.coroutines.**

# Keep models used by reflection (Gson, Moshi) - update package names as needed
-keepclassmembers class * {
	@com.google.gson.annotations.SerializedName <fields>;
}

# Keep generated code
-keep class **_Impl { *; }

# Keep Parcelable implementations
-keepclassmembers class * implements android.os.Parcelable {
	public static final android.os.Parcelable$Creator CREATOR;
}

# Keep BuildConfig fields (so API keys referenced via BuildConfig are preserved)
-keep class **.BuildConfig { *; }

# General: do not obfuscate model classes used by JSON serialization (adjust package)
-keep class data.model.** { *; }
