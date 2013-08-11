package com.homeproject.adapter;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.homeproject.moviecatalog.MovieInformationElement;
import com.homeproject.moviecatalog.R;

public class RelativeItemAdapter extends BaseAdapter
{
	private List<MovieInformationElement> moviesList;

	private LayoutInflater inflater;

	private Activity activity;

	public RelativeItemAdapter(Activity activity, List<MovieInformationElement> moviesList)
	{
		this.activity = activity;
		this.moviesList = moviesList;
		
		inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount()
	{
		return moviesList.size();
	}

	@Override
	public Object getItem(int position)
	{
		return moviesList.get(position);
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		System.out.println("IN THE GETVIEW METHOD");
		ViewsHolder holder;

		if (convertView == null)
		{
			System.out.println("VIEW == NULL");
			// This a new view we inflate the new layout
			convertView = inflater.inflate(R.layout.movie_information_relative_layout, null);

			holder = new ViewsHolder();
			holder.titleTextView = (TextView) convertView.findViewById(R.id.relative_layout_title);

			holder.descTextView = (TextView) convertView.findViewById(R.id.relative_layout_description);
			
			holder.imageView = (ImageView) convertView.findViewById(R.id.relative_layout_image_view);

			convertView.setTag(holder);
		}
		else
		{
			holder = (ViewsHolder) convertView.getTag();
		}
		MovieInformationElement currentMovie = moviesList.get(position);
		if (currentMovie != null)
		{
			holder.titleTextView.setText(currentMovie.getMovieTitle());
			holder.descTextView.setText(currentMovie.getMovieDesc());
			Bitmap bitmapImage = BitmapFactory.decodeResource(activity.getResources(), R.drawable.five);
			holder.imageView.setImageBitmap(bitmapImage);
		}
		return convertView;
	}

	public static class ViewsHolder
	{
		TextView titleTextView;

		TextView descTextView;

		ImageView imageView;
	}
}
