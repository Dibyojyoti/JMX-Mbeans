import java.lang.management.ManagementFactory;
import java.util.Set;
 
import javax.management.MBeanServer;
import javax.management.ObjectInstance;
import javax.management.ObjectName;
 
public class CreateAndRegisterMBeanInMBeanServer {
 MBeanServer server = ManagementFactory.getPlatformMBeanServer();
 
 MyClass mbean = new MyClass();
 objectName= "the object name of the Mbean as a String";
 
 server.registerMBean(mbean, new ObjectName(objectName));
 
 Set<ObjectInstance> instances = server.queryMBeans(new ObjectName(objectName), 
              null);
  
 ObjectInstance instance = (ObjectInstance)  instances.toArray()[0];
  
 System.out.println("Class Name:t" + instance.getClassName());
 System.out.println("Object Name:t" + instance.getObjectName());
}
