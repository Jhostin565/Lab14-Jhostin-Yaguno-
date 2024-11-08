package com.example.lab14

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondScreen()
        }
    }

    @Composable
    fun SecondScreen() {
        Column(
            modifier = androidx.compose.ui.Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
        ) {
            Text(text = "Segunda Actividad", modifier = androidx.compose.ui.Modifier.padding(16.dp), style = MaterialTheme.typography.titleLarge)
            Text(text = "¿A dónde quieres dirigirte?", modifier = androidx.compose.ui.Modifier.padding(16.dp))
            Button(onClick = {
                // Navegar a MainActivity
                val intent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intent)
            }) {
                Text(text = "Página Principal")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewSecondScreen() {
        SecondScreen()
    }
}
