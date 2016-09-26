package com.example.rextcanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

public class RectView extends View {
	private Paint mPaint;
	private int Width;
	private int Height;
	public RectView(Context context,int width,int height) {
		super(context);
		// TODO Auto-generated constructor stub
		this.Width=width;
		this.Height=height;
	}

	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.draw(canvas);

		mPaint = new Paint();
		mPaint.setStyle(Paint.Style.STROKE);
		mPaint.setAntiAlias(true);
		mPaint.setColor(Color.BLUE);
		float centX=Width/2;
		float centY=Height/2;
//	canvas.drawRect(centX/2, centY/2, (float)Width/4*3,(float) (centY/2+((float)Width/4*3-centX/2)), mPaint);
		System.out.println(">>>>>>>>center"+centX/2+">>>>>>"+Width/4*3+">>>>>"+centX);
	
		//canvas.drawRect(centX, centY, centX+20, centY+20, mPaint);;
//	canvas.drawCircle(centX, centY, 20, mPaint);
		mPaint.setStrokeWidth(10);
	RectF oval=new RectF();
	oval.left=Width/8;
	oval.top=Height/8;
	oval.right=(float) (Width*0.8);
	oval.bottom=(float)(Height*0.75);
	canvas.drawOval(oval, mPaint);
	//canvas.drawRect(centX/4, centY/4, Width/4*3,Height/4*3, mPaint);
	
	
	canvas.drawPoint(Width/8, Height/8, mPaint);
	canvas.drawPoint((float)(Width*0.8), (float)(Height*0.75), mPaint);

	
	//	Path mPath = new Path();
//	mPath.moveTo(centX/2, centY/2);
//	mPath.lineTo(Width/4*3, centY/2);
//	mPath.lineTo(Width/4*3, Height/4*3);
//	mPath.lineTo(centX/2, Height/4*3);
//	mPath.close();
//	canvas.drawPath(mPath, mPaint);
	}
}
