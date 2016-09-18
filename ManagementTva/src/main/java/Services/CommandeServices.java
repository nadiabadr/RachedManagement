package Services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Client;
import Entities.Commande;
import Services.Interfaces.CommandeServicesLocal;
import Services.Interfaces.CommandeServicesRemote;

/**
 * Session Bean implementation class CommandeServices
 */
@Stateless
public class CommandeServices implements CommandeServicesRemote,
		CommandeServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public CommandeServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addCommande(Commande commande) {
		Boolean b = false;
		try {
			entityManager.persist(commande);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteCommandeById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findCommandeById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateCommande(Commande commande) {
		Boolean b = false;
		try {
			entityManager.merge(commande);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Commande findCommandeById(Integer id) {
		return entityManager.find(Commande.class, id);
	}

	@Override
	public Boolean deleteCommande(Commande commande) {
		Boolean b = false;
		try {
			commande = findCommandeById(commande.getId());
			entityManager.remove(commande);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignClientToNewCommande(Commande newCommande,
			Integer clientId) {
		Boolean b = false;
		try {
			Client client = entityManager.find(Client.class, clientId);
			newCommande.setClient(client);
			entityManager.merge(newCommande);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignClientToCommande(Commande commande, Integer clientId) {
		Boolean b = false;
		try {
			Client client = entityManager.find(Client.class, clientId);
			commande.setClient(client);
			entityManager.merge(commande);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignCommandeToClient(Commande newCommande, Integer clientId) {
		Boolean b = false;
		try {
			Client client = entityManager.find(Client.class, clientId);
			List<Commande> commandes = findAllCommandesByClientId(clientId);
			commandes.add(newCommande);
			client.linkCommandesToThisClient(commandes);
			entityManager.merge(client);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Commande> findAllCommandesByClientId(Integer clientId) {
		String jpql = "select p from Commande p where p.client.id=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", clientId);
		return query.getResultList();
	}

}
