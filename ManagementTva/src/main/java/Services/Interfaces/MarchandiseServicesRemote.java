package Services.Interfaces;

import javax.ejb.Remote;

import Entities.Marchandise;

@Remote
public interface MarchandiseServicesRemote {

	Boolean addMarchandise(Marchandise marchandise);

	Boolean deleteMarchandiseById(Integer id);

	Boolean updateMarchandise(Marchandise marchandise);

	Marchandise findMarchandiseById(Integer id);

	Boolean deleteMarchandise(Marchandise marchandise);

}
