package com.example.bestfood;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class tela_restaurante extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_restaurante);
		ImageView imagem = (ImageView)findViewById(R.id.imageView1);
		TextView endereco = (TextView)findViewById(R.id.end);
		TextView telefone = (TextView)findViewById(R.id.fone);
		TextView horario = (TextView)findViewById(R.id.horario);
		// Esta tudo errado
	}

}
