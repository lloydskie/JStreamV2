package com.jstreamv2.presentation.ui

import presentation.ui.animation.FadeInImage
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
// Coil usage replaced with FadeInImage

@Composable
fun CastMemberCard(
    photoUrl: String?,
    name: String?,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = modifier.width(100.dp).height(160.dp),
        shape = MaterialTheme.shapes.small,
        onClick = onClick
    ) {
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            FadeInImage(url = photoUrl, contentDescription = name, modifier = Modifier.height(100.dp).fillMaxWidth())
            Spacer(Modifier.height(8.dp))
            Text(
                text = name ?: "",
                style = MaterialTheme.typography.labelLarge,
                maxLines = 1,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
    }
}
