package services;

import java.util.List;

import javax.ejb.Remote;

import domain.Employee;
import domain.Project;

@Remote
public interface CompanyServiceRemote {
	
	void createEmployee(Employee employee);
	void createProject(Project project);
	
	
	Employee findEmployeeById(int id);
	Project findProjectById(int id);
	
	void assignEmployeeToProject(Employee employee, Project project,String role);
	void removeEmployeeFromProject(Employee employee, Project project);
	
	List<Employee> findEmployeesByProject(Project project);
	List<Employee> findEmployeesNotInProject(Project project);
	
	void deleteProject(Project project);
	void deleteEmployee(Employee employee);
	

}
