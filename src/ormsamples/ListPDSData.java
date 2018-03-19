/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListPDSData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Contacto...");
		orm.Contacto[] ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		int length = Math.min(ormContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormContactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Bitacora...");
		orm.Bitacora[] ormBitacoras = orm.BitacoraDAO.listBitacoraByQuery(null, null);
		length = Math.min(ormBitacoras.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormBitacoras[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario...");
		orm.Usuario[] ormUsuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
		length = Math.min(ormUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContactoCriteria.id.eq();
		lormContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] ormContactos = lormContactoCriteria.listContacto();
		int length =ormContactos== null ? 0 : Math.min(ormContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
		System.out.println("Listing Bitacora by Criteria...");
		orm.BitacoraCriteria lormBitacoraCriteria = new orm.BitacoraCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormBitacoraCriteria.id.eq();
		lormBitacoraCriteria.setMaxResults(ROW_COUNT);
		orm.Bitacora[] ormBitacoras = lormBitacoraCriteria.listBitacora();
		length =ormBitacoras== null ? 0 : Math.min(ormBitacoras.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormBitacoras[i]);
		}
		System.out.println(length + " Bitacora record(s) retrieved."); 
		
		System.out.println("Listing Usuario by Criteria...");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormUsuarioCriteria.id.eq();
		lormUsuarioCriteria.setMaxResults(ROW_COUNT);
		orm.Usuario[] ormUsuarios = lormUsuarioCriteria.listUsuario();
		length =ormUsuarios== null ? 0 : Math.min(ormUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListPDSData listPDSData = new ListPDSData();
			try {
				listPDSData.listTestData();
				//listPDSData.listByCriteria();
			}
			finally {
				orm.PDSPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
