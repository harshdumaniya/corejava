package com.hd.core;

/**Practical 11 : using this variable
 * @author Harsh
 * @version 1.0
 * @since 24-01-2022
 */
class Person {
	int age;
	String name;
	Person(int age,String name) {
		this.age=age;
		this.name=name;
	}
	void show() {
		System.out.println(age+" "+name);
	}
}
package com.hd.core;

class TestThis{

public static void main(String args[]) {
	Person test1=new Person(20,"Suresh");
	Person test2=new Person(21,"Mahesh");
	test1.show();
	test2.show();
	}

}