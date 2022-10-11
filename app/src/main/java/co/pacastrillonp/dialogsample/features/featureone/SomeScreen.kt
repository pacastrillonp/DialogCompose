package co.pacastrillonp.dialogsample.features.featureone

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import co.pacastrillonp.dialogsample.components.CompleteDialogContent

@Composable
fun DialogUpdateApplication(dvm: SomeScreenViewModel = viewModel()) {

    // Dialog state Manager
    val dialogState = remember {
        mutableStateOf(false)
    }

    // Code to Show and Dismiss Dialog
    if (dialogState.value) {
        Dialog(
            onDismissRequest = { dialogState.value = false },
            content = {
                CompleteDialogContent("New Version",
                    {
                        dvm.doSomethingMore()
                        dialogState.value = false
                    },
                    {
                        dvm.doSomething()
                    })
            },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            )
        )
    }

    // Show UI - In this case, we will be using just to show button
    Row(
        modifier = Modifier
            .fillMaxHeight(1f)
            .fillMaxWidth(1f),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            dialogState.value = true
        }) {
            Text(text = "Show Dialog", fontSize = 22.sp)
        }
    }
}
