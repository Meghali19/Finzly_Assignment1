package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Entity.Book;
import common.HibernateConfig;

public class DeleteBook
{
    public static void main(String[] args)
    {
    	SessionFactory sf = HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();	

		Book deleteBook = new Book();
		deleteBook.setAuthor("Meghali");
		deleteBook.setTitle("ABC");
		deleteBook.setIsbn("344");
		deleteBook.setPubyear(2009);
		session.delete(deleteBook);
		tr.commit();
		session.close();
	}

}
