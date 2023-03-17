
public class Employee {

		int empid;
		String name;
		int age;
		String adress;
		int salary;
		public Employee(int empid, String name, int age, String adress, int salary) {
			super();
			this.empid = empid;
			this.name = name;
			this.age = age;
			this.adress = adress;
			this.salary = salary;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", adress=" + adress + ", salary="
					+ salary + "]";
		}
		
		

}
