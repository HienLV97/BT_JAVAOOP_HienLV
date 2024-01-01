package BT_2.person;

public class Information {
	public static void main(String[] args) {
		getPerson getPerson = new getPerson();
		for (Object i: getPerson.person.arrayList){
			System.out.println(i);
		}
	}
}
