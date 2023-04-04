package com.example.jukeboxgamba;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Lyrcs_Activity extends AppCompatActivity {
final String TAG = "Lyrcs_Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrcs);
    }
    Intent i = getIntent();

    Bundle B = i.getExtras();

    int numero = B.getInt("Numero");

    Log.d(TAG,"Numero passato;"+ numero);
    String titolo;
    if(numero==10)
        titolo="Patience";

    TextView txttitolo = findViewById(R.id.textView3);

    txttiotolo.setText(titolo);

    ImageView immagine = findViewById(R.id.idimmagine);
    immagine.setImageResource(R.drawable.cover);
    ImageView image = new ImageView(Lyrcs_Activity.class);
}