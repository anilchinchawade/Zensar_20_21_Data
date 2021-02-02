package com;

public class Book 
{
	//Data abstraction
	private int bookId;
	private String bookName;
	private float bookPrice;
	private Date bookPublishDate;
	private Author bookAuthor;
	
	//Constructor
	public Book(int bookId, String bookName, float bookPrice, Date bookPublishDate) 
	{
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = new Author(1,"Anil Chinchawade");
		this.bookPrice = bookPrice;
		this.bookPublishDate = bookPublishDate;
	}
	

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookPublishDate="
				+ bookPublishDate + ", bookAuthor=" + bookAuthor + "]";
	}


	// Getters and Setters 
	public int getBookId() 
	{
		return bookId;
	}
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	
	public String getBookName() 
	{
		return bookName;
	}
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
		
	public float getBookPrice() 
	{
		return bookPrice;
	}
	public void setBookPrice(float bookPrice) 
	{
		this.bookPrice = bookPrice;
	}


	public Date getBookPublishDate() 
	{
		return bookPublishDate;
	}
	public void setBookPublishDate(Date bookPublishDate) 
	{
		this.bookPublishDate = bookPublishDate;
	}


	public String printBookDetails(String bookName)
	{
		if(this.bookName == bookName) 
		{
			System.out.println("The book details are: ");
			return "BookName is: "+bookName+"\n Book ID: "+bookId+"\nBook Price: "+bookPrice+"\n Book Author: "+bookAuthor+"\n Book Publish Date: "+bookPublishDate;
		}
		else
		{
			return "Book not found";
		}
		
	}
	
	public float getBookOffers(String bookName)
	{
		float newPrice = this.getBookPrice();
		if(this.bookName == bookName)
		{
			if(this.getBookPublishDate().getYy() >=2010 && this.getBookPublishDate().getYy() <= 2020)
			{
				newPrice = (float) (bookPrice - (bookPrice*0.25));
				this.setBookPrice(newPrice);
			}
		}
		return newPrice;		
	}
}
