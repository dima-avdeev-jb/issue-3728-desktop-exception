import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    val list = mutableStateListOf(*(1..10).toList().toTypedArray())
    application {
        Window(visible = true, onCloseRequest = {
            exitApplication()
        }) {
            Column {
                for (i in list) {
                    key(i) {
                        Button(
                            onClick = { list.remove(i) }
                        ) {
                            Text("Remove $i")
                        }
                    }
                }
            }
        }
    }
}
