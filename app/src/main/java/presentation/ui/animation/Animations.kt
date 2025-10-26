package presentation.ui.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.ui.input.pointer.pointerInput

@Composable
fun FadeInImage(
    url: String?,
    contentDescription: String?,
    modifier: Modifier = Modifier
) {
    val transition = remember { MutableTransitionState(false) }
    transition.targetState = true

    AnimatedVisibility(
        visibleState = transition,
        enter = fadeIn(animationSpec = tween(500)),
        exit = fadeOut()
    ) {
        AsyncImage(
            model = url,
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = modifier
        )
    }
}

@Composable
fun SlideInItem(
    visible: Boolean,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    val offset = animateFloatAsState(
        targetValue = if (visible) 0f else -50f,
        animationSpec = tween(durationMillis = 400, easing = LinearOutSlowInEasing)
    )
    Box(modifier = modifier.offset(y = offset.value.dp)) {
        content()
    }
}

@Composable
fun BounceButton(onClick: () -> Unit, text: String, modifier: Modifier = Modifier) {
    val scale = remember { Animatable(1f) }
    val scope = rememberCoroutineScope()
    Button(
        onClick = {
            scope.launch {
                scale.animateTo(1.15f, animationSpec = tween(120))
                scale.animateTo(1f, animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy))
                onClick()
            }
        },
        modifier = modifier
            .scale(scale.value)
            .shadow(4.dp, RoundedCornerShape(8.dp)),
        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
    ) {
        Text(text)
    }
}

@Composable
fun LoadingSkeleton(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(Color.LightGray.copy(alpha = 0.3f), shape = RoundedCornerShape(8.dp))
            .fillMaxWidth()
            .height(180.dp)
    )
}

@Composable
fun PullToRefreshPlaceholder(onRefresh: () -> Unit, modifier: Modifier = Modifier) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Pull down to refresh", color = Color.Gray)
        Spacer(Modifier.height(8.dp))
        BounceButton(onClick = onRefresh, text = "Refresh")
    }
}

// Simple swipe detector helper
suspend fun androidx.compose.ui.input.pointer.PointerInputScope.detectSimpleSwipe(onSwipe: (Float, Float) -> Unit) {
    detectDragGestures { change, dragAmount ->
        onSwipe(dragAmount.x, dragAmount.y)
    }
}
