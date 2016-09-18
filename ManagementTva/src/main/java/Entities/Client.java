package Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
public class Client implements Serializable {

	private Integer id;
	private String name;
	private String responsable;
	private String numTel;
	private static final long serialVersionUID = 1L;

	private List<Commande> commandes;

	public Client() {
		super();
	}

	public Client(String name, String responsable, String numTel,
			List<Commande> commandes) {
		super();
		this.name = name;
		this.responsable = responsable;
		this.numTel = numTel;
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", responsable=" + responsable
				+ ", numTel=" + numTel + ", commandes=" + commandes + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResponsable() {
		return this.responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getNumTel() {
		return this.numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	@OneToMany(mappedBy = "client")
	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	public void linkCommandesToThisClient(List<Commande> commandes) {
		this.commandes = commandes;
		for (Commande p : commandes) {
			p.setClient(this);
		}
	}
}
