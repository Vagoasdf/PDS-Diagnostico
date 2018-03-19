/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import java.util.Date;

import org.orm.*;
public class CreatePDSData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.PDSPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving :
			//bitacora, fotoAvatar, apellido, nombre, fechaNacimiento, run, fono
			lormContacto.setApellido("Tester");
			lormContacto.setNombre("testing");
			lormContacto.setFechaNacimiento(new Date());
			lormContacto.setRun("12.345.678-9");
			lormContacto.setFono("+56912345678");
			lormContacto.setFotoAvatar("test.jpg");
			orm.ContactoDAO.save(lormContacto);
			orm.Bitacora lormBitacora = orm.BitacoraDAO.createBitacora();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving :
			// detalle, titulo, fechaBitacora, id_contacto
			lormBitacora.setORM_Id_contacto(lormContacto);
			lormBitacora.setTitulo("Primera bitacora");
			lormBitacora.setDetalle(" Esta es una bitacora de testeo");
			lormBitacora.setFechaBitacora(new Date());
			orm.BitacoraDAO.save(lormBitacora);
			orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving 
			//: password, username
			lormUsuario.setPassword("password");
			lormUsuario.setUsername("admin");
			orm.UsuarioDAO.save(lormUsuario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreatePDSData createPDSData = new CreatePDSData();
			try {
				createPDSData.createTestData();
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
