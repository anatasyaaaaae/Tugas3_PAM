package edu.uksw.fti.pam.pam_activity_intent

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.Teal200


class PageBebas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val username = getIntent().getStringExtra("username") ?: ""
//                    Greeting(username)
                    Bebas()
                    Bottomnav()
                }
            }
        }
    }
}

@Composable
fun Bebas () {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column {
            NavbarAtas()
            Greeting(name = "")


            CurrentBalance()
            CurrentBalance()

            NavbarBawah()


        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun NavbarBawah () {
    var bottomState by remember {
        mutableStateOf("")
    }
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                Alignment.Center ) {
                Text(
                    text = bottomState,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        },
        bottomBar = {
            BottomNavigation(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
                backgroundColor = androidx.compose.ui.graphics.Color.White,
                contentColor = androidx.compose.ui.graphics.Color.Gray
            ) {
                BottomNavigationItem(
                    selected = bottomState == "Home" ,
                    onClick = { bottomState = "Home"},
                    label = { Text(text = "Home")},
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null)}
                )

                BottomNavigationItem(
                    selected = bottomState == "History" ,
                    onClick = { bottomState = "History"},
                    label = { Text(text = "History")},
                    icon = { Icon(imageVector = Icons.Default.Search, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Pesanan" ,
                    onClick = { bottomState = "Pesanan"},
                    label = { Text(text = "Pesanan")},
                    icon = { Icon(imageVector = Icons.Default.Create, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Favorit" ,
                    onClick = { bottomState = "Favorit"},
                    label = { Text(text = "Favorit")},
                    icon = { Icon(imageVector = Icons.Default.Star, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Akun" ,
                    onClick = { bottomState = "Akun"},
                    label = { Text(text = "Akun")},
                    icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)}
                )

            }
        }
    )

}


@Composable
fun CurrentBalance(color: Color = Color.White) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .shadow(5.dp)
            .padding(horizontal = 15.dp, vertical = 25.dp)
            .fillMaxWidth()

    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.garuda),
                contentDescription = "Logo Maskapai",
                modifier = Modifier
                    .size(70.dp),
                alignment = Alignment.CenterStart
            )
            Text("Garuda", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold))
            Text("Bangkok", style = TextStyle(fontSize = 14.sp))
            Text(
                "15:00 ->   17:00",
                //ganti baris

                style = TextStyle(fontSize = 14.sp)
            )
            Text(text = "SMR   ->   BDO", style = TextStyle(fontSize = 14.sp))
        }
        Column() {
            Text("Harga Tiket", style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold))
            Text("Rp. 3.456.789", style = TextStyle(fontSize = 14.sp))
            Button(
                onClick = { /* Tambahkan aksi untuk tombol pesan */ },
                modifier = Modifier.padding(top = 15.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text("Pesan", style = TextStyle(fontSize = 14.sp, color = Color.White))
            }
        }
    }
}

@Composable
fun NavbarAtas() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Column {
                Text(text = "Rute Penerbangan",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center)
                Text(text = "Jakarta --> Bangkok",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black)
                Text(text = "Senin, 12 Juli 2021",
                    fontWeight = FontWeight.Thin,
                    fontSize = 17.sp,
                    color = Color.Black)

            }
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.garuda),
                    contentDescription = "Logo Maskapai",
                    modifier = Modifier
                        .size(100.dp),
                    alignment = Alignment.CenterStart
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column() {
            Text(text = "Ada 22 Penerbangan yang tersedia untuk anda ",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color.Black)

        }

    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Bottomnav() {
    var bottomState by remember {
        mutableStateOf("")
    }
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                Alignment.Center) {
                Text(text = bottomState,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        },
        bottomBar = {
            BottomNavigation(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
                backgroundColor = androidx.compose.ui.graphics.Color.White,
                contentColor = androidx.compose.ui.graphics.Color.Gray
            ) {
                BottomNavigationItem(
                    selected = bottomState == "Home" ,
                    onClick = { bottomState = "Home"},
                    label = { Text(text = "Home")},
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Promo" ,
                    onClick = { bottomState = "Promo"},
                    label = { Text(text = "Promo")},
                    icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Pesanan" ,
                    onClick = { bottomState = "Pesanan"},
                    label = { Text(text = "Pesanan")},
                    icon = { Icon(imageVector = Icons.Default.List, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Chat" ,
                    onClick = { bottomState = "Chat"},
                    label = { Text(text = "Chat")},
                    icon = { Icon(imageVector = Icons.Default.Email, contentDescription = null)}
                )
                BottomNavigationItem(
                    selected = bottomState == "Chat" ,
                    onClick = { bottomState = "Chat"},
                    label = { Text(text = "Chat")},
                    icon = { Icon(imageVector = Icons.Default.Email, contentDescription = null)}
                )

            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Activity_IntentTheme {
        Bebas()
    }
}