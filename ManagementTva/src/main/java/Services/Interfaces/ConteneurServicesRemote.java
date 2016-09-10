package Services.Interfaces;

import javax.ejb.Remote;

import Entities.Conteneur;

@Remote
public interface ConteneurServicesRemote {

	Boolean addConteneur(Conteneur conteneur);

	Boolean deleteConteneurById(Integer id);

	Boolean updateConteneur(Conteneur conteneur);

	Conteneur findConteneurById(Integer id);

	Boolean deleteConteneur(Conteneur conteneur);

}
