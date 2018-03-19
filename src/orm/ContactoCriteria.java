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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ContactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression fono;
	public final StringExpression run;
	public final DateExpression fechaNacimiento;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression fotoAvatar;
	public final StringExpression direccion;
	public final StringExpression email;
	public final StringExpression residencia;
	public final StringExpression organizacion;
	public final CollectionExpression bitacora;
	
	public ContactoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		fono = new StringExpression("fono", this);
		run = new StringExpression("run", this);
		fechaNacimiento = new DateExpression("fechaNacimiento", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		fotoAvatar = new StringExpression("fotoAvatar", this);
		direccion = new StringExpression("direccion", this);
		email = new StringExpression("email", this);
		residencia = new StringExpression("residencia", this);
		organizacion = new StringExpression("organizacion", this);
		bitacora = new CollectionExpression("ORM_Bitacora", this);
	}
	
	public ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Contacto.class));
	}
	
	public ContactoCriteria() throws PersistentException {
		this(PDSPersistentManager.instance().getSession());
	}
	
	public BitacoraCriteria createBitacoraCriteria() {
		return new BitacoraCriteria(createCriteria("ORM_Bitacora"));
	}
	
	public Contacto uniqueContacto() {
		return (Contacto) super.uniqueResult();
	}
	
	public Contacto[] listContacto() {
		java.util.List list = super.list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

