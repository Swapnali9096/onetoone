package com.jspiders.onetoone.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="person")
public class PersonDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column(nullable = false,unique = false)
private String name;
@Column(nullable = false,unique = true)
private String email;
@Column(nullable = false,unique = true)
private long mobile;
private int age;
@OneToOne

private AadharCardDTO aadharCard;
}