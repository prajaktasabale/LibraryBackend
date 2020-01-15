package com.app.pojos;
import java.util.*;

import javax.persistence.*;

@Entity
public class Payment {
	private Integer pid;
	private User uid;
	private double amount;
	private String type;
	private Date txTime;
	private Date dueDate;
	
	public Payment() {
		System.out.println("In Payment Ctor");
	}

	public Payment(double amount, String type, Date txTime, Date dueDate) {
		super();
		this.amount = amount;
		this.type = type;
		this.txTime = txTime;
		this.dueDate = dueDate;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}
	@ManyToOne
	public User getUid() {
		return uid;
	}

	public void setUid(User uid) {
		this.uid = uid;
	}
	@Column(nullable = false)
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Temporal(TemporalType.DATE)
	public Date getTxTime() {
		return txTime;
	}

	public void setTxTime(Date txTime) {
		this.txTime = txTime;
	}
	@Temporal(TemporalType.DATE)
	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", uid=" + uid + ", amount=" + amount + ", type=" + type + ", txTime=" + txTime
				+ ", dueDate=" + dueDate + "]";
	}
	
	
}
