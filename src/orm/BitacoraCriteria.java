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

public class BitacoraCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression id_contactoId;
	public final AssociationExpression id_contacto;
	public final DateExpression fechaBitacora;
	public final StringExpression titulo;
	public final StringExpression detalle;
	
	public BitacoraCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		id_contactoId = new IntegerExpression("id_contacto.id", this);
		id_contacto = new AssociationExpression("id_contacto", this);
		fechaBitacora = new DateExpression("fechaBitacora", this);
		titulo = new StringExpression("titulo", this);
		detalle = new StringExpression("detalle", this);
	}
	
	public BitacoraCriteria(PersistentSession session) {
		this(session.createCriteria(Bitacora.class));
	}
	
	public BitacoraCriteria() throws PersistentException {
		this(PDSPersistentManager.instance().getSession());
	}
	
	public ContactoCriteria createId_contactoCriteria() {
		return new ContactoCriteria(createCriteria("id_contacto"));
	}
	
	public Bitacora uniqueBitacora() {
		return (Bitacora) super.uniqueResult();
	}
	
	public Bitacora[] listBitacora() {
		java.util.List list = super.list();
		return (Bitacora[]) list.toArray(new Bitacora[list.size()]);
	}
}

