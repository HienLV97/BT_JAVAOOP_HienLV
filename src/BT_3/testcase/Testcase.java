package BT_3.testcase;

import BT_3.common.BaseTest;
import BT_3.common.Constants;

public class Testcase extends BaseTest {
	public void Login() {
		createDriver();
		System.out.println("Go to login page");
		System.out.println("Input Email");
		System.out.println("Input pass");
		System.out.println("Click login button");
		closeDriver(Constants.browser);
	}

	public void AddCategory() {
		createDriver();
		System.out.println("test2");
		closeDriver(Constants.browser);
	}

	public static void main(String[] args) {
		 Testcase testcase = new Testcase();
		 testcase.Login();
		 testcase.AddCategory();
	}
}
