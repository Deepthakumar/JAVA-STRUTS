package com.project4;
abstract class Item{
	int year, month,dayofdays;
	
	String title ; boolean borrowed;
	abstract void getTime();
	abstract void print();
	void borrowDate(int year, int month,int day) {
		this.year=year;
		this.month= month;
		
		
	}
		
	

	abstract class AudioVideo extends Item{
		final int MAX_BORROW = 7;
	}
	
	abstract class Book extends Item{
		String author,publisher;
		int pages,MAX_BORROW_DAY = 7;
	}
	class DVD extends AudioVideo{
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		public void print() {
			
		}
		public void getTime() {

	
	}
		 class  CD extends AudioVideo{
			 private String artist;
			 private int nooftracks;
			public String getArtist() {
				return artist;
			}
			public void setArtist(String artist) {
				this.artist = artist;
			}
			public int getNooftracks() {
				return nooftracks;
			}
			public void setNooftracks(int nooftracks) {
				this.nooftracks = nooftracks;
			}
			public  void print() {
			
		 }
			 public void getTime() {
		 }
		 class Novel extends Book{
			private int isbn;
			private String genre;
			public int getIsbn() {
				return isbn;
			}
			public void setIsbn(int isbn) {
				this.isbn = isbn;
			}
			public String getGenre() {
				return genre;
			}
			public void setGenre(String genre) {
				this.genre = genre;
			}
			public void print() {
		 }
			public void getTime() {
				
			}
			class Magazine extends Book{
				private int volume;
				private int type;
				public int getVolume() {
					return volume;
				}
				public void setVolume(int volume) {
					this.volume = volume;
				}
				public int getType() {
					return type;
				}
				public void setType(int type) {
					this.type = type;
				}
			}
			public void print() {
			 }
				public void getTime() {
					
				}
				
			}
		 class Journal extends Book{
			 private int isbn;
			 private String volume;
			public int getIsbn() {
				return isbn;
			}
			public void setIsbn(int isbn) {
				this.isbn = isbn;
			}
			public String getVolume() {
				return volume;
			}
			public void setVolume(String volume) {
				this.volume = volume;
			}
			public void print() {
			 }
				public void getTime() {
					
				}
				
		 }
public class Handson1 {
	public static void main(String[] args) {
		DVD dvd = new DVD();
		dvd.setDirector("Allan");
		CD cd = new CD();
		cd.setArtist("Boker");
		cd.setNumberOfTracks(2);
		Novel novel = new Novel();
		novel.setGenre("Horror");
		novel.setIsbn(3);
		Magazine magazine = new Magazine();
		magazine.setType("Humour");
		magazine.setVolume(4);
		Journal journal = new Journal();
		journal.setIsbn(8);
		journal.setType("Romcom");
		
	}
}
	


