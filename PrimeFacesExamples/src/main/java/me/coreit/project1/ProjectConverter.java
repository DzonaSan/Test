package me.coreit.project1;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "projectConverter", forClass =Project.class)
public class ProjectConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext fc, UIComponent ui, String value) {
//		if(Project.project1.getName().equals(value)){
//			return Project.project1;
//		}
//		if(Project.project2.getName().equals(value)){
//			return Project.project2;
//		}
//		if(Project.project3.getName().equals(value)){
//			return Project.project3;
//		}
		Project project = new Project(value);
		return project;
	}

	@Override
	public String getAsString(FacesContext fc, UIComponent ui, Object value) {
		return ((Project)value).getName();
	}

}
