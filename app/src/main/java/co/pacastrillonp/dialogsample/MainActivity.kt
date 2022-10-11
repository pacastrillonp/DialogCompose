package co.pacastrillonp.dialogsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import co.pacastrillonp.dialogsample.features.featureone.DialogUpdateApplication
import co.pacastrillonp.dialogsample.ui.theme.DialogSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DialogSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    DialogUpdateApplication()
                }
            }
        }
    }
}
