package com.book;

public class ReferenceBook extends Book {

	private int edition;
	public ReferenceBook() {
		
	}
	
	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	@Override
	public void calculatePrice() {
		if(this.getEdition()<5) {
			this.setPrice(this.getPages()*0.80);
		}else {
			this.setPrice(this.getPages());
		}
		
	}
	/*public void calculatePrice() {
		this.price=this.getPages()*1;
		/*if(this.getEdition()<5) {
			this.price=this.getPages()*0.80;
	}
	}*/
}
