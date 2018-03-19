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
public class UsuarioProcessor {
	private int id;
	
	private String username;
	
	private String nombre;
	
	private String password;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username == null ? "" : username;
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre == null ? "" : nombre;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password == null ? "" : password;
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
				orm.Usuario _usuario = orm.UsuarioDAO.loadUsuarioByORMID(getId());
				if (_usuario!= null) {
					copyFromBean(_usuario);
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
				orm.Usuario _usuario = orm.UsuarioDAO.createUsuario();
				copyToBean(_usuario);
				if (orm.UsuarioDAO.save(_usuario)) {
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
				orm.Usuario _usuario= orm.UsuarioDAO.loadUsuarioByORMID(getId());
				if (_usuario != null) {
					copyToBean(_usuario);
					if (orm.UsuarioDAO.save(_usuario)) {
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
				orm.Usuario _usuario = orm.UsuarioDAO.loadUsuarioByORMID(getId());
				if (_usuario != null && orm.UsuarioDAO.delete(_usuario)) {
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
	
	private void copyFromBean(orm.Usuario _usuario) {
		setUsername(_usuario.getUsername());
		setNombre(_usuario.getNombre());
		setPassword(_usuario.getPassword());
		setId(_usuario.getORMID());
	}
	
	private void copyToBean(orm.Usuario _usuario) {
		_usuario.setUsername(getUsername());
		_usuario.setNombre(getNombre());
		_usuario.setPassword(getPassword());
	}
	
}

