package edu.uksw.fti.pam.pamactivityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme


class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PAM_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    ProfileForm()
                }
            }
        }
    }
}

@Composable
fun ProfileForm(){
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ){
        Text(
            text = "Profil",
            //fontFamily = ,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "First Name")},
                modifier = Modifier.requiredWidth(170.dp),
                shape = RoundedCornerShape(15.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Last Name")},
                modifier = Modifier.requiredWidth(170.dp),
                shape = RoundedCornerShape(15.dp)
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun ProfilActivityPreview() {
    PAM_Activity_IntentTheme{
        ProfileForm()
    }
}
