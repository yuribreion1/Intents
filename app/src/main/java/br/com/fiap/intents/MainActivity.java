package br.com.fiap.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamarPrimeiraActivity(View view) {
        Intent intent = new Intent(this, PrimeiroActivity.class);
        startActivity(intent);
    }

    public void chamarSegundaAcitivy(View view) {
        Intent intent = new Intent(this, SegundoActivity.class);
        startActivity(intent);
    }
}
