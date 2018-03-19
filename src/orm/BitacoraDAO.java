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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class BitacoraDAO {
	public static Bitacora loadBitacoraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return loadBitacoraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora getBitacoraByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return getBitacoraByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return loadBitacoraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora getBitacoraByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return getBitacoraByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Bitacora) session.load(orm.Bitacora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora getBitacoraByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Bitacora) session.get(orm.Bitacora.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bitacora) session.load(orm.Bitacora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora getBitacoraByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bitacora) session.get(orm.Bitacora.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBitacora(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return queryBitacora(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBitacora(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return queryBitacora(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora[] listBitacoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return listBitacoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora[] listBitacoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return listBitacoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBitacora(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Bitacora as Bitacora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBitacora(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Bitacora as Bitacora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bitacora", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora[] listBitacoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBitacora(session, condition, orderBy);
			return (Bitacora[]) list.toArray(new Bitacora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora[] listBitacoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBitacora(session, condition, orderBy, lockMode);
			return (Bitacora[]) list.toArray(new Bitacora[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return loadBitacoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return loadBitacoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Bitacora[] bitacoras = listBitacoraByQuery(session, condition, orderBy);
		if (bitacoras != null && bitacoras.length > 0)
			return bitacoras[0];
		else
			return null;
	}
	
	public static Bitacora loadBitacoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Bitacora[] bitacoras = listBitacoraByQuery(session, condition, orderBy, lockMode);
		if (bitacoras != null && bitacoras.length > 0)
			return bitacoras[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBitacoraByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return iterateBitacoraByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBitacoraByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = PDSPersistentManager.instance().getSession();
			return iterateBitacoraByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBitacoraByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Bitacora as Bitacora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBitacoraByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Bitacora as Bitacora");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bitacora", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora createBitacora() {
		return new orm.Bitacora();
	}
	
	public static boolean save(orm.Bitacora bitacora) throws PersistentException {
		try {
			PDSPersistentManager.instance().saveObject(bitacora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Bitacora bitacora) throws PersistentException {
		try {
			PDSPersistentManager.instance().deleteObject(bitacora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Bitacora bitacora)throws PersistentException {
		try {
			if (bitacora.getId_contacto() != null) {
				bitacora.getId_contacto().bitacora.remove(bitacora);
			}
			
			return delete(bitacora);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Bitacora bitacora, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (bitacora.getId_contacto() != null) {
				bitacora.getId_contacto().bitacora.remove(bitacora);
			}
			
			try {
				session.delete(bitacora);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Bitacora bitacora) throws PersistentException {
		try {
			PDSPersistentManager.instance().getSession().refresh(bitacora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Bitacora bitacora) throws PersistentException {
		try {
			PDSPersistentManager.instance().getSession().evict(bitacora);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Bitacora loadBitacoraByCriteria(BitacoraCriteria bitacoraCriteria) {
		Bitacora[] bitacoras = listBitacoraByCriteria(bitacoraCriteria);
		if(bitacoras == null || bitacoras.length == 0) {
			return null;
		}
		return bitacoras[0];
	}
	
	public static Bitacora[] listBitacoraByCriteria(BitacoraCriteria bitacoraCriteria) {
		return bitacoraCriteria.listBitacora();
	}
}
