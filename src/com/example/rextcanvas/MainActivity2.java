package com.example.rextcanvas;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WindowManager vmage=(WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
		WindowManager.LayoutParams vmParams=new WindowManager.LayoutParams();
	}

}
