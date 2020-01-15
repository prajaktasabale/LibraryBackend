package com.app.pojos;

import javax.persistence.*;

@Entity
public class Copies
{
	private Integer id;
	private Book bookid;
	private int rack;
	private Status status;
	
	public Copies() {
	System.out.println("in ctor of copies");
	}

	public Copies(int rack, Status status) {
		super();
		this.rack = rack;
		this.status = status;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name="bookid")
	public Book getBookid() {
		return bookid;
	}

	public void setBookid(Book bookid) {
		this.bookid = bookid;
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) {
		this.rack = rack;
	}

	@Enumerated(EnumType.STRING)
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Copies [id=" + id + ", bookid=" + bookid + ", rack=" + rack + ", status=" + status + "]";
	}
	
	
}
