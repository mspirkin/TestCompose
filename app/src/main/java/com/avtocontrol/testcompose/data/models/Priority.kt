package com.avtocontrol.testcompose.data.models

import androidx.compose.ui.graphics.Color
import com.avtocontrol.testcompose.ui.theme.HighPriorityColor
import com.avtocontrol.testcompose.ui.theme.LowPriorityColor
import com.avtocontrol.testcompose.ui.theme.MediumPriorityColor
import com.avtocontrol.testcompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}