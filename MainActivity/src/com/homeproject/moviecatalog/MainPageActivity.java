package com.homeproject.moviecatalog;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.homeproject.adapter.RelativeItemAdapter;

public class MainPageActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView mainActivityListView = (ListView) findViewById(R.id.main_page_listview);

		List<MovieInformationElement> moviesList = new LinkedList<MovieInformationElement>();

		MovieInformationElement firstMovie = new MovieInformationElement();
		MovieInformationElement secondMovie = new MovieInformationElement();
		MovieInformationElement thirdMovie = new MovieInformationElement();

		moviesList.add(firstMovie);
		moviesList.add(secondMovie);
		moviesList.add(thirdMovie);

		RelativeItemAdapter adapter = new RelativeItemAdapter(this, moviesList);
		mainActivityListView.setAdapter(adapter);
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
