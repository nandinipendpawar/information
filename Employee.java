  class Employee{
  private String name, address;
  private int year, salary;
  public Employee(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }
}

public class Emp{
  public static void main(String[] args){
    Employee e1 = new Employee("Raman", 2000, 400000, "66abc");
    Employee e2 = new Employee("surya", 1996, 900000, "125zxc");
    Employee e3 = new Employee("Prince", 1993, 800000, "211ase");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t"+e1.getSalary()+"\t"+e1.getAddress());  
    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t"+e2.getSalary()+"\t"+e2.getAddress());  
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t"+e3.getSalary()+"\t"+e3.getAddress());  
  }
}
