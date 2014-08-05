package com.example.bestfood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class telaInicial extends Activity {
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		//MASH BAHHHH!
		EditText emailConta = (EditText) findViewById (R.id.editText1);
		EditText senhaConta = (EditText) findViewById (R.id.editText2);
		EditText nomeCadastro = (EditText) findViewById (R.id.editText3);
		EditText emailCadastro = (EditText) findViewById (R.id.editText4);
		EditText senhaCadastro = (EditText) findViewById (R.id.editText5);
		Button entrar = (Button) findViewById (R.id.button1);
		Button cadastrar = (Button) findViewById (R.id.button2);

		entrar.setOnClickListener (new OnClickListener () {
			

			public void onClick(View arg0) {
				Intent intent = new Intent (telaInicial.this, tela_usuario.class);
				startActivity(intent);


			}

		});

		cadastrar.setOnClickListener (new OnClickListener () {


			public void onClick(View arg0) {
Intent intent = new Intent (telaInicial.this, tela_usuario.class);
			startActivity(intent);


			}

		});


	}
}
