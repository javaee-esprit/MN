package domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Affectation
 *
 */
@Entity
@Table(name="t_affectation")

public class Affectation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private AffectationPK pk;
	
	
	
	private Project project;
	private Employee employee;

	public Affectation() {
	}
	
	public Affectation(Employee employee, Project project, String role){
		this.getPk().setEmployeeId(employee.getId());
		this.getPk().setProjectId(project.getId());
		this.getPk().setRole(role);
		this.employee = employee;
		this.project = project;
	}
	
	
	@EmbeddedId
	public AffectationPK getPk() {
		if (pk == null) {
			pk = new AffectationPK();
		}
		return pk;
	}

	public void setPk(AffectationPK pk) {
		this.pk = pk;
	}

	
	
	@ManyToOne
	@JoinColumn( name = "project_fk" , insertable = false, updatable = false )
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@ManyToOne
	@JoinColumn( name = "employee_fk", insertable = false, updatable = false )
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
   
}
