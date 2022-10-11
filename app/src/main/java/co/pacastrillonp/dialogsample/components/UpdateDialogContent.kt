package co.pacastrillonp.dialogsample.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.pacastrillonp.dialogsample.components.catalog.NegativeButton
import co.pacastrillonp.dialogsample.components.catalog.PositiveButton

@Composable
fun UpdateDialogContent(
    title: String,
    onNegativeClick: () -> Unit,
    onPositiveClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxHeight(0.8f)
            .fillMaxWidth(0.8f),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(1f),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Title(title)
            DialogBody()
            BottomButtons(onNegativeClick, onPositiveClick)
        }
    }
}

@Composable
private fun Title(title: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(20.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = title, fontSize = 24.sp)
    }
}

@Composable
private fun DialogBody() {
    Box(modifier = Modifier.padding(20.dp)) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "We have a new version of the app update it to enjoy the new features",
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
private fun BottomButtons(
    onNegativeClick: () -> Unit,
    onPositiveClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(1f)
            .padding(20.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        NegativeButton(text = "Skip") { onNegativeClick() }
        PositiveButton(text = "Update") { onPositiveClick() }
    }
}


