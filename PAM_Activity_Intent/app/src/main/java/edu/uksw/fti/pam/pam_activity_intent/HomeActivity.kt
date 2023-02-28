package edu.uksw.fti.pam.pam_activity_intent

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.Teal200


class HomeActivity : AppCompatActivity() {
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
                    Home()

                }
            }
        }
    }
}

@Composable
fun Home () {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column {
            NavbarAtas()
            Greeting(name = "Santika Widyaningtyas")
            CurrentBalance()
            Fitur()
            Promo()
            NavbarBawah()
        }
    }
}

@Composable
fun NavbarBawah () {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 35.dp)
            .background(color = Teal200)
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Button",
            modifier = Modifier
                .size(80.dp)
                .clickable { "" }
        )
        Image(
            painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Button",
            modifier = Modifier
                .size(80.dp)
                .clickable { "" }
        )
        Image(
            painter = painterResource(id = R.drawable.img_2),
            contentDescription = "Button",
            modifier = Modifier
                .size(80.dp)
                .clickable { "" }
        )
        Image(
            painter = painterResource(id = R.drawable.img_3),
            contentDescription = "Button",
            modifier = Modifier
                .size(80.dp)
                .clickable { "" }
        )
        Image(
            painter = painterResource(id = R.drawable.img_4),
            contentDescription = "Button",
            modifier = Modifier
                .size(80.dp)
                .clickable { "" }
        )
    }
}

@Composable
fun Promo () {
    Text(
        text = "Promo",
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.promo1),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.promo2),
            )
        }
    }
}

@Composable
fun PromotionItem(
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    Card(
        Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        Row {
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun Fitur () {
    Column(Modifier.padding(horizontal = 20.dp)) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.fitur1),
                contentDescription = "Logo BNI",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.fitur2),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.fitur3),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.fitur4),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.fitur5),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.fitur6),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.fitur7),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.fitur8),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(80.dp)
                    .clickable { "" }
            )
        }
    }
}
@Composable
fun CurrentBalance (
    color: Color = Teal200
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 40.dp)
            .fillMaxWidth()
    ) {
        Column() {
            Text(
                text = "Poin Anda"
            )
            Text(
                text = "678"
            )
        }
    }
}

@Composable
fun NavbarAtas () {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.bnilogo),
                contentDescription = "Logo BNI",
                modifier = Modifier
                    .size(70.dp)
            )
        }
        Image(
            painter = painterResource(id = R.drawable.ic_notif),
            contentDescription = "Notifikasi",
            modifier = Modifier
                .size(25.dp)
                .align(alignment = Alignment.CenterVertically)
        )
    }

}

@Composable
fun Greeting(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) { 
        Column() {
            Text(text = "Selamat Datang, ")
            Text(
                text = "$name",
                fontWeight = FontWeight.Bold
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Activity_IntentTheme {
        Home()
    }
}