package MappingDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

		// Account ref1 = new Account(101, "Vikas", 1200);
		// Account ref2 = new Account(102, "Akash", 1500);

		
		
		// Use MySQL Database
		Configuration cfg = new Configuration();
		cfg.configure("MappingDemo.config.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session1 = factory.openSession(); // openSession() method helps in opening new session. You should close
													// this session object once you are done with all the database
													// operations

		// Session session1 = new
		// Configuration().configure("PostgreSQL.config.xml").buildSessionFactory().openSession();

		Transaction trn = session1.beginTransaction();

		// session1.save(ref1);
		// session1.save(ref2);

		// load() method: It returns proxy object and does not fire a query. It loads
		// the data by firing the query only when it is
		// actually required to print. So load() method is better because it supports
		// lazy loading.
		Account record1 = session1.load(Account.class, 2);
		System.out.println(record1.toString());

		// Since load() throws an ObjectNotFoundException when data is not found, we
		// should use it only when we know data exists.
		// Account record2 = session1.load(Account.class, 8);

		// get() method: It loads the data as soon as it is called by firing the query.
		// We should use get() method when we want to make sure that data exists in the
		// database.
		Account record3 = session1.get(Account.class, 8);
		// If data is not found, get() method will return null object.
		System.out.println(record3);

		trn.commit();

		// getCurrentSession(): returns the current session bound to the context.
		// factory.getCurrentSession();

		session1.close();

		// Once the sessionFactory is closed, all the current session objects which are
		// yet to close will gets closed.
		factory.close();

		
		
		
		// Use PostgreSQL Database
		Session session2 = new Configuration().configure("PostgreSQL.config.xml").buildSessionFactory().openSession();
		Transaction trx = session2.beginTransaction();

		// session2.save(ref1);
		Account record4 = session2.load(Account.class, 1);
		System.out.println(record4.toString());
		trx.commit();
		session2.close();
	}

}
