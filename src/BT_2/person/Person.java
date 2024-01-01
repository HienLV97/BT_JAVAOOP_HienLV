package BT_2.person;

import java.util.ArrayList;

public class Person {
	public ArrayList<Object> arrayList = new ArrayList<>();

	public String name;
	public int age;
	public String gender;
	public String address;
	public String phone;

	public Person(String name, int age, String gender, String address, String phone) {
		this.name = name;
		arrayList.add(this.name);
		this.age = age;
		arrayList.add(this.age);
		this.gender = gender;
		arrayList.add(this.gender);
		this.address = address;
		arrayList.add(this.address);
		this.phone = phone;
		arrayList.add(this.phone);
	}
}
