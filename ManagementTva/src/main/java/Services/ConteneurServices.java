package Services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.Conteneur;
import Services.Interfaces.ConteneurServicesLocal;
import Services.Interfaces.ConteneurServicesRemote;

/**
 * Session Bean implementation class ConteneurServices
 */
@Stateless
public class ConteneurServices implements ConteneurServicesRemote,
		ConteneurServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public ConteneurServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addConteneur(Conteneur conteneur) {
		Boolean b = false;
		try {
			entityManager.persist(conteneur);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteConteneurById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findConteneurById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateConteneur(Conteneur conteneur) {
		Boolean b = false;
		try {
			entityManager.merge(conteneur);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Conteneur findConteneurById(Integer id) {
		return entityManager.find(Conteneur.class, id);
	}

	@Override
	public Boolean deleteConteneur(Conteneur conteneur) {
		Boolean b = false;
		try {
			conteneur = findConteneurById(conteneur.getId());
			entityManager.remove(conteneur);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
