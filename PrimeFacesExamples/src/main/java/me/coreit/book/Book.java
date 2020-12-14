package me.coreit.book;

import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity

@NamedQueries(value = {
			@NamedQuery(name = "findBookH2G2", query = "select b from Book b where b.title = 'H2G2'"),
			@NamedQuery(name = "findAllBooks", query = "select b from Book b"),
			
})
public class Book extends Item {


	@Column(nullable = false, unique = true)
	private String isbn;
	@Column(name = "NB_OF_PAGES")
	private Integer nbOfPages;
	private Boolean illustrations;

	@ElementCollection
	@CollectionTable(name = "tags", joinColumns = { @JoinColumn(name = "BOOK_FK") })
	@Column(name = "value")
	private List<String> tags;

	@ElementCollection
	@CollectionTable(name = "chapters", joinColumns = { @JoinColumn(name = "BOOK_FK") })
	@MapKeyColumn(name = "position")
	private Map<Integer, Chapter> chapters;

	@ManyToMany
	@JoinTable(name = "books_authors", joinColumns = { @JoinColumn(name = "book_fk") }, inverseJoinColumns = {
			@JoinColumn(name = "author_fk") })
	private List<Author> authors;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNbOfPages() {
		return nbOfPages;
	}

	public void setNbOfPages(Integer nbOfPages) {
		this.nbOfPages = nbOfPages;
	}

	public Boolean getIllustrations() {
		return illustrations;
	}

	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Map<Integer, Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(Map<Integer, Chapter> chapters) {
		this.chapters = chapters;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
