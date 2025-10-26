package com.jstreamv2.presentation.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight

@Composable
fun SettingsScreen(
    storageUsage: String,
    autoPlayTrailers: Boolean,
    onClearCache: () -> Unit,
    onClearSearchHistory: () -> Unit,
    onToggleAutoPlay: (Boolean) -> Unit,
    onReset: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text("Settings", style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(24.dp))
        Text("Storage Usage: $storageUsage", style = MaterialTheme.typography.bodyMedium)
        Spacer(Modifier.height(16.dp))
        Button(onClick = onClearCache, modifier = Modifier.fillMaxWidth()) {
            Text("Clear Cache")
        }
        Spacer(Modifier.height(8.dp))
        Button(onClick = onClearSearchHistory, modifier = Modifier.fillMaxWidth()) {
            Text("Clear Search History")
        }
        Spacer(Modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Auto-play Trailers", modifier = Modifier.weight(1f))
            Switch(checked = autoPlayTrailers, onCheckedChange = onToggleAutoPlay)
        }
        Spacer(Modifier.height(24.dp))
        Button(onClick = onReset, colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error), modifier = Modifier.fillMaxWidth()) {
            Text("Reset App", color = MaterialTheme.colorScheme.onError)
        }
    }
}
