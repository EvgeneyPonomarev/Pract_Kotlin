package com.example.pr_10


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var aState by rememberSaveable { mutableStateOf("") }
            var bState by rememberSaveable { mutableStateOf("") }
            var resultState by rememberSaveable { mutableStateOf("") }
            val messageMap = mapOf(
                "multipleValues" to getString(R.string.Many),
                "noSolutions" to getString(R.string.Nootvet),
                "overflow" to getString(R.string.Perepol),
                "invalidInput" to getString(R.string.NoCorrect)
            )

            Column(

                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedTextField( modifier = Modifier.testTag("vvoda"),
                    value = aState,
                    onValueChange = { aState = it },
                    label = { Text("A") }
                )

                OutlinedTextField(modifier = Modifier.testTag("vvodb"),
                    value = bState,
                    onValueChange = { bState = it },
                    label = { Text("B") }
                )

                Button(modifier = Modifier.testTag("button"), onClick = {
                    val a = aState.toDoubleOrNull()
                    val b = bState.toDoubleOrNull()

                    resultState = if (a != null && b != null) {
                        if (a == 0.0) {
                            if (b >= 0.0) {
                                messageMap["multipleValues"] ?: ""
                            } else {
                                messageMap["noSolutions"] ?: ""
                            }
                        } else
                        Math().MakeSolution(a, b)
                    } else {
                        messageMap["invalidInput"] ?: ""
                    }
                }) {
                    Text(getString(R.string.Rashets))
                }

                Text(resultState, modifier= Modifier.testTag("result1"))
            }
        }
    }
}
class Math{
fun MakeSolution(a: Double, b: Double): String {
    var res=0.0
     if (a > 0.0) {
        res= -b / a
        if (res.isFinite())
            "x >= $res"
    } else {
        val res = -b / a
        if (res.isFinite())
            "x <= $res"
    }
    return res.toString()
}
}
