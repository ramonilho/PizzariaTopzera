package com.ramonilho.pizzariatopzera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etLogin;
    private EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLogin = (EditText) findViewById(R.id.etLogin);
        etSenha = (EditText) findViewById(R.id.etSenha);
    }

    public void logar(View view){
        String login = etLogin.getText().toString();
        String senha = etSenha.getText().toString();

        // Valida usuario e senha MOCK
        if (login.equals("fiap") && senha.equals("123")) {
            Intent intent = new Intent(this, OrderActivity.class);
            intent.putExtra("user", login);

            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
        }
    }

}
