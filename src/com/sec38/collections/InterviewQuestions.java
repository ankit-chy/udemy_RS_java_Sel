package com.sec38.collections;

import java.util.ArrayList;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 4, 4, 5, 9, 3, 4 };

		// Print Duplicates 3-2, 4-3 , 5-1, 9-1

		// Creating Empty ArrayList

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int count = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				count++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j])
						count++;
				}

				System.out.println(a[i] + " is repeated " + count + " times");
				if(count==1) {
					System.out.println(a[i] + " is unique number");
				}
			}

		}

	}

}

/* 1. What are the core concepts of OOPS?
	OOPS core concepts are;

	Abstraction
	Encapsulation
	Polymorphism
	Inheritance
	Composition
	Association
	Aggregation

2. What is Abstraction?
	Abstraction is an OOPS concept to construct the structure of the real world objects. During this construction only the general states and behaviors are taken and more specific states and behaviors are left aside for the implementers.

3. What is Encapsulation?
	Encapsulation is an OOPS concept to create and define the permissions and restrictions of an object and its member variables and methods. A very simple example to explain the concept is to make the member variables of a class private and providing public getter and setter methods. Java provides four types of access level modifiers: public, protected, no modifier and private.

4. What is the difference between Abstraction and Encapsulation?
	“Program to interfaces, not implementations” is the principle for Abstraction and “Encapsulate what varies” is the OO principle for Encapsulation.
	Abstraction provides a general structure of a class and leaves the details for the implementers. Encapsulation is to create and define the permissions and restrictions of an object and its member variables and methods.
	Abstraction is implemented in Java using interface and abstract class while Encapsulation is implemented using four types of access level modifiers: public, protected, no modifier and private.

5. What is Polymorphism?
	Polymorphism is the occurrence of something in various forms. Java supports various forms of polymorphism like polymorphic reference variables, polymorphic method, polymorphic return types and polymorphic argument types.

6. What is Inheritance?
	A subclass can inherit the states and behaviors of it’s super class is known as inheritance.

7. What is multiple inheritance?
	A child class inheriting states and behaviors from multiple parent classes is known as multiple inheritance.

8. What is the diamond problem in inheritance?
	In case of multiple inheritance, suppose class A has two subclasses B and C, and a class D has two super classes B and C.If a method present in A is overridden by both B and C but not by D then from which class D will inherit that method B or C? This problem is known as diamond problem.

9. Why Java does not support multiple inheritance?
 	Java was designed to be a simple language and multiple inheritance introduces complexities like diamond problem. Inheriting states or behaviors from two different type of classes is a case which in reality very rare and it can be achieved easily through an object association.

10. What is Static Binding and Dynamic Binding?
	Static or early binding is resolved at compile time. Method overloading is an example of static binding.

 	Dynamic or late or virtual binding is resolved at run time. Method overriding is an example of dynamic binding.

11. What is a Class?
	A class is the specification or template of an object.

12. What is an Object?
	Object is instance of class.
	

What is Runtime Polymorphism?
Runtime polymorphism or dynamic method dispatch is a process in which a call to an overridden method is resolved at runtime rather than at compile-time.

In this process, an overridden method is called through the reference variable of a super class. The 

 What is the difference between abstraction and encapsulation?
Abstraction hides the implementation details whereas encapsulation wraps code and data into a single unit.



 What is abstract class?
A class that is declared as abstract is known as abstract class. It needs to be extended and its method implemented. It cannot be instantiated.

 Can there be any abstract method without abstract class?
No, if there is any abstract method in a class, that class must be abstract.

Can you use abstract and final both with a method?
No, because abstract method needs to be overridden whereas you can't override final method.

Is it possible to instantiate the abstract class?
No, abstract class can never be instantiated.

What is interface?

Interface is a blueprint of a class that have static constants and abstract methods.It can be used to achieve fully abstraction and multiple inheritance.



 Can you declare an interface method static?

No, because methods of an interface is abstract by default, and static and abstract keywords can't be used together.

 Can an Interface be final?
No, because its implementation is provided by another class.

 What is marker interface?
An interface that have no data member and method is known as a marker interface.For example Serializable, Cloneable etc.

 What is difference between abstract class and interface?
Abstract class	Interface
1)An abstract class can have method body (non-abstract methods).	Interface have only abstract methods.
2)An abstract class can have instance variables.	An interface cannot have instance variables.
3)An abstract class can have constructor.	Interface cannot have constructor.
4)An abstract class can have static methods.	Interface cannot have static methods.
5)You can extends one abstract class.	You can implement multiple interfaces.
 Can we define private and protected modifiers for variables in interfaces?
No, they are implicitly public.

 When can an object reference be cast to an interface reference?
An object reference can be cast to an interface reference when the object implements the referenced interface.


*/