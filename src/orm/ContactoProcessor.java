/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package orm;

import org.orm.PersistentException;
public class ContactoProcessor {
	private int id;
	
	private String fono;
	
	private String run;
	
	private java.util.Date fechaNacimiento;
	
	private String nombre;
	
	private String apellido;
	
	private String fotoAvatar;
	
	private String direccion;
	
	private String email;
	
	private String residencia;
	
	private String organizacion;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setFono(String value) {
		this.fono = value;
	}
	
	public String getFono() {
		return fono == null ? "" : fono;
	}
	
	public void setRun(String value) {
		this.run = value;
	}
	
	public String getRun() {
		return run == null ? "" : run;
	}
	
	public void setFechaNacimiento(java.util.Date value) {
		this.fechaNacimiento = value;
	}
	
	public java.util.Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido == null ? "" : apellido;
	}
	
	public void setFotoAvatar(String value) {
		this.fotoAvatar = value;
	}
	
	public String getFotoAvatar() {
		return fotoAvatar == null ? "" : fotoAvatar;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion == null ? "" : direccion;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setResidencia(String value) {
		this.residencia = value;
	}
	
	public String getResidencia() {
		return residencia == null ? "" : residencia;
	}
	
	public void setOrganizacion(String value) {
		this.organizacion = value;
	}
	
	public String getOrganizacion() {
		return organizacion == null ? "" : organizacion;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Contacto _contacto = orm.ContactoDAO.loadContactoByORMID(getId());
				if (_contacto!= null) {
					copyFromBean(_contacto);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				orm.Contacto _contacto = orm.ContactoDAO.createContacto();
				copyToBean(_contacto);
				if (orm.ContactoDAO.save(_contacto)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				orm.Contacto _contacto= orm.ContactoDAO.loadContactoByORMID(getId());
				if (_contacto != null) {
					copyToBean(_contacto);
					if (orm.ContactoDAO.save(_contacto)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				orm.Contacto _contacto = orm.ContactoDAO.loadContactoByORMID(getId());
				if (_contacto != null && orm.ContactoDAO.deleteAndDissociate(_contacto)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(orm.Contacto _contacto) {
		setFono(_contacto.getFono());
		setRun(_contacto.getRun());
		setFechaNacimiento(_contacto.getFechaNacimiento());
		setNombre(_contacto.getNombre());
		setApellido(_contacto.getApellido());
		setFotoAvatar(_contacto.getFotoAvatar());
		setDireccion(_contacto.getDireccion());
		setEmail(_contacto.getEmail());
		setResidencia(_contacto.getResidencia());
		setOrganizacion(_contacto.getOrganizacion());
		setId(_contacto.getORMID());
	}
	
	private void copyToBean(orm.Contacto _contacto) {
		_contacto.setFono(getFono());
		_contacto.setRun(getRun());
		_contacto.setFechaNacimiento(getFechaNacimiento());
		_contacto.setNombre(getNombre());
		_contacto.setApellido(getApellido());
		_contacto.setFotoAvatar(getFotoAvatar());
		_contacto.setDireccion(getDireccion());
		_contacto.setEmail(getEmail());
		_contacto.setResidencia(getResidencia());
		_contacto.setOrganizacion(getOrganizacion());
	}
	
}

