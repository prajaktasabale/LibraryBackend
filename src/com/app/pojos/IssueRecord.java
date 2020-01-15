package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity 
public class IssueRecord 
{
	private Integer id;
	private Copies copyid;
	private User memberid;
	private Date issueDate;
	private Date returnDueDate;
	private Date returnDate;
	private double fineAmount;
	
	public IssueRecord() {
		System.out.println("in ctor of issue");
	}

	public IssueRecord(Date issueDate, Date returnDueDate, Date returnDate, double fineAmount) {
		super();
		this.issueDate = issueDate;
		this.returnDueDate = returnDueDate;
		this.returnDate = returnDate;
		this.fineAmount = fineAmount;
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(optional = false)
	@JoinColumn(name="copyid")
	public Copies getCopyid() {
		return copyid;
	}

	public void setCopyid(Copies copyid) {
		this.copyid = copyid;
	}

	@ManyToOne(optional = false)
	@JoinColumn(name="memberid")
	public User getMemberid() {
		return memberid;
	}

	public void setMemberid(User memberid) {
		this.memberid = memberid;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "issue_date")
	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "return_due_date")
	public Date getReturnDueDate() {
		return returnDueDate;
	}

	public void setReturnDueDate(Date returnDueDate) {
		this.returnDueDate = returnDueDate;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "return_date")
	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

	@Override
	public String toString() {
		return "IssueRecord [id=" + id + ", issueDate=" + issueDate + ", returnDueDate=" + returnDueDate
				+ ", returnDate=" + returnDate + ", fineAmount=" + fineAmount + "]";
	}
}
