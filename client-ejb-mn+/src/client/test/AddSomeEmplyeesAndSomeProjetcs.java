package client.test;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;
import domain.Project;

public class AddSomeEmplyeesAndSomeProjetcs {
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Zoubeir K");
		Employee e2 = new Employee(2, "Karim L");
		Employee e3 = new Employee(3, "Main A");
		
		Project p1 = new Project(1, "MOOCS");
		Project p2 = new Project(2, "WORLDCUP");
		
		CompanyServiceDelegate.createEmployee(e1);
		CompanyServiceDelegate.createEmployee(e2);
		CompanyServiceDelegate.createEmployee(e3);
		
		CompanyServiceDelegate.createProject(p1);
		CompanyServiceDelegate.createProject(p2);
		
	}

}
