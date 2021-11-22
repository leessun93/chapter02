package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
 
		Song set1_song = new Song();
		Song set2_song = new Song();
		Song set3_song = new Song();

		
		set1_song.song_title();
		set1_song.song_artist();
		set1_song.song_album("Real");
		set1_song.song_composer("이민수");
		set1_song.song_year(2010);
		set1_song.song_track(3);
		set1_song.showinfo();
		
		
		set2_song.song_title();
		set2_song.song_artist();
		set2_song.song_album();
		set2_song.song_composer();
		set2_song.song_year();
		set2_song.song_track();
		set2_song.showinfo();
		
		
		
		set3_song.song_title();
		set3_song.song_artist();
		set3_song.song_album();
		set3_song.song_composer();
		set3_song.song_year();
		set3_song.song_track();
		set3_song.showinfo();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
