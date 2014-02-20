package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import domain.Affectation;
import domain.Employee;
import domain.Project;


@Stateless
public class CompanyService implements CompanyServiceRemote, CompanyServiceLocal {

	@PersistenceContext
	private EntityManager em;
	
    public CompanyService() {
    }

	public void createEmployee(Employee employee) {
		em.persist(employee);
	}

	public void createProject(Project project) {
		em.persist(project);
	}

	public Employee findEmployeeById(int id) {
		return em.find(Employee.class, id);
	}

	public Project findProjectById(int id) {
		return em.find(Project.class, id);
	}

	public void assignEmployeeToProject(Employee employee, Project project,
			String role) {
		Affectation affectation = new Affectation(employee, project, role);
		em.persist(affectation);
	}

	public void removeEmployeeFromProject(Employee employee, Project project) {
		
	}

	public List<Employee> findEmployeesByProject(Project project) {
		return null;
	}

	public List<Employee> findEmployeesNotInProject(Project project) {
		return null;
	}

	public void deleteProject(Project project) {
		em.remove(em.merge(project));
	}

	public void deleteEmployee(Employee employee) {
		em.remove(em.merge(employee));
	}

}
