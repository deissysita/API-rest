package entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the templa database table.
 * 
 */
@Data
@NoArgsConstructor
@Entity
@NamedQuery(name="Templa.findAll", query="SELECT t FROM Templa t")
public class Templa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long nuempl;

	private String apellido;

	private BigDecimal codtra;

	@Temporal(TemporalType.DATE)
	private Date feching;

	@Temporal(TemporalType.DATE)
	private Date fechnac;

	private BigDecimal niveduc;

	private String nombre;

	private BigDecimal salario;

	private String sexo;

	private String tlfn;

	//bi-directional many-to-one association to Tdepar
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CODDEP")
	private Tdepar tdepar;



}