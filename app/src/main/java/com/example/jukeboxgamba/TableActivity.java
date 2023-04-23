package com.example.jukeboxgamba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TableActivity extends AppCompatActivity {

    final String TAG = "TableActivity";
    TextView Titolo;
    ImageView Cover;
    Button Lyrcs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d(TAG,"Dentro la terza activity");

         Titolo = findViewById(R.id.titoloCanzone);
          Cover = findViewById(R.id.IdCover);
          Lyrcs = findViewById(R.id.testoCanzone);

          Cover.setImageResource(R.drawable.ImmagineCanzone);
          Button testo = findViewById(R.id.testoCanzone);

        testo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Lyrcs_Activity.class);
                startActivity(intent);
            }
        });

    }



}