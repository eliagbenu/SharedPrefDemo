package com.eliagbenu.sharedprefdemo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	public static final String PREF_NAME = "myPreferencesFile";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText name = (EditText)findViewById(R.id.editText1);
		Button btnSave = (Button)findViewById(R.id.button1);
		btnSave.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SharedPreferences settings = getSharedPreferences(PREF_NAME,0);
				SharedPreferences.Editor editor = settings.edit();
				editor.putString("username", name.getText().toString());
				
				editor.commit();
				Intent intent = new Intent(getApplicationContext(),Second.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
