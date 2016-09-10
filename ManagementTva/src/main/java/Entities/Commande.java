package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Commande
 *
 */

@Entity
public class Commande implements Serializable {

	private Integer id;
	private String ref;
	private boolean etat;
	private float montant;
	private float tva;
	private static final long serialVersionUID = 1L;

	private Client client;
	private List<Marchandise> marchandises;

	public Commande() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer Id) {
		this.id = Id;
	}

	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public boolean getEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public float getMontant() {
		return this.montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public float getTva() {
		return this.tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	@ManyToOne(cascade = CascadeType.MERGE)
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@OneToMany(mappedBy = "commande")
	public List<Marchandise> getMarchandises() {
		return marchandises;
	}

	public void setMarchandises(List<Marchandise> marchandises) {
		this.marchandises = marchandises;
	}

}
