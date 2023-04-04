package day04;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
		
	}
	
	public Song(String a, String b, int c, String d) {
		this.title = a;
		this.artist = b;
		this.year = c;
		this.country = d;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", 1978, "Sweden");
		
		song.show();
	}

}
