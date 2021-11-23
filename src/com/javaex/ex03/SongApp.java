package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
 
		Song set1_song = new Song();
		Song set2_song = new Song();
		Song set3_song = new Song();

		
		set1_song.setTitle("좋은날");
		set1_song.setArtist("아이유");
		set1_song.setAlbum("Real");
		set1_song.setComposer("이민수");
		set1_song.setYear(2010);
		set1_song.setTrack(3);
		set1_song.showinfo();
		
		
		set2_song.setTitle("거짓말");
		set2_song.setArtist("빅뱅");
		set2_song.setAlbum("Always");
		set2_song.setComposer("G-Dragon");
		set2_song.setYear(2007);
		set2_song.setTrack(2);
		set2_song.showinfo();
		
		
		
		set3_song.setTitle("벛꽃앤딩");
		set3_song.setArtist("버스커버스커");
		set3_song.setAlbum("버스커버스커1집");
		set3_song.setComposer("장범준");
		set3_song.setYear(2012);
		set3_song.setTrack(4);
		set3_song.showinfo();
		
		
		System.out.println(set1_song.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
