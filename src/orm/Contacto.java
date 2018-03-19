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

public class Contacto {
	public Contacto() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CONTACTO_BITACORA) {
			return ORM_bitacora;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
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
	
	private java.util.Set ORM_bitacora = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFono(String value) {
		this.fono = value;
	}
	
	public String getFono() {
		return fono;
	}
	
	public void setRun(String value) {
		this.run = value;
	}
	
	public String getRun() {
		return run;
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
		return nombre;
	}
	
	public void setApellido(String value) {
		this.apellido = value;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setFotoAvatar(String value) {
		this.fotoAvatar = value;
	}
	
	public String getFotoAvatar() {
		return fotoAvatar;
	}
	
	public void setDireccion(String value) {
		this.direccion = value;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setResidencia(String value) {
		this.residencia = value;
	}
	
	public String getResidencia() {
		return residencia;
	}
	
	public void setOrganizacion(String value) {
		this.organizacion = value;
	}
	
	public String getOrganizacion() {
		return organizacion;
	}
	
	private void setORM_Bitacora(java.util.Set value) {
		this.ORM_bitacora = value;
	}
	
	private java.util.Set getORM_Bitacora() {
		return ORM_bitacora;
	}
	
	public final orm.BitacoraSetCollection bitacora = new orm.BitacoraSetCollection(this, _ormAdapter, ORMConstants.KEY_CONTACTO_BITACORA, ORMConstants.KEY_BITACORA_ID_CONTACTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
