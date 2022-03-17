package com.nagarro.training.library.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@Column(name = "id")
	int bookId;
	@Column(name = "name")
	String bookName;
	@Column(name = "author")
	String author;
	@Column(name = "dateofPublish")
	String date;

	public Books() {
		super();
	}

	public Books(int bookId, String bookName, String author, String date) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.date = date;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", date=" + date + "]";
	}

}
