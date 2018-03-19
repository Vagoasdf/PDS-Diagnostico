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
public class BitacoraProcessor {
	private int id;
	
	private java.util.Date fechaBitacora;
	
	private String titulo;
	
	private String detalle;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
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
		return titulo == null ? "" : titulo;
	}
	
	public void setDetalle(String value) {
		this.detalle = value;
	}
	
	public String getDetalle() {
		return detalle == null ? "" : detalle;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int id_contacto_contactoid;
	
	public void setId_contacto_contactoid(int value) {
		this.id_contacto_contactoid = value;
	}
	
	public int getId_contacto_contactoid() {
		return id_contacto_contactoid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				orm.Bitacora _bitacora = orm.BitacoraDAO.loadBitacoraByORMID(getId());
				if (_bitacora!= null) {
					copyFromBean(_bitacora);
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
				orm.Bitacora _bitacora = orm.BitacoraDAO.createBitacora();
				copyToBean(_bitacora);
				if (orm.BitacoraDAO.save(_bitacora)) {
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
				orm.Bitacora _bitacora= orm.BitacoraDAO.loadBitacoraByORMID(getId());
				if (_bitacora != null) {
					copyToBean(_bitacora);
					if (orm.BitacoraDAO.save(_bitacora)) {
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
				orm.Bitacora _bitacora = orm.BitacoraDAO.loadBitacoraByORMID(getId());
				if (_bitacora != null && orm.BitacoraDAO.deleteAndDissociate(_bitacora)) {
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
	
	private void copyFromBean(orm.Bitacora _bitacora) {
		setFechaBitacora(_bitacora.getFechaBitacora());
		setTitulo(_bitacora.getTitulo());
		setDetalle(_bitacora.getDetalle());
		setId(_bitacora.getORMID());
		
		{
			orm.Contacto _contacto = _bitacora.getId_contacto();
			if (_contacto != null) {
				setId_contacto_contactoid(_contacto.getORMID());
			}
		}
		
	}
	
	private void copyToBean(orm.Bitacora _bitacora) {
		_bitacora.setFechaBitacora(getFechaBitacora());
		_bitacora.setTitulo(getTitulo());
		_bitacora.setDetalle(getDetalle());
		try  {
			orm.Contacto _id_contacto = orm.ContactoDAO.loadContactoByORMID(getId_contacto_contactoid());
			_bitacora.setId_contacto(_id_contacto);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

