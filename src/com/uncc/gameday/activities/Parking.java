package com.uncc.gameday.activities;

import com.uncc.gameday.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Parking extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parking);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.parking, menu);
		return true;
	}

}