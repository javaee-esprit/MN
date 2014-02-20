package client.test;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;
import domain.Project;

public class AssignEmployeesToProjects {
	
	public static void main(String[] args) {
		Employee e1 = CompanyServiceDelegate.findEmployeeById(1);
		Employee e2 = CompanyServiceDelegate.findEmployeeById(2);
		Employee e3 = CompanyServiceDelegate.findEmployeeById(3);
		
		Project p1 = CompanyServiceDelegate.findProjectById(1);
		Project p2 = CompanyServiceDelegate.findProjectById(2);
		
		CompanyServiceDelegate.assignEmployeeToProject(e1, p1, "dev");
		CompanyServiceDelegate.assignEmployeeToProject(e2, p1, "dev");
		CompanyServiceDelegate.assignEmployeeToProject(e3, p2, "test");
		CompanyServiceDelegate.assignEmployeeToProject(e2, p2, "dev");
	}

}
