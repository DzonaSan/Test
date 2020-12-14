package me.coreit.project1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Controller implements Serializable {
	private List<Project> selectedProject;

	private List<Project> availableProjests;
	
	@PostConstruct
	private void init() {
		availableProjests = new  ArrayList<>();
//		availableProjests.add(Project.project1);
//		availableProjests.add(Project.project2);
//		availableProjests.add(Project.project3);
		
		availableProjests.add(new Project("P1"));
		availableProjests.add(new Project("P2"));
		availableProjests.add(new Project("P3"));
		availableProjests.add(new Project("P4"));
		
		
	}

	public List<Project> getSelectedProject() {
		return selectedProject;
	}

	public void setSelectedProject(List<Project> selectedProject) {
		this.selectedProject = selectedProject;
	}

	public List<Project> getAvailableProjests() {
		return availableProjests;
	}

	public void setAvailableProjests(List<Project> availableProjests) {
		this.availableProjests = availableProjests;
	}
	
	public void start(){
		System.out.println(selectedProject);
	}

}
