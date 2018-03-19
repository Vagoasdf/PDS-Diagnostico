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

public class Bitacora {
	public Bitacora() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BITACORA_ID_CONTACTO) {
			this.id_contacto = (orm.Contacto) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private orm.Contacto id_contacto;
	
	private java.util.Date fechaBitacora;
	
	private String titulo;
	
	private String detalle;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setFechaBitacora(java.util.Date value) {
		this.fechaBitacora = value;
	}
	
	public java.util.Date getFechaBitacora() {
		return fechaBitacora;
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setDetalle(String value) {
		this.detalle = value;
	}
	
	public String getDetalle() {
		return detalle;
	}
	
	public void setId_contacto(orm.Contacto value) {
		if (id_contacto != null) {
			id_contacto.bitacora.remove(this);
		}
		if (value != null) {
			value.bitacora.add(this);
		}
	}
	
	public orm.Contacto getId_contacto() {
		return id_contacto;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Id_contacto(orm.Contacto value) {
		this.id_contacto = value;
	}
	
	private orm.Contacto getORM_Id_contacto() {
		return id_contacto;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
