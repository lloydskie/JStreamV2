Animations utilities

Files:
- `Animations.kt` - FadeInImage, SlideInItem, BounceButton, LoadingSkeleton, PullToRefreshPlaceholder

Integration notes:
- For shared element transitions use Accompanist Navigation Animation or MotionLayout. Example with Accompanist:
  - Add dependency: `com.google.accompanist:accompanist-navigation-animation:<version>`
  - Wrap `NavHost` with `AnimatedNavHost` and use `sharedElement` from accompanist-shared-element for elements.

Usage:
- Replace `AsyncImage` with `FadeInImage(url = ..., contentDescription = ..., modifier = ...)`.
- Use `LoadingSkeleton()` while content is loading.
- Use `SlideInItem(visible = true) { /* item */ }` for list entries.
- Use `BounceButton` for important CTA buttons.

Notes:
- These are lightweight helpers; for production add shimmer library for better skeletons and integrate proper shared element libraries for full transitions.
