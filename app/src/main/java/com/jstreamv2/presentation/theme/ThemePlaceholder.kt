
package com.jstreamv2.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun AppTheme(content: @Composable () -> Unit) {
	MaterialTheme(
		// Add colorScheme, typography, shapes if needed
		content = content
	)
}
