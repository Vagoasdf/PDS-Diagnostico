/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdatePDSData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.PDSPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			orm.Bitacora lormBitacora = orm.BitacoraDAO.loadBitacoraByQuery(null, null);
			// Update the properties of the persistent object
			orm.BitacoraDAO.save(lormBitacora);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(lormUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.id.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Bitacora by BitacoraCriteria");
		orm.BitacoraCriteria lormBitacoraCriteria = new orm.BitacoraCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormBitacoraCriteria.id.eq();
		System.out.println(lormBitacoraCriteria.uniqueBitacora());
		
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormUsuarioCriteria.id.eq();
		System.out.println(lormUsuarioCriteria.uniqueUsuario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdatePDSData retrieveAndUpdatePDSData = new RetrieveAndUpdatePDSData();
			try {
				retrieveAndUpdatePDSData.retrieveAndUpdateTestData();
				//retrieveAndUpdatePDSData.retrieveByCriteria();
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
