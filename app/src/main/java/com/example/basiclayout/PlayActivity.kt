package com.example.basiclayout

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PlayActivity(){
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderSection()
        Text(text = "Kepada Yth,",
            modifier = Modifier.padding(16.dp))
        Text(text = "Bob S Kennedy",
            modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.size(50.dp))
        DetailSurat(
            judul = "Nama",
            isinya = "Reza Azhari"
        )
        DetailSurat(
            judul = "Email",
            isinya = "Bob@Gmail.com"
        )
        DetailSurat(
            judul = "NoTelpn",
            isinya = "08123298132"
        )
        DetailSurat(
            judul = "Keterangan",
            isinya = "Mau Izin Atit🦄"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxWidth()
            .background(color = Color.DarkGray)
            .padding(15.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                Text(
                    text = "Daerah Istimewa Yogyakarta",
                    color = Color.White
                )
                Text(
                    text = "FAX : 021-12121212, Tlp : 09213231",
                    color = Color.White
                )
            }
            Box(
                contentAlignment = Alignment.BottomStart
            ){
                Image(
                    painter = painterResource(id = R.drawable.duck),
                    contentDescription = "",
                    modifier = Modifier.size(80.dp)
                        .clip(CircleShape)
                )
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "",
                    tint = Color.Red

                )
            }
        }
    }
}

@Composable
fun DetailSurat(
    judul: String, isinya: String
){
    Column (
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp)
    ){

        Row (
            modifier = Modifier.fillMaxWidth()
            .padding(top = 12.dp)
        ){
            Text(text = judul,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = isinya,
                modifier = Modifier.weight(2f))
        }
    }
}