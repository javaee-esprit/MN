package client.test.junit;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;

public class CompanyServiceTest {
	
	@Test
	public void itShouldFindAnEmployeeById(){
		Employee employee = CompanyServiceDelegate.findEmployeeById(2);
				
		
	}

}
