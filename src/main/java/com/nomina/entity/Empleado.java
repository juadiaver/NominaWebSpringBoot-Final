package com.nomina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleado") 
public class Empleado {
    
	
	

	@Id
	@Column(name = "dni")
    public String dni;
    @Column(name = "categoria")
    private int categoria;
	@Column(name = "anyos")
    public int anyos;
	@Column(name = "nombre")
    public String nombre;
	@Column(name = "sexo")
    public String sexo;
    

    
    
    

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public int getAnyos() {
		return anyos;
	}

	public void setAnyos(int anyos) {
		this.anyos = anyos;
	};
    
    
    


    
    
}