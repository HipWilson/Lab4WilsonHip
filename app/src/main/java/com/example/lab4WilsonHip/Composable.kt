package com.example.lab4WilsonHip.Composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.lab4WilsonHip.Mascota

@Composable
fun ListaMascotas(lista: List<Mascota>) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(lista) { mascota ->
            TarjetaMascota(mascota)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Composable
fun TarjetaMascota(mascota: Mascota) {
    var adoptado by remember { mutableStateOf(false) }

    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = mascota.imagenResId),
                contentDescription = mascota.nombre,
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = mascota.nombre,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = mascota.raza,
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.Gray
                )
            }
            Button(onClick = { adoptado = !adoptado }) {
                Text(if (adoptado) "¡Adoptado! ❤" else "Adoptar")
            }
        }
    }
}
