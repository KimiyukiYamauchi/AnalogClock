package com.example.analogclock.yo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class AnalogClockActivity extends Activity {

	private int counter = 1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClick(View v) {
		View layout = findViewById(R.id.layout);
		if (counter == 1) {
			layout.setBackgroundResource(R.drawable.img2);
			counter = 2;
		} else {
			layout.setBackgroundResource(R.drawable.img1);
			counter = 1;
		}

	}
}
