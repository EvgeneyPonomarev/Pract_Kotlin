package com.example.pr_8

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
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var aState by rememberSaveable { mutableStateOf("") }
            var bState by rememberSaveable { mutableStateOf("") }
            var resultState by rememberSaveable { mutableStateOf("") }

            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                OutlinedTextField(
                    value = aState,
                    onValueChange = { aState = it },
                    label = { Text("A") }
                )

                OutlinedTextField(
                    value = bState,
                    onValueChange = { bState = it },
                    label = { Text("B") }
                )

                Button(onClick = {
                    val a = aState.toDoubleOrNull()
                    val b = bState.toDoubleOrNull()

                    resultState = if (a != null && b != null) {
                        MakeSolution(a, b)
                    } else {
                        "Ошибка: введите корректные числа"
                    }
                }) {
                    Text("Рассчитать")
                }

                Text(resultState)
            }
        }
    }
}

fun MakeSolution(a: Double, b: Double): String {
    return if (a == 0.0) {
        if (b >= 0.0) {
            "Множество значений"
        } else {
            "Нет решений"
        }
    } else if (a > 0.0) {
        val res = -b / a
        if (res.isFinite())
            "x >= $res"
        else {
            "Переполнение"
        }
    } else {
        val res = -b / a
        if (res.isFinite())
            "x <= $res"
        else {
            "Переполнение"
        }
    }
}
