package com.example.android.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.net.Uri;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button = (Button) findViewById(R.id.button_1);

        Button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.udacity.com");

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        LinearLayout MapsLinearLayout = (LinearLayout) findViewById(R.id.address_textview);

        MapsLinearLayout.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                Uri uri = Uri.parse("https://goo.gl/maps/7w43rurfpmS2");

                Intent mapsIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(mapsIntent);

            }
        });

        ImageView MapsImageView = (ImageView) findViewById(R.id.place_icon);

        MapsImageView.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {
                Uri uri = Uri.parse("https://goo.gl/maps/7w43rurfpmS2");

                Intent mapsIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(mapsIntent);

            }
        });

        View WebView = (View) findViewById(R.id.view_web);

        WebView.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {

                Uri email = Uri.parse("https://www.udacity.com");

                Intent webIntent = new Intent(Intent.ACTION_VIEW, email);
                startActivity(webIntent);


            }
        });

        View PhoneView = (View) findViewById(R.id.view_phone);

        PhoneView.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:6505555555"));
                startActivity(callIntent);

            }
        });

        View EmailView = (View) findViewById(R.id.view_email);

        EmailView.setOnClickListener(new OnClickListener() {

            public void onClick(View view) {

                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                sendIntent.setType("message/rfc822");
                sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@udacity.com"});
                sendIntent.putExtra(Intent.EXTRA_SUBJECT, "I have a question");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Dear Udacity Team,");
                startActivity(sendIntent);

            }

        });


    }

}
