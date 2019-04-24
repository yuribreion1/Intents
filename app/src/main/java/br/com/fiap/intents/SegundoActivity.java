package br.com.fiap.intents;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        Toast.makeText(this, "Bem vindo a segunda activity", Toast.LENGTH_SHORT).show();

    }

    public void voltarMain(View view) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
