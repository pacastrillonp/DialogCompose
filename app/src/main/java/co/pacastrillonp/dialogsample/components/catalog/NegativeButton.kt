package co.pacastrillonp.dialogsample.components.catalog

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NegativeButton(
    text: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(150.dp)
            .padding(end = 5.dp),
        shape = RoundedCornerShape(5.dp),
        border = BorderStroke(0.1.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    ) {
        Text(text = text, fontSize = 20.sp, color = Color.Black)
    }
}