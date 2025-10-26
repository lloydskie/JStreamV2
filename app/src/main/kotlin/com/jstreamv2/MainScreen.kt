package com.jstreamv2

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen(mainViewModel: MainViewModel = viewModel()) {
    val message by mainViewModel.message.observeAsState("Hello JStreamV2!")
    Surface { Text(text = message) }
}
