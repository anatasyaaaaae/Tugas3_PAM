package edu.uksw.fti.pam.pam_activity_intent

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.HomeActivity
import edu.uksw.fti.pam.pam_activity_intent.R
//import edu.uksw.fti.pam.pam_activity_intent.contracts.SignUpContract
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAM_Activity_IntentTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginForm()
                }
            }
        }
    }
}

internal fun doAuth(
    username: String,
    password: String
):Boolean{
    return(username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current
    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

   // val getUsernameFromSignupForm = rememberLauncherForActivityResult(
        //contract = SignUpContract(),
      //  onResult = {usernameInput = it!!})

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Login Form",
           // fontFamily = Poppins,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
        OutlinedTextField(value = usernameInput,
            onValueChange = {usernameInput = it},
            label = {
                Text(text = stringResource(R.string.label_username))
            },
            modifier = Modifier.fillMaxWidth()

        )

        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(text = stringResource(R.string.label_password)) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()){
            Button(
                onClick = {
                         // val navigate = Intent(lContext, MainActivity.this, HomeActivity::class.java)
                    //getUsernameFromSignupForm.launch("")
                },
                modifier = Modifier.padding(start=150.dp),
                shape = RoundedCornerShape(15.dp)
            ){
                Text(text = "Sign Up")
            }
            Button(
                onClick = {
                    val isAuthenticated = doAuth(usernameInput, passwordInput)
                    if (isAuthenticated)
                        lContext.startActivity(
                            Intent(lContext, HomeActivity::class.java)
                                .apply {
                                    putExtra("username", usernameInput)
                                }
                        )
                },
                shape = RoundedCornerShape(15.dp)
            ){
                Text(text = "Login")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    PAM_Activity_IntentTheme {
        LoginForm()
    }
}