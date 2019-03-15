package entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-14T21:06:05.838-0500")
@StaticMetamodel(Tdepar.class)
public class Tdepar_ {
	public static volatile SingularAttribute<Tdepar, String> coddep;
	public static volatile SingularAttribute<Tdepar, String> nomdep;
	public static volatile SingularAttribute<Tdepar, BigDecimal> numdirec;
	public static volatile ListAttribute<Tdepar, Templa> templas;
}
