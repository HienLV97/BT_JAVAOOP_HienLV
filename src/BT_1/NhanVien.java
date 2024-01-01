package BT_1;

import java.util.Map;
import java.util.HashMap;

class Employee {
	private String name;
	private int age;
	private String country;

	public Employee(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {

		return name;
	}

	public int getAge() {

		return age;
	}

	public String getCountry() {
		return country;
	}
}

public class NhanVien {
	public static void main(String[] args) {
		Map<String, Employee> employeeMap = new HashMap<>();

		employeeMap.put("E001", new Employee("John Doe", 30, "VN"));
		employeeMap.put("E002", new Employee("Jane Smith", 25, "VN"));

		Employee employee = employeeMap.get("E001");
		if (employee != null) {
			System.out.println("Họ tên: " + employee.getName() + ", Tuổi: " + employee.getAge() + ", Quốc gia: " + employee.getCountry());
		} else {
			System.out.println("Không tìm thấy nhân viên với ID E001.");
		}
	}
}
