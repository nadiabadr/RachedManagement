package Services;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Categorie;
import Entities.Produit;
import Services.Interfaces.ProduitServicesLocal;
import Services.Interfaces.ProduitServicesRemote;

/**
 * Session Bean implementation class ProduitServices
 */
@Stateful
public class ProduitServices implements ProduitServicesRemote,
		ProduitServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */

	public ProduitServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addProduit(Produit produit) {
		Boolean b = false;
		try {
			entityManager.persist(produit);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteProduitById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findProduitById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateProduit(Produit produit) {
		Boolean b = false;
		try {
			entityManager.merge(produit);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Produit findProduitById(Integer id) {
		return entityManager.find(Produit.class, id);
	}

	@Override
	public Boolean deleteProduit(Produit produit) {
		Boolean b = false;
		try {
			produit = findProduitById(produit.getId());
			entityManager.remove(produit);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignCategorieToNewProduit(Produit newProduit,
			Integer categorieId) {
		Boolean b = false;
		try {
			Categorie categorie = entityManager.find(Categorie.class,
					categorieId);
			newProduit.setCategorie(categorie);
			entityManager.merge(newProduit);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignCategorieToProduit(Produit produit, Integer categorieId) {
		Boolean b = false;
		try {
			Categorie categorie = entityManager.find(Categorie.class,
					categorieId);
			produit.setCategorie(categorie);
			entityManager.merge(produit);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean assignProduitToCategorie(Produit newProduit,
			Integer categorieId) {
		Boolean b = false;
		try {
			Categorie categorie = entityManager.find(Categorie.class,
					categorieId);
			List<Produit> produits = findAllProduitsByCategorieId(categorieId);
			produits.add(newProduit);
			categorie.linkProduitsToThisCategorie(produits);
			entityManager.merge(categorie);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Produit> findAllProduitsByCategorieId(Integer categorieId) {
		String jpql = "select p from Produit p where p.categorie.id=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", categorieId);
		return query.getResultList();
	}

	@Override
	public Boolean addCategorie(Categorie categorie) {
		Boolean b = false;
		try {
			entityManager.persist(categorie);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean deleteCategorieById(Integer id) {
		Boolean b = false;
		try {
			entityManager.remove(findCategorieById(id));
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Boolean updateCategorie(Categorie categorie) {
		Boolean b = false;
		try {
			entityManager.merge(categorie);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public Categorie findCategorieById(Integer id) {
		return entityManager.find(Categorie.class, id);
	}

	@Override
	public Boolean deleteCategorie(Categorie categorie) {
		Boolean b = false;
		try {
			categorie = findCategorieById(categorie.getId());
			entityManager.remove(categorie);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

}
