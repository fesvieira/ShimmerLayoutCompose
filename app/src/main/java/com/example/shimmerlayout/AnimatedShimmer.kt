package com.example.shimmerlayout

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ShimmerGridItem() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 10.dp)
    ) {
        Spacer(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .shimmer()
        )
        Column(modifier = Modifier.padding(start = 16.dp)) {
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .shimmer()
            )
            Spacer(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .height(20.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .shimmer()
            )
        }
    }
}

@Preview
@Composable
fun Aoba() {
    ShimmerGridItem()
}