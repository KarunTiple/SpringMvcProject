package com.api.book.bootrestbook.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int authorid;

	private String authorName;

	private String language;

	@OneToOne(mappedBy = "author")
	@JsonBackReference
	private Book book;

	public Author(int authorid, String authorName, String language, Book book) {
		super();
		this.authorid = authorid;
		this.authorName = authorName;
		this.language = language;
		this.book = book;
	}
	
	

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
