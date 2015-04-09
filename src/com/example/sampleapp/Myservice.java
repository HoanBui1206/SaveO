package com.example.sampleapp;

import android.app.Service;

import android.content.Intent;

import android.os.AsyncTask;

import android.os.IBinder;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

public class Myservice extends Service {


	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void onCreate() {
		super.onCreate();
		new connectTask1().execute();


	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	
	public void onDestroy() {
		super.onDestroy();

	}

	public class connectTask1 extends AsyncTask<Void, Integer, Void> {
		FragmentActivity act;

		// private Context context;

		@Override
		protected Void doInBackground(Void... params) {
		
			
			while (true) {
				
				Log.i("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaa");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}

		protected void onProgressUpdate(Integer mConnect) {
			super.onProgressUpdate(mConnect);
			Toast.makeText(getApplication(), "Update xong roi do!",
					Toast.LENGTH_LONG).show();
		}

		protected void onPostExecute(Void result) {
			// TODO Auto-generated method stub
			super.onPostExecute(result);

		}

	}

	

	
}
