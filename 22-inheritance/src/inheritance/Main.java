package inheritance;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();

		customer.getId();
		customer.getFirstName();
		customer.getLastName();
		customer.getAge();
		customer.getEmail();

		employee.getId();
		employee.getFirstName();
		employee.getLastName();
		employee.getAge();
		employee.getSalary();

		CustomerManager customerManager = new CustomerManager();
		EmployeeManager employeeManager = new EmployeeManager();

		customerManager.list();
		customerManager.add();

		employeeManager.list();
		employeeManager.add();
		employeeManager.bestEmployee();
	}
}
