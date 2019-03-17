package com.ter.android.inlogpagina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Login;
    private Button Aanmeld;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aanmeld = (Button) findViewById(R.id.btnAanmeld);
        Aanmeld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aanmeldpagina();
            }
        });

        Login = (Button) findViewById(R.id.btnInlog);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginPagina();
            }
        });
    }

    public void  Aanmeldpagina(){
        Intent intent = new Intent(this, AanmeldPage.class);
        startActivity(intent);
    }

    public void LoginPagina(){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);


    }
}
