package com.example.bestfood;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class tela_usuario extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_usuario);
		final Button buscar = (Button)findViewById(R.id.button1);
		final Button cadastroRes = (Button)findViewById(R.id.button2);
		final AutoCompleteTextView bsc = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
		final ListView favorito = (ListView) findViewById(R.id.listView1);
		final String favoritos[] = {"Segunda","Terça","Quarta","Quinta","Sexta"};
		final String procura[] = {"Segunda","Terça","Quarta","Quinta","Sexta"};
		ArrayAdapter<String> aAdp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,favoritos );
		favorito.setAdapter(aAdp);
		favorito.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Toast.makeText(tela_usuario.this, favoritos[arg2], Toast.LENGTH_LONG).show();

			}

		});
		ArrayAdapter<String> search = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1,procura );
		bsc.setAdapter(search);
		bsc.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Toast.makeText(tela_usuario.this, procura[arg2], Toast.LENGTH_LONG).show();

			}

		});
		
		
		buscar.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
			}
			
		});
		cadastroRes.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				
			}
			
		});
	}

}
