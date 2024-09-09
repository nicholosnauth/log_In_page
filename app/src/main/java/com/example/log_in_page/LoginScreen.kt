package com.example.log_in_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen(){

    var email by remember{
        mutableStateOf("")


    }
    var password by remember {
        mutableStateOf("")
    }



    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {


        Image(
            painter = painterResource(id = R.drawable.a), contentDescription = "Login Image",
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Log into your account")
        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email Address")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password, onValueChange = {}, label = {
            Text(text = "Password")
        })

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { }) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Forgot Password?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Or sign in with")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.CenterS

        ) {
            

            Image(
                painter = painterResource(id = R.drawable.fb),
                contentDescription = "facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Facebook click
                    },
            )

            Image(painter = painterResource(id = R.drawable.g),
                contentDescription = "google",
                modifier = Modifier
                    .size(70.dp)
                    .clickable {
                        //Google click
                    }
            )

            Image(painter = painterResource(id = R.drawable.ap),
                contentDescription = "apple",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //apple click
                    }

            ) }

        }
    
}    

