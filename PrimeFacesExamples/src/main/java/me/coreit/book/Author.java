package me.coreit.book;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	public Author() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "first_name", length = 50)
	private String firstName;
	@Column(name = "last_name", length = 50)
	private String lastName;
	@Column(length = 2000)
	private String bio;
	private String email;

	@ManyToMany(mappedBy = "authors")
	private List<Book> books = new ArrayList<>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
