package com.javaex.ex03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public String song_title() {
		return title;
	}
	public String song_artist() {
		return artist;
	}
	public String song_album() {
		return album;
	}
	public String song_composer() {
		return composer;
	}
	public int song_year() {
		return year;
	}
	public int song_track() {
		return track;
	}
	
	public void showinfo() {
		System.out.println(title + artist +"("+album+","+year+","+track+"번트랙"+composer+"작곡");
	}
}
