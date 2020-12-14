package me.coreit.book;

import javax.persistence.Embeddable;

@Embeddable
public class Chapter {

	public Chapter() {
		// TODO Auto-generated constructor stub
	}

	public Chapter(String string) {
		this.title = string;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String title;
	private String description;
}
