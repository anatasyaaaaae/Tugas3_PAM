package edu.uksw.fti.pam.pam_activity_intent.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.R
import edu.uksw.fti.pam.pam_activity_intent.datastore.StoreUserFirstName
import edu.uksw.fti.pam.pam_activity_intent.datastore.StoreUserLastName
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pamactivityintent.ProfileForm

@Composable
fun ProfileScreen() {

    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore First Name, Last Name
    val dataStore = StoreUserFirstName(context)
    val dataStore1 = StoreUserLastName(context)
    // get saved First Name, Last Name
    val savedFirstName = dataStore.getFirstName.collectAsState(initial = "")
    val savedLastName = dataStore1.getLastName.collectAsState(initial = "")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = savedFirstName.value!!,
            color = Color.White,
            fontSize = 18.sp
        )
        Text(
            text = savedLastName.value!!,
            color = Color.White,
            fontSize = 18.sp
        )
    }
}



@Preview(showBackground = true)
@Composable
fun ProfilActivityPreview() {
    PAM_Activity_IntentTheme{
        ProfileForm()
    }
}
