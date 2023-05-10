package com.book;

public class FictionBook extends Book {

	private String genre;
	
	public FictionBook() {
		
	}
	

	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	@Override
	public void calculatePrice() {
		if(this.genre.equalsIgnoreCase("romance")) {
			this.setPrice(this.getPages()*0.90);
		}else {
			this.setPrice(this.getPages());
		}
	}
	/*public void calculatePrice() {
		this.price=this.getPages()*1;
	
			if(this.getGenre().equalsIgnoreCase("romance"))
				this.price=this.getPages();
		
	}*/
	
}
