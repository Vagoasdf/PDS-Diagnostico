/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeletePDSData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.PDSPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			orm.Bitacora lormBitacora = orm.BitacoraDAO.loadBitacoraByQuery(null, null);
			// Delete the persistent object
			orm.BitacoraDAO.delete(lormBitacora);
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(lormUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeletePDSData deletePDSData = new DeletePDSData();
			try {
				deletePDSData.deleteTestData();
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
