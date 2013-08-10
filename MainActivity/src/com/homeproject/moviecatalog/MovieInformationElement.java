package com.homeproject.moviecatalog;

public class MovieInformationElement
{
	private String movieDesc = "No description available";

	private String movieActors = "No information about actors available";

	private String movieGenre;

	private String movieImageUrl;

	private String movieTitle = "No title available";

	public MovieInformationElement(String movieTitle,
			String movieDesc,
			String movieActors,
			String movieGenre,
			String movieImageUrl)
	{
		this.movieTitle = movieTitle;
		this.movieDesc = movieDesc;
		this.movieActors = movieActors;
		this.movieGenre = movieGenre;
		this.movieImageUrl = movieImageUrl;
	}

	public MovieInformationElement(String movieTitle, String movieImageUrl)
	{
		this.movieTitle = movieTitle;
		this.movieImageUrl = movieImageUrl;
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

	public String getMovieImageUrl()
	{
		return movieImageUrl;
	}

	public void setMovieImageUrl(String movieImageUrl)
	{
		this.movieImageUrl = movieImageUrl;
	}
}
