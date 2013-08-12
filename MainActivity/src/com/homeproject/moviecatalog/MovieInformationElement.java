package com.homeproject.moviecatalog;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieInformationElement implements Parcelable
{
	private String movieDesc = "No description available";

	private String movieActors = "No information about actors available";

	private String movieGenre = "Action/Porn/Comedy";

	private int movieImagePath = R.drawable.image;

	private String movieAirDate = "20.05.2013";

	private String movieTitle = "No title available";

	public MovieInformationElement(String movieTitle,
			String movieDesc,
			String movieActors,
			String movieGenre,
			String movieAirDate,
			int movieImagePath)
	{

		this.movieTitle = movieTitle;
		this.movieDesc = movieDesc;
		this.movieActors = movieActors;
		this.movieGenre = movieGenre;
		this.movieAirDate = movieAirDate;
		this.movieImagePath = movieImagePath;

	}

	public MovieInformationElement(String movieTitle, int movieImagePath)
	{
		this.movieTitle = movieTitle;
		this.movieImagePath = movieImagePath;
	}

	public MovieInformationElement()
	{
		// Default constructor
	}

	public String getMovieTitle()
	{
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle)
	{
		this.movieTitle = movieTitle;
	}

	public String getMovieDesc()
	{
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc)
	{
		this.movieDesc = movieDesc;
	}

	public String getMovieActors()
	{
		return movieActors;
	}

	public void setMovieActors(String movieActors)
	{
		this.movieActors = movieActors;
	}

	public String getMovieGenre()
	{
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre)
	{
		this.movieGenre = movieGenre;
	}

	public String getMovieAirDate()
	{
		return movieAirDate;
	}

	public void setMovieAirDate(String movieAirDate)
	{
		this.movieAirDate = movieAirDate;
	}

	public int getMovieImagePath()
	{
		return movieImagePath;
	}

	public void setMovieImageUrl(int movieImagePath)
	{
		this.movieImagePath = movieImagePath;
	}

	@Override
	public int describeContents()
	{
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags)
	{
		dest.writeString(movieTitle);
		dest.writeString(movieDesc);
		dest.writeString(movieActors);
		dest.writeString(movieGenre);
		dest.writeString(movieAirDate);
		dest.writeInt(movieImagePath);

	}

	public MovieInformationElement(Parcel source)
	{

		movieTitle = source.readString();
		movieDesc = source.readString();
		movieActors = source.readString();
		movieGenre = source.readString();
		movieAirDate = source.readString();
		movieImagePath = source.readInt();

	}

	public static final Parcelable.Creator CREATOR = new Parcelable.Creator()
	{

		@Override
		public MovieInformationElement createFromParcel(Parcel source)
		{
			// TODO Auto-generated method stub
			return new MovieInformationElement(source);
		}

		@Override
		public MovieInformationElement[] newArray(int size)
		{
			// TODO Auto-generated method stub
			return new MovieInformationElement[size];
		}
	};
}
