package com.eliagbenu.sharedprefdemo;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends Activity{
	public static final String PREF_NAME = "myPreferencesFile";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_screen);
		
		TextView tvName = (TextView)findViewById(R.id.textView2);
		SharedPreferences settings = getSharedPreferences(PREF_NAME,0);
		tvName.setText(settings.getString("username", "demoUsername"));
	}

	
}
