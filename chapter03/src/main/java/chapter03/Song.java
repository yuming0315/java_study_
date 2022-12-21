package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int track;
	private int year;
	
	public Song() {
		
	}
	public Song(String title,String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public Song(String title,String artist,String album,String composer,int track,int year) {
		this(title,artist);
		this.album = album;
		this.composer = composer;
		this.track = track;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void show() {
		System.out.println("노래제목: "+title+", 가수: "+artist+", 앨범명: "+album);
		System.out.println("composer: "+composer+", 트렉수: "+track+", 년도: "+year);
	}
}
