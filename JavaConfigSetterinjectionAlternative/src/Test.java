import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alfar.training.salesmanager.config.ApplicationConfiguration;
import com.alfar.training.salesmanager.model.Employee;
import com.alfar.training.salesmanager.service.EmployeeService;
import com.alfar.training.salesmanager.service.EmployeeServiceImp;

public class Test {
	
	public static void main(String[]args) {
		
		
	/*	
		EmployeeService employeeService = new EmployeeServiceImp();
		
		List <Employee> employees = employeeService.getAllEmployees();
		
		for (Employee employee : employees) {
			
			System.out.println(employee.getEmployeeName() + " from " +employee.getEmployeeLocation() );
			
	*/
		
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeservice = applicationcontext.getBean("employeeService",EmployeeService.class);
		
		List <Employee> employees = employeeservice.getAllEmployees();
		
        for (Employee employee : employees) {
			
	    System.out.println(employee.getEmployeeName() + " from " +employee.getEmployeeLocation() );
		
			
		}
		
		
		
	}

}
