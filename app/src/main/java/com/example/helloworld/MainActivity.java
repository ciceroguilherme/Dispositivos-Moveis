package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static String EXTRA_MESSAGE = "Mensagem de Teste";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo chamado pelo botão
    public void sendMessage(View view){
        Intent intent;

        intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText3);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        startActivity(intent);

    }
}
