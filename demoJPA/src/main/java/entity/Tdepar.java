package entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the tdepar database table.
 * 
 */
@Data
@NoArgsConstructor
@Entity
@NamedQuery(name="Tdepar.findAll", query="SELECT t FROM Tdepar t")
public class Tdepar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String coddep;

	private String nomdep;

	private BigDecimal numdirec;

	//bi-directional many-to-one association to Templa
	@OneToMany(mappedBy="tdepar")
	private List<Templa> templas;

}