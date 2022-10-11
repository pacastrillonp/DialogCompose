package co.pacastrillonp.dialogsample.features.featureone

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.viewmodel.compose.viewModel
import co.pacastrillonp.dialogsample.components.UpdateDialogContent
import co.pacastrillonp.dialogsample.components.dialog.CustomDialogViewModel

@Composable
fun CustomDialog(
    customDialogViewModel: CustomDialogViewModel = viewModel(),
    dialogState: MutableState<Boolean>
) {
    if (dialogState.value) {
        Dialog(
            onDismissRequest = { dialogState.value = false },
            content = {
                UpdateDialogContent("New Version",
                    {
                        customDialogViewModel.doSomethingMore()
                        dialogState.value = false
                    },
                    {
                        customDialogViewModel.doSomething()
                    })
            },
            properties = DialogProperties(
                dismissOnBackPress = false,
                dismissOnClickOutside = false
            )
        )
    }
}
