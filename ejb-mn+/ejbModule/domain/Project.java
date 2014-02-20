package domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Project
 *
 */
@Entity
@Table(name="t_project")

public class Project implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	private List<Affectation> affectations;

	public Project() {
	}   
	

	public Project(int id, String name) {
		this.id = id;
		this.name = name;
	}


	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(mappedBy = "project" )
	public List<Affectation> getAffectations() {
		return affectations;
	}
	public void setAffectations(List<Affectation> affectations) {
		this.affectations = affectations;
	}


	public String toString() {
		return "Project [id=" + id + ", name=" + name + "]";
	}
	
	
   
}
