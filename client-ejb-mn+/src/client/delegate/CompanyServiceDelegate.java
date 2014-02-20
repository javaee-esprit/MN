package client.delegate;

import java.util.List;

import client.locator.ServiceLocator;

import domain.Employee;
import domain.Project;
import services.CompanyServiceRemote;

public class CompanyServiceDelegate{
	
	private static final String jndiName = "ejb:/ejb-mn+/CompanyService!services.CompanyServiceRemote";
	
	private static CompanyServiceRemote getProxy(){
		return (CompanyServiceRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}

	public static void createEmployee(Employee employee) {
		getProxy().createEmployee(employee);
	}

	public static void createProject(Project project) {
		getProxy().createProject(project);
	}

	public static Employee findEmployeeById(int id) {
		return getProxy().findEmployeeById(id);
	}

	public static Project findProjectById(int id) {
		return getProxy().findProjectById(id);
	}

	public static void assignEmployeeToProject(Employee employee, Project project,
			String role) {
		getProxy().assignEmployeeToProject(employee, project, role);
	}

	public static void removeEmployeeFromProject(Employee employee, Project project) {
		getProxy().removeEmployeeFromProject(employee, project);
	}

	public static List<Employee> findEmployeesByProject(Project project) {
		return getProxy().findEmployeesByProject(project);
	}

	public static List<Employee> findEmployeesNotInProject(Project project) {
		return getProxy().findEmployeesNotInProject(project);
	}

	public static void deleteProject(Project project) {
		getProxy().deleteProject(project);
	}

}
