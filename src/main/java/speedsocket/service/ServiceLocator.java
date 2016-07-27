
package speedsocket.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceLocator {

	public static ApplicationContext getContext()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("configuracion.xml");
		return context;
	}
}
