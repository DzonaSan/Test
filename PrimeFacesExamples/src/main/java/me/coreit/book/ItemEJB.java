package me.coreit.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ItemEJB implements RemoteEJB {

	@PersistenceContext
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see me.coreit.book.RemoteEJB#persistBooks()
	 */
	@Override
	public void persistBooks() {
		Author deepu = new Author();
		deepu.setFirstName("Deepu");
		deepu.setLastName("Sasidharan");
		
		
		Author sendil = new Author();
		sendil.setFirstName("Sendil");
		sendil.setLastName("Kumar");
		
		List<Author> authors = new ArrayList<>();
		authors.add(deepu);
		authors.add(sendil);
		
		Book book = new Book();
		book.setTitle("Full Stack Development with JHipster");
		book.setPrice(23.5F);
		book.setIsbn("5-84023-742");
		book.setNbOfPages(354);
		book.setAuthors(authors);
		
		
		entityManager.persist(book);
		entityManager.persist(deepu);
		entityManager.persist(sendil);
		
		
		
//		sendil.book(book);
//	
//				deepu.book(book);
//		Book book = new Book();
//		book = entityManager.find(Book.class, 2l);
//		
//		Map<Integer, Chapter> map = new HashMap<>();
//		map.put(1, new Chapter("Bean Validation"));
//		map.put(2, new Chapter("CDI"));
//		map.put(3, new Chapter("JPA"));
//		map.put(4, new Chapter("EJB"));
//		book.setChapters(map);
//		
//		Book bookTest = entityManager.find(Book.class, 2l);
//		
//		System.out.println(bookTest.getChapters());
//		entityManager.persist(book);

		//
		// List<String> tags = new ArrayList<>();
		// tags.add("java");
		//// tags.add("hard");
		// tags.add("CS");
		//
		// book.setTitle("Java EE 7");
		// book.setPrice(23.5F);
		// book.setIsbn("1-84023-742-2");
		// book.setNbOfPages(354);
		// book.setTags(tags);
		//
		// entityManager.persist(book);
		//
		// book = entityManager.createNamedQuery("findBookH2G2",
		// Book.class).getSingleResult();
		// System.out.println(book);
		//
		// int books = entityManager.createNamedQuery("findAllBooks",
		// Book.class).getResultList().size();
		// System.out.println("Number of books " + books);
	}

}
