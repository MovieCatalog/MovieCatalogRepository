package com.homeproject.moviecatalog;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPageActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail_page_layout);
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		MovieInformationElement element = bundle.getParcelable("parse");

		TextView titleText = (TextView) findViewById(R.id.detail_page_title_text);
		titleText.setText(element.getMovieTitle());

		TextView airDate = (TextView) findViewById(R.id.detail_page_date_text);
		airDate.setText(element.getMovieAirDate());

		TextView genreText = (TextView) findViewById(R.id.detail_page_genre_text);
		genreText.setText(element.getMovieGenre());

		TextView actorsText = (TextView) findViewById(R.id.detail_page_actors_text);
		actorsText.setText(element.getMovieActors());

		TextView descText = (TextView) findViewById(R.id.detail_page_description_text_view);
		descText.setText(element.getMovieDesc());

		ImageView imageView = (ImageView) findViewById(R.id.detail_page_image);
		Bitmap bitmapImage = BitmapFactory.decodeResource(getResources(), element.getMovieImagePath());
		imageView.setImageBitmap(bitmapImage);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
