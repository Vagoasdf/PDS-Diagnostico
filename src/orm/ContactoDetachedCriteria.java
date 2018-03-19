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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ContactoDetachedCriteria() {
		super(orm.Contacto.class, orm.ContactoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fono = new StringExpression("fono", this.getDetachedCriteria());
		run = new StringExpression("run", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		fotoAvatar = new StringExpression("fotoAvatar", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		residencia = new StringExpression("residencia", this.getDetachedCriteria());
		organizacion = new StringExpression("organizacion", this.getDetachedCriteria());
		bitacora = new CollectionExpression("ORM_Bitacora", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ContactoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		fono = new StringExpression("fono", this.getDetachedCriteria());
		run = new StringExpression("run", this.getDetachedCriteria());
		fechaNacimiento = new DateExpression("fechaNacimiento", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		fotoAvatar = new StringExpression("fotoAvatar", this.getDetachedCriteria());
		direccion = new StringExpression("direccion", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		residencia = new StringExpression("residencia", this.getDetachedCriteria());
		organizacion = new StringExpression("organizacion", this.getDetachedCriteria());
		bitacora = new CollectionExpression("ORM_Bitacora", this.getDetachedCriteria());
	}
	
	public BitacoraDetachedCriteria createBitacoraCriteria() {
		return new BitacoraDetachedCriteria(createCriteria("ORM_Bitacora"));
	}
	
	public Contacto uniqueContacto(PersistentSession session) {
		return (Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto[] listContacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

