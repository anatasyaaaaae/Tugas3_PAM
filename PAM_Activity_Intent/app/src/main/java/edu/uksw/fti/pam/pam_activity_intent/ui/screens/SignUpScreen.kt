package edu.uksw.fti.pam.pam_activity_intent.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.R

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
                label = { Text(text =  stringResource(R.string.firstname))},
                modifier = Modifier
                    .width(180.dp)
                    .padding(end = 36.dp)
            )
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text =  stringResource(R.string.lastname))},
                modifier = Modifier
                    .width(180.dp)
                    .padding(start = 36.dp)
            )
        }
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text =  stringResource(R.string.username))},
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text =  "Password")},
            modifier = Modifier.fillMaxWidth(),
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text =  stringResource(R.string.konfirmpass))},
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