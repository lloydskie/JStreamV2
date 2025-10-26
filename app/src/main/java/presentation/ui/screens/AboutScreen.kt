package com.jstreamv2.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutScreen(
    appVersion: String,
    developerName: String,
    privacyPolicy: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
    // App logo placeholder
    Box(modifier = Modifier.size(96.dp).background(MaterialTheme.colorScheme.primary))
        Spacer(Modifier.height(16.dp))
        Text("JStream V2", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Version $appVersion", fontSize = 16.sp, color = MaterialTheme.colorScheme.primary)
        Spacer(Modifier.height(24.dp))
        Text("About the Developer", fontWeight = FontWeight.Bold)
        Text(developerName, fontSize = 16.sp)
        Spacer(Modifier.height(24.dp))
        Text("Privacy Policy", fontWeight = FontWeight.Bold)
        Text(privacyPolicy, fontSize = 14.sp, modifier = Modifier.padding(horizontal = 32.dp))
    }
}
