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

public class BitacoraDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression id_contactoId;
	public final AssociationExpression id_contacto;
	public final DateExpression fechaBitacora;
	public final StringExpression titulo;
	public final StringExpression detalle;
	
	public BitacoraDetachedCriteria() {
		super(orm.Bitacora.class, orm.BitacoraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		id_contactoId = new IntegerExpression("id_contacto.id", this.getDetachedCriteria());
		id_contacto = new AssociationExpression("id_contacto", this.getDetachedCriteria());
		fechaBitacora = new DateExpression("fechaBitacora", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		detalle = new StringExpression("detalle", this.getDetachedCriteria());
	}
	
	public BitacoraDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.BitacoraCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		id_contactoId = new IntegerExpression("id_contacto.id", this.getDetachedCriteria());
		id_contacto = new AssociationExpression("id_contacto", this.getDetachedCriteria());
		fechaBitacora = new DateExpression("fechaBitacora", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		detalle = new StringExpression("detalle", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria createId_contactoCriteria() {
		return new ContactoDetachedCriteria(createCriteria("id_contacto"));
	}
	
	public Bitacora uniqueBitacora(PersistentSession session) {
		return (Bitacora) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Bitacora[] listBitacora(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Bitacora[]) list.toArray(new Bitacora[list.size()]);
	}
}

