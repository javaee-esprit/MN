package client.test;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;
import domain.Project;

public class RemoveEmployeeFromProject {
	
	public static void main(String[] args) {
		Employee e2 = CompanyServiceDelegate.findEmployeeById(2);
		Project  p2 = CompanyServiceDelegate.findProjectById(2);
		
		CompanyServiceDelegate.removeEmployeeFromProject(e2, p2);
	}

}
