package Services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Entities.Categorie;
import Entities.Produit;

@Remote
public interface ProduitServicesRemote {

	Boolean addProduit(Produit produit);

	Boolean deleteProduitById(Integer id);

	Boolean updateProduit(Produit produit);

	Produit findProduitById(Integer id);

	Boolean deleteProduit(Produit produit);

	public Boolean assignCategorieToNewProduit(Produit newProduit,
			Integer categorieId);

	public Boolean assignCategorieToProduit(Produit produit, Integer categorieId);

	Boolean assignProduitToCategorie(Produit newProduit, Integer categorieId);

	List<Produit> findAllProduitsByCategorieId(Integer categorieId);

	Boolean addCategorie(Categorie categorie);

	Boolean deleteCategorieById(Integer id);

	Boolean updateCategorie(Categorie categorie);

	Categorie findCategorieById(Integer id);

	Boolean deleteCategorie(Categorie categorie);

}
