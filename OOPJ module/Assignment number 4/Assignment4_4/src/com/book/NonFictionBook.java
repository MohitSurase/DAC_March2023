package com.book;

public class NonFictionBook extends Book {

	private String subject;

	public NonFictionBook() {
		
	}
	

	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void calculatePrice() {
		if(this.subject.equalsIgnoreCase("history")) {
			this.setPrice(this.getPages()*0.85);
		}else {
			this.setPrice(this.getPages());;
		}
	
		/*public void calculatePrice() {
		this.price=this.getPages()*1;
		if(this.subject.equalsIgnoreCase("history")) {
			this.price= this.getPages()*0.85;
		
	}*/
	}
}
	

