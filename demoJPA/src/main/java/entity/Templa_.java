package entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-03-14T21:06:06.058-0500")
@StaticMetamodel(Templa.class)
public class Templa_ {
	public static volatile SingularAttribute<Templa, Long> nuempl;
	public static volatile SingularAttribute<Templa, String> apellido;
	public static volatile SingularAttribute<Templa, BigDecimal> codtra;
	public static volatile SingularAttribute<Templa, Date> feching;
	public static volatile SingularAttribute<Templa, Date> fechnac;
	public static volatile SingularAttribute<Templa, BigDecimal> niveduc;
	public static volatile SingularAttribute<Templa, String> nombre;
	public static volatile SingularAttribute<Templa, BigDecimal> salario;
	public static volatile SingularAttribute<Templa, String> sexo;
	public static volatile SingularAttribute<Templa, String> tlfn;
	public static volatile SingularAttribute<Templa, Tdepar> tdepar;
}
