public class Employee{
  private String name;
  private String sex;
  private String department;
  private Double salary;
  
  public Employee(String name,String sex,String department,Double salary){
    this.name = name;
    this.sex = sex;
    this.department = department;
    this.salary = salary;
  }

  public void setName(String name){
	 this.name = name;
  }
  public void setSex(String sex){
	 this.sex = sex;
  }
  public void setDepartment(String department){
	 this.department = department;
  }
  public void setSalary(Double salary){
	 this.salary = salary;
  }


  public void increaseSalary(double rate){
    System.out.println(salary+ salary*(rate/100) );
  }
  
 public void annualGain(){
    System.out.println( salary *13.00);
 }

}