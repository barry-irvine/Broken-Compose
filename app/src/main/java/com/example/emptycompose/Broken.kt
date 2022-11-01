package com.example.emptycompose

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Suppress("unused")
inline fun largeIcon(
    name: String,
    block: ImageVector.Builder.() -> ImageVector.Builder
) = ImageVector.Builder(
    name = name,
    defaultWidth = 80.dp,
    defaultHeight = 80.dp,
    viewportWidth = 80f,
    viewportHeight = 80f
).block().build()
