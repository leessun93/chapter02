package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Song S1 = new Song("야생화", "박효신", "눈의꽃", "이선흠",1993, 1);
		
		Song S2 = new Song();{
			S2.setTitle("아모르파티");
			S2.setAlbum("김연자 1집");
			S2.setArtist("연자킴");
			S2.setComposer("리선흠");
			S2.setYear(2018);
			S2.setTrack(3);
		}
		
		System.out.println(S2);
		
		System.out.println(S1.toString());
	}

}
