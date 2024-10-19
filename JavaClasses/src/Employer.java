public class Employer {
	int age;
	String name;
String Department;

public Employer(int age,String name,String Department) {
	this.age = age;
	this.name = name;
	this.Department = Department;
}
public void setAge(int age) {
	this.age = age;
}
public void setName(String name) {
	this.name = name;
}
public void setDepartment(String Department) {
	this.Department = Department;
}

public int getAge() {
	return age;
}
public String getName() {
	return name;
}
public String getDepartment() {
	return Department;
}

public String toString() {
	return("The employer's age is " + this.getAge()
	+ "The employer's name is " + this.getName() +
	"The employer's Department is " + this.getDepartment());
}
public static void main(String[] args) {
	Employer john = new Employer(45, "John","Administrative Department");
	System.out.println(john.toString());
}
}
