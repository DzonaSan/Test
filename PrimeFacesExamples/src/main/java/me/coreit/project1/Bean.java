package me.coreit.project1;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;

@Named
@SessionScoped
public class Bean implements Serializable{
	private String city;
	private String suburb;
	private String email;
	private Set<String> suburbChoices = new HashSet<>();
	private Set<String> cityChoices = new HashSet<>();
	
	public Bean() {
		cityChoices.add("Podgorica");
		cityChoices.add("Budva");
	}
	
	public void populateSuburb(){
		if(city.equals("Podgorica")){
			this.suburbChoices.clear();
			this.suburbChoices.add("blok5");
			this.suburbChoices.add("blok9");
		}
		if(city.equals("Budva")){
			this.suburbChoices.clear();
			this.suburbChoices.add("Starigrad");
			this.suburbChoices.add("jaz");
		}
	}
	
	public void handleSelect(SelectEvent event) {
        Object item = event.getObject();
        FacesMessage msg = new FacesMessage("Selected", "Item:" + item);
    }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSuburb() {
		return suburb;
	}
	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}
	public Set<String> getSuburbChoices() {
		return suburbChoices;
	}
	public void setSuburbChoices(Set<String> suburbChoices) {
		this.suburbChoices = suburbChoices;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<String> getCityChoices() {
		return cityChoices;
	}
	public void setCityChoices(Set<String> cityChoices) {
		this.cityChoices = cityChoices;
	}
	
	
}
