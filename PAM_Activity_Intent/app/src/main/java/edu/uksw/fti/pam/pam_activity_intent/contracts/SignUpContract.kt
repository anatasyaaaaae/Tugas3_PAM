package edu.uksw.fti.pam.pam_activity_intent.contracts

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity_intent.SignUpActiviity
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme

class SignUpContract : ActivityResultContract<String?, String?>() {
    override fun createIntent(context: Context, input: String?): Intent {
        return Intent(context, SignUpActiviity::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? = when {
        resultCode != Activity.RESULT_OK -> null
        else -> intent?.getStringExtra("username")
    }
}

@Composable
fun SignUpForm (
    btnOnClickAction: (String?) -> Unit
) {

    var usernameInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Row {
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text =  stringResource(R.string.firstname)) },
                modifier = Modifier
                    .width(180.dp)
                    .padding(end = 36.dp)
            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text =  stringResource(R.string.lastname)) },
                modifier = Modifier
                    .width(180.dp)
                    .padding(start = 36.dp)
            )
        }
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text =  stringResource(R.string.username)) },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text =  "Password") },
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text =  stringResource(R.string.konfirmpass)) },
            modifier = Modifier.fillMaxWidth(),
        )
        Button(
            onClick = {
                btnOnClickAction(usernameInput)
            },
        ) {
            Text(text = stringResource(R.string.signup) )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PAM_Activity_IntentTheme {
        SignUpForm({})
    }
}