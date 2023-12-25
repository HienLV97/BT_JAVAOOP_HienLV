package BT_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class NhanVien {
//	public static LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
//
//	public void addEmployeeInfo(String key, String value) {
//		linkedHashMap.put(key, value);
//	}

	//	public static void main(String[] args) {
//		NhanVien nv = new NhanVien();
//		nv.addEmployeeInfo("Name", "Hien");
//		nv.addEmployeeInfo("Name", "Quynh");
//		System.out.println(linkedHashMap.entrySet());
//		for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
//			String key = entry.getKey();
//			String value = entry.getValue();
//			System.out.println("Khóa: " + key + ", Giá trị: " + value);
//		}
//	}
	public static void main(String[] args) {
		// Tạo một HashMap để lưu trữ thông tin nhân viên với ID làm khóa
		Map<String, Employee> employeeMap = new HashMap<>();

		// Thêm nhân viên vào HashMap
		employeeMap.put("E001", new Employee("John Doe", 30));
		employeeMap.put("E002", new Employee("Jane Smith", 25));

		// Lấy thông tin nhân viên dựa trên ID
		Employee employee = employeeMap.get("E002");
		if (employee != null) {
			System.out.println("Họ tên: " + employee.getName() + ", Tuổi: " + employee.getAge());
		} else {
			System.out.println("Không tìm thấy nhân viên với ID E001.");
		}
	}
}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
