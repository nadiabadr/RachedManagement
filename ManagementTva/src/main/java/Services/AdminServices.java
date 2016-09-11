package Services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Entities.Admin;
import Services.Interfaces.AdminServicesLocal;
import Services.Interfaces.AdminServicesRemote;

/**
 * Session Bean implementation class AdminServices
 */
@Stateless
public class AdminServices implements AdminServicesRemote, AdminServicesLocal {

	@PersistenceContext
	EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public AdminServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addAdmin(Admin u) {
		Boolean b = false;
		try {
			entityManager.persist(u);
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while adding " + u);
		}
		return b;
	}

	@Override
	public Boolean deleteAdminById(int id) {
		Boolean b = false;
		try {
			entityManager.remove(findAdminById(id));
			b = true;
		} catch (Exception e) {
			System.err.println("A problem occured while deleting MoT number"
					+ id);
		}
		return b;
	}

	@Override
	public Admin updateAdmin(int id) {
		Admin u = findAdminById(id);
		try {

			entityManager.merge(u);

		} catch (Exception e) {
			System.err.println("A problem occured while updating " + u);
		}
		return u;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAllAdmins() {
		String jpql = "select u from Admin u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Admin findAdminById(int id) {
		try {
			return entityManager.find(Admin.class, id);
		} catch (Exception e) {
			System.err
					.println("A problem occured while trying to find MoT by  "
							+ id);

		}
		return null;

	}

	@Override
	public Admin authenticate(String name, String password) {

		Admin found = new Admin();
		Query query = entityManager
				.createQuery("select u from Admin u where u.pseudo=:name and u.mdp=:password");
		query.setParameter("name", name);
		query.setParameter("password", password);
		try {
			found = (Admin) query.getSingleResult();
			System.out.println("The authentified user is:" + found);
			return found;
		} catch (NoResultException e) {
			Logger.getLogger(getClass().getName()).log(
					Level.WARNING,
					"auth attempt failed with login=" + name + " and password="
							+ password);
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAdminByName(String name) {
		Query query = entityManager
				.createQuery("select p from Admin p where UPPER(p.name) LIKE:pname");
		query.setParameter("pname", "%" + name + "%");
		return query.getResultList();
	}

}