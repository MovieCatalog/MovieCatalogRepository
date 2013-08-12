package com.homeproject.moviecatalog;

import java.util.LinkedList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.homeproject.adapter.RelativeItemAdapter;

public class MainPageActivity extends Activity
{
	MovieInformationElement thirdMovie;

	MovieInformationElement firstMovie;

	MovieInformationElement secondMovie;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		setContentView(R.layout.activity_main);

		ListView listView = (ListView) findViewById(R.id.main_page_listview);

		List<MovieInformationElement> moviesList = new LinkedList<MovieInformationElement>();

		firstMovie = new MovieInformationElement(	"The place beyond the pines",
													"A mysterious and mythical motorcycle racer, Luke, (Ryan Gosling) drives out of a traveling carnival globe of death and whizzes through the backstreets of Schenectady, New York, desperately trying to connect with a former lover, Romina, (Eva Mendes) who recently and secretly gave birth to the stunt rider's son. In an attempt to provide for his new family, Luke quits the carnival life and commits a series of bank robberies aided by his superior riding ability. The stakes rise as Luke is put on a collision course with an ambitious police officer, Avery Cross, (Bradley Cooper) looking to quickly move up the ranks in a police department riddled with corruption. The sweeping drama unfolds over fifteen years as the sins of the past haunt the present days lives of two high school boys wrestling with the legacy they've inherited. The only refuge is found in the place beyond the pines.",
													"Crime/Drama",
													"Ryan Gosling, Craig Van Hook, Eva Mendes ",
													"19 April 2013",
													R.drawable.placebeyond);

		secondMovie = new MovieInformationElement(	"The Wolverine",
													"In modern day Japan, Wolverine is out of his depth in an unknown world as he faces his ultimate nemesis in a life-or-death battle that will leave him forever changed. Vulnerable for the first time and pushed to his physical and emotional limits, he confronts not only lethal samurai steel but also his inner struggle against his own immortality, emerging more powerful than we have ever seen him before.",
													"Action/Adventure/Fantasy ",
													" Hugh Jackman, Tao Okamoto, Rila Fukushima",
													"26 July 2013",
													R.drawable.wolverine);

		thirdMovie = new MovieInformationElement(	"Iron Man",
													"When wealthy industrialist Tony Stark is forced to build an armored suit after a life-threatening incident, he ultimately decides to use its technology to fight against evil.",
													"Adventure",
													"Robert Downey Jr.",
													"17 March 2011",
													R.drawable.ironman);
		MovieInformationElement fourthElement = new MovieInformationElement();

		moviesList.add(thirdMovie);
		moviesList.add(firstMovie);
		moviesList.add(secondMovie);
		moviesList.add(fourthElement);

		final RelativeItemAdapter adapter = new RelativeItemAdapter(this, moviesList);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener()
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id)
			{
				MovieInformationElement newElement = (MovieInformationElement) adapter.getItem(position);

				Intent intent = new Intent(MainPageActivity.this, DetailPageActivity.class);
				Bundle bundle = new Bundle();
				bundle.putParcelable("parse", newElement);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}

	// Don't need for now.
	// @Override
	// public boolean onCreateOptionsMenu(Menu menu)
	// {
	// // Inflate the menu; this adds items to the action bar if it is present.
	// getMenuInflater().inflate(R.menu.main, menu);
	// return true;
	// }

}
