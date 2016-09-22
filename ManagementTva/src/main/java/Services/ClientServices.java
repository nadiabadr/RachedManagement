package Services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Client;
import Services.Interfaces.ClientServicesLocal;
import Services.Interfaces.ClientServicesRemote;

/**
 * Session Bean implementation class ClientServices
 */
@Stateless
public class ClientServices implements ClientServicesRemote,
		ClientServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ClientServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addClient(Client client) {
		Boolean b = false;
		try {
			entityManager.persist(client);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteClientById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findClientById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateClient(Client client) {
		Boolean b = false;
		try {
			entityManager.merge(client);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Client findClientById(Integer id) {
		return entityManager.find(Client.class, id);
	}

	@Override
	public Boolean deleteClient(Client client) {
		Boolean b = false;
		try {
			client = findClientById(client.getId());
			entityManager.remove(client);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findAllClients() {
		String jpql = "select p from Client p";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}
}
