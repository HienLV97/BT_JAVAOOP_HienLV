package BT_2.company;

import BT_2.person.getPerson;

public class Company {
	public static void main(String[] args) {
		getPerson getPerson = new getPerson();
		System.out.println(getPerson.person.name + " "+ getPerson.person.age+" "+getPerson.person.gender);
	}
}
