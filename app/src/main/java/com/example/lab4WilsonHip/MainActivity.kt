//Video del funcionamiento del prorgama:
// https://youtube.com/shorts/kvMJSXrCpsI
package com.example.lab4WilsonHip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.lab4WilsonHip.ui.theme.Lab4WilsonHipTheme
import com.example.lab4WilsonHip.Composable.ListaMascotas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4WilsonHipTheme {
                Surface(
                    modifier = Modifier,
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListaMascotas(mascotas)
                }
            }
        }
    }
}
