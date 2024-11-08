package com.example.lab14

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.GlanceTheme
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.padding
import androidx.glance.text.Text

class SimpleWidgetContent : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            GlanceTheme {
                MyContent()
            }
        }
    }

    @Composable
    private fun MyContent() {
        Column(
            modifier = GlanceModifier.fillMaxSize()
                .background(GlanceTheme.colors.background),
            verticalAlignment = Alignment.CenterVertically, // Centra verticalmente
            horizontalAlignment = Alignment.CenterHorizontally // Centra horizontalmente
        ) {
            Text(
                text = "¿A dónde quieres dirigirte?",
                modifier = GlanceModifier.padding(12.dp) // Padding alrededor del texto
            )
            Row(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = GlanceModifier.padding(top = 12.dp) // Añadir un margen superior a la fila
            ) {
                Button(
                    text = "Página Principal",
                    onClick = actionStartActivity<MainActivity>(),
                    modifier = GlanceModifier.padding(end = 8.dp) // Espaciado entre botones
                )
                Button(
                    text = "Segunda Actividad",
                    onClick = actionStartActivity<SecondActivity>()
                )
            }
        }
    }
}

