package com.uncc.gameday.activities;

import com.uncc.gameday.R;
import com.uncc.gameday.R.layout;
import com.uncc.gameday.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Registration extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registration, menu);
		return true;
	}

}