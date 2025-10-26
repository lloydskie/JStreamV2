package com.jstreamv2.presentation.ui

import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GenreChip(
    genre: String,
    selected: Boolean = false,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    AssistChip(
        onClick = onClick,
        label = { Text(genre) },
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    )
}
