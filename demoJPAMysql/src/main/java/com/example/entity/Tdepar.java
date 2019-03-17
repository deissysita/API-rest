package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tdepar")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tdepar {
	
	@Id
	private String coddep;
	private String nomdep;
	private Float numdirec;
}
