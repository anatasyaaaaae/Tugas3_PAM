package edu.uksw.fti.pam.pam_activity_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            PAM_Activity_IntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    Screen()
                    SignupForm()
                }
            }
        }
    }
}

@Composable
fun Screen(){
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    ) {
        Column() {

        }
    }
}

@Composable
fun SignupForm(){
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ){
        Text(
            text = "Sign Up",
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
        OutlinedTextField(value = "",
            onValueChange = {},
            label = {
                Text(text = "Username")},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp)
        )
        OutlinedTextField(value = "",
            onValueChange = {},
            label = {
                Text(text = "Password")},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp)
        )
        OutlinedTextField(value = "",
            onValueChange = {},
            label = {
                Text(text = "Confirm Password")},
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(15.dp)
        )
        Button(
            onClick = { },
            modifier = Modifier.padding(start = 250.dp),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text(text = "Sign Up")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpActivityPreview() {
    PAM_Activity_IntentTheme{
        Screen()
        SignupForm()
    }
}