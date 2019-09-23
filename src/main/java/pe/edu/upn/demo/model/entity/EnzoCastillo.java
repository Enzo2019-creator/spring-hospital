package pe.edu.upn.demo.model.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class EnzoCastillo {
	@Id
	@Column(name = "id", length = 9)
	public String codigo;
	
	@Column(name = "nombre", length = 25)
	private String nombre;
	
	@Column(name = "apellido", length = 25)
	private String apellido;
	
	@Column(name = "direccion", length = 50)
	private String direccion;
	
	@Column(name = "edad")
	private Integer edad;
}
