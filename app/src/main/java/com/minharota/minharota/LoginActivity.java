package com.minharota.minharota;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by madsonfelipe on 27/07/15.
 */
public class LoginActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void cadastrar(View view) {
     Intent it = new Intent(LoginActivity.this, CadastroActivity.class );
        startActivity(it);

    }
}
