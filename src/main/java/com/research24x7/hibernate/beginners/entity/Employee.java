
package com.research24x7.hibernate.beginners.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//para saber que la clase es un entity necesita la siguiente anotacion
@Entity (name =  "Employee") // lo que esta en parentesis es opcional, si no existe toma el nombre de la clase como nombre del entity
@Table (name = "employee") //si no existe esta anotacion, hibernate toma el nombre de la clase como nombre de la tabla
public class Employee {


	@Id //para mapear es mandatorio esta anotacion, esta anotacion define que es el primary key, to_do lo demas es opcional
	@GeneratedValue (strategy=GenerationType.IDENTITY) //propiedades del primary key, IDENTITY lo define como autoincremental
	@Column (name="emp_id", nullable=false, unique=true) //propiedades de la columna
	private int id; //nombre del atributo
	
	@Column(name="emp_name", length=28, nullable=false)
	private String name;

	@Column(name="emp_last_name", length=28, nullable=false)
	private String lastName;

	@Column(name="emp_dni", length=10, nullable=false)
	private Long dni;

	@Column(name="emp_email", length=28, nullable=false)
	private String email;

	@Column(name="emp_mobile", length=28, nullable=false)
	private String mobile;
}
