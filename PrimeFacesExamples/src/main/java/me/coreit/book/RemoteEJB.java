package me.coreit.book;

import javax.ejb.Remote;

@Remote
public interface RemoteEJB {

	void persistBooks();

}