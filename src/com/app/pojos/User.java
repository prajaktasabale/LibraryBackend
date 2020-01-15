package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class User {
	private Integer id;
	private String name;
	private String email;
	private String phone;
	private String password;
	private Role role;
	private List<Payment> payments=new ArrayList<>();
	
	public User() {
		System.out.println("In User ctor");
	}

	public User(String name, String email, String phone, String password, Role role) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length = 30)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(length = 30,unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(length = 13)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Column(length = 30)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Enumerated(EnumType.STRING)
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	@OneToMany(mappedBy = "uid",cascade = CascadeType.ALL,orphanRemoval = true)
	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", role=" + role + ", payments=" + payments + "]";
	}
	
}
