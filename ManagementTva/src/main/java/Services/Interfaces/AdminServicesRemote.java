package Services.Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Entities.Admin;

@Remote
public interface AdminServicesRemote {

	Boolean addAdmin(Admin u);

	Boolean deleteAdminById(int id);

	Admin updateAdmin(int id);

	List<Admin> findAllAdmins();

	Admin findAdminById(int id);

	Admin authenticate(String name, String password);

	List<Admin> findAdminByName(String name);
}
