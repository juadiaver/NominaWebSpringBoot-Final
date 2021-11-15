package com.nomina.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Nomina")
public class Nomina {

	private static final int SUELDO_BASE[] = { 50000, 70000, 90000, 110000, 130000, 150000, 170000, 190000, 210000,
			230000 };

	/**
	 * Creacion del metodo sueldo
	 * 
	 * @param e
	 * @return
	 */

	public int sueldo(Empleado e) {

		return SUELDO_BASE[e.getCategoria() - 1] + 5000 * e.getAnyos();

	};

	@Id
	@Column(name = "dni")
	public String dni;
	@Column(name = "sueldo")
	private int sueldo;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

}
