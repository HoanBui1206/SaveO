package com.example.sampleapp;

import android.app.Application;
import android.content.Intent;

public class Applications extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		Intent intentMyservice = new Intent(this, Myservice.class);
		startService(intentMyservice);
	}
}
