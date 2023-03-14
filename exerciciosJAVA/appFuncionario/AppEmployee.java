public class AppEmployee{
  public static void main(String[] args){
    Employee employee = new Employee("José Bispo", "M", "DCOMP", 5000.00);
	
    employee.increaseSalary(10);
    employee.annualGain();
  }
}