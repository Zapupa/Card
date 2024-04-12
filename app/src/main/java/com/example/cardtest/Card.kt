package com.example.cardtest
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PostCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .padding(8.dp),
        colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(8.dp)

    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp)
                ,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.profile),
                    contentDescription = "profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(56.dp)
                        .clip(CircleShape)
                )
                Column {
                    Text(
                        text = "John Doe",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "@johndoe",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Light
                    )
                }
            }
            Text(
                text = "Lorem Ipsum - это текст-рыба, часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной рыбой для текстов на латинице с начала XVI века.",
                fontSize = 20.sp,
                fontWeight = FontWeight(500)
            )

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, top = 8.dp)
                    .clip(RoundedCornerShape(16.dp))
                ,
                contentScale = ContentScale.FillWidth
            )

            Row(
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(text = "8:53 AM")
                Text(text = "Apr 10, 2024")
                Text(text = "Twitter for Android")
            }

            Divider(thickness = 0.5.dp, color = Color.Gray)

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, top = 8.dp)
            ) {
                Text(text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                        append("100k ")
                    }
                    append("Retweets")
                })

                Text(text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                        append("50k ")
                    }
                    append("Quote Tweets")
                })

                Text(text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                        append("300k ")
                    }
                    append("Likes")
                })
            }

            Divider(thickness = 0.5.dp, color = Color.Gray)

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp, bottom = 8.dp),
                horizontalArrangement = Arrangement.SpaceAround

            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.Email, contentDescription = "message")
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.Refresh, contentDescription = "repost")
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "favorite")
                }
            }
        }
    }
}

