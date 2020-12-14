package me.coreit.project1;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.primefaces.PrimeFaces;

@Named
@SessionScoped
public class APanel implements Serializable{
	private String journalMessage = "Welcome to JournalDev";
	private String componentMessage = "AccordionPanel Comp";
	private boolean outcome;
	
	public boolean isOutcome() {
		return outcome;
	}
	public void setOutcome(boolean outcome) {
		this.outcome = outcome;
	}
	public String getJournalMessage() {
		System.out.println("Journal Message Loaded");
		return journalMessage;
	}
	public void setJournalMessage(String journalMessage) {
		this.journalMessage = journalMessage;
	}
	public String getComponentMessage() {
		System.out.println("Comp Message Loaded");
		return componentMessage;
	}
	public void setComponentMessage(String componentMessage) {
		this.componentMessage = componentMessage;
	}
	
	public void choose(){
		if(outcome) {
			PrimeFaces.current().ajax().update(":form2:display");
		}
		else{
			PrimeFaces.current().ajax().update(":form2:display2");
		}
	}
	
	
}
