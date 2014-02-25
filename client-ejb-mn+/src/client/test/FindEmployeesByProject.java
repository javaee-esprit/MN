package client.test;

import java.util.List;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;
import domain.Project;

public class FindEmployeesByProject {
	
	public static void main(String[] args) {
		Project p2 = CompanyServiceDelegate.findProjectById(2);
		List<Employee> employees=CompanyServiceDelegate.findEmployeesByProject(p2);
		for (Employee e:employees){
			System.out.println(e);
		}
	}

}
