package com.example.jukeboxgamba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Testo extends AppCompatActivity {

        TextView testo;
    final String TAG = "TableActivity";

    private java.lang.String String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testo);

        Log.d(TAG,"Dentro la quarta activity");

        testo = findViewById(R.id.TESTO);
    }
    Intent intent = getIntent();
    String t = intent.getStringExtra("titolo");



    public String leggiFile(String TearsDontFall, Context c){

        String esito = "";

        AssetManager am = c.getAssets();
        String line;
        try {
            //1) APERTURA FILE
            InputStream is = am.open(String);
            //2) LETTURA DEL FILE
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(is));
            while ((line = br.readLine()) != null) {
                esito += line;
                esito += "\n";
            }
        } catch(FileNotFoundException ex){
            Log.e("TAG", "file non esistente");
            esito = "errore apertura";
        }
        catch (IOException e) {
            e.printStackTrace();
            Log.e("TAG", "errore lettura");
            esito = "errore lettura";
        }
        return esito;
    }
}

}
