package Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.Marchandise;
import Services.Interfaces.MarchandiseServicesLocal;
import Services.Interfaces.MarchandiseServicesRemote;

/**
 * Session Bean implementation class MarchandiseServices
 */
@Stateless
@LocalBean
public class MarchandiseServices implements MarchandiseServicesRemote,
		MarchandiseServicesLocal {
	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * Default constructor.
	 */
	public MarchandiseServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addMarchandise(Marchandise marchandise) {
		Boolean b = false;
		try {
			entityManager.persist(marchandise);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteMarchandiseById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findMarchandiseById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateMarchandise(Marchandise marchandise) {
		Boolean b = false;
		try {
			entityManager.merge(marchandise);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Marchandise findMarchandiseById(Integer id) {
		return entityManager.find(Marchandise.class, id);
	}

	@Override
	public Boolean deleteMarchandise(Marchandise marchandise) {
		Boolean b = false;
		try {
			marchandise = findMarchandiseById(marchandise.getId());
			entityManager.remove(marchandise);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
