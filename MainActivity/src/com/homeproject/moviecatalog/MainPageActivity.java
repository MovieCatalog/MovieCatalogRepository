package com.homeproject.moviecatalog;

import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainPageActivity extends Activity
{
	private static final int DESC_VIEW_ID = 2;

	private static final int TITLE_VIEW_ID = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LayoutInflater from = LayoutInflater.from(this);
		// RelativeLayout movieInformationRelativeLayout = (RelativeLayout) from.inflate(
		// R.layout.movie_information_relative_layout,
		// null,
		// false);
		
		LinearLayout mainActivityView = (LinearLayout) from.inflate(R.layout.activity_main, null);
		RelativeLayout relativeLayoutView = (RelativeLayout) from.inflate(	R.layout.movie_information_relative_layout,
																			null);

		ImageView relativeLayoutImageView = (ImageView) relativeLayoutView.findViewById(R.id.relative_layout_image_view);

		Bitmap image = BitmapFactory.decodeResource(null, R.drawable.five);
		relativeLayoutImageView.setImageBitmap(image);

		TextView relativeLayoutTitleView = (TextView) relativeLayoutView.findViewById(R.id.relative_layout_title);
		relativeLayoutTitleView.setText("Title");

		mainActivityView.addView(relativeLayoutView);

		// LayoutParams layoutParams = new LayoutParams(Gravity.CENTER);
		// RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
		// RelativeLayout.LayoutParams.WRAP_CONTENT,
		// 70);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void itemOnClickOperation(View view)
	{
		Intent intent = new Intent(this, DetailPageActivity.class);
		this.startActivity(intent);
	}
}
