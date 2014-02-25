package client.test;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		Employee e2 = CompanyServiceDelegate.findEmployeeById(2);
		CompanyServiceDelegate.deleteEmployee(e2);
	}

}
