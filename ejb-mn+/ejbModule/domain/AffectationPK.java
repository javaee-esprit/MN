package domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AffectationPK implements Serializable{

	
	
	private static final long serialVersionUID = 1L;
	
	private int employeeId;
	private int projectId;
	
	public AffectationPK() {
	}
	
	@Column( name = "employee_fk" )
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	@Column( name = "project_fk" )
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + projectId;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AffectationPK other = (AffectationPK) obj;
		if (employeeId != other.employeeId)
			return false;
		if (projectId != other.projectId)
			return false;
		return true;
	}
	
	
	

}
