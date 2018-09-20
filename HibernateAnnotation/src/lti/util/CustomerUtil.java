
package lti.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class  CustomerUtil {

	private  CustomerUtil() {
		
		
	}
	
	
public static SessionFactory getFactory()
{
	Configuration config= new Configuration().configure("customer.cfg.xml");
	return config.buildSessionFactory();
}
}
