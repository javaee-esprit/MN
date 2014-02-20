package client.test.junit;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import client.delegate.CompanyServiceDelegate;
import domain.Employee;

public class CompanyServiceTest {
	
	@Before
	public void background(){
		CompanyServiceDelegate.createEmployee(new Employee(2, "ghost"));
	}
	
	@Test
	public void itShouldFindAnEmployeeById(){
		Employee employee = CompanyServiceDelegate.findEmployeeById(2);
		assertNotNull(employee);
		assertEquals("ghost", employee.getName());
		
	}
	
	@After
	public void reset(){
		CompanyServiceDelegate.deleteEmployee(new Employee(2, "ghost"));
	}

}
