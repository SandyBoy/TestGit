package com.example.rextcanvas;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// WindowManager wm = (WindowManager)this
		// .getSystemService(Context.WINDOW_SERVICE);
		// DisplayMetrics dm = new DisplayMetrics();
		// wm.getDefaultDisplay().getMetrics(dm);
		// int width = dm.widthPixels;
		// int height = dm.heightPixels;
		//
		//
		//
		// float density = dm.density;
		// // 计算屏幕宽度和高度
		// int screenWidth = (int) (width * density);
		// int screenHeight = (int) (height * density);
		// // 计算屏幕中心点经纬度
		// System.out.println(">>>>>>>>"+screenWidth/2+">>>>>"+screenHeight/2);
		// Display
		// My_Display=getWindow().getWindowManager().getDefaultDisplay();
		// int Max_X=My_Display.getWidth();
		// int Max_Y=My_Display.getHeight();
		// System.out.println(">>>>>>>>"+ Max_X+">>>>>"+Max_Y);
		DisplayMetrics dm1 = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm1);
		int SCREEN_WIDTH = dm1.widthPixels;
		int SCREEN_HEIGHT = dm1.heightPixels;
	
		
		
		Display display=getWindowManager().getDefaultDisplay();
		DisplayMetrics outMetrics=new DisplayMetrics();
		display.getRealMetrics(outMetrics);
		int heightPix=outMetrics.heightPixels;
		int widthPix=outMetrics.widthPixels;
		
		outMetrics=new DisplayMetrics();
		display.getMetrics(outMetrics);
		int heightpix2=outMetrics.heightPixels;
		int widthpix2=outMetrics.widthPixels;
		int w=widthPix-widthpix2;
		int h=heightPix-heightpix2;
		System.out.println(">>>>>>>>" + w +">>>>"+widthPix+ ">>>>>" + h+">>>>"+heightpix2);
		
		
		RectView rectView=new RectView(this, SCREEN_WIDTH, SCREEN_HEIGHT);
		RelativeLayout relative=(RelativeLayout)findViewById(R.id.relative);
		relative.addView(rectView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
