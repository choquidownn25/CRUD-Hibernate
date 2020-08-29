package net.codejava.javaee.service;

import java.sql.SQLException;
import java.util.List;
import net.codejava.javaee.models.Book;

public interface IServiceBook {

	boolean saveBook(Book book) throws SQLException;

	boolean updateBook(Book book) throws SQLException;

	boolean deleteBook(Book book) throws SQLException;

	Book findBookById(int id) throws SQLException;

	List<Book> findAllBooks() throws SQLException;
}
