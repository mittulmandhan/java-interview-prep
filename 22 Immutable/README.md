# Immutable Classes
* Immutable class means that once an object is created its content can not be changed.
* In Java, all the wrapper classes(such as Integer, Float, Character, etc) are immutable.
* String class is also Immutable.
* Immutable classes are needed when we wan to make a class whose fields/member variables once intialized can't be changed.

### Steps to make an Immutable class:
<br>__Step 1:__ Create a final class
  <br>(so that it cannot be inherited and resultantly overriding of the methods prevented)
<br><br>__Step 2:__ Data members must be declared as final
  <br>(so that we cannot change the value once initialized)
<br><br>__Step 3:__ A parameterized constructor
  <br>(which will be used to initialize the data members during object creation)
<br><br>__Step 4:__ Getter method for all the variables/data members in it
  <br>(To provide a systematic interface to fetch the data members)
<br><br>__Step 5:__ No setters
  <br>(obviously to prevent any modification in the values of data members)
  
* eg 1:
````
public final class Immutable {
  private final int x;
  
  public Immutable(int x) {
    this.x = x;
  }
  
  public String convertToString() {
    return ""+x;
  }
  
  public static void main(String[] args) {
    Immutable i  = new Immutable(5);
    System.out.println(i.convertToString());// 5
    
    i  = new Immutable(6);
    System.out.println(i.convertToString());// 6
  }
}
````
__output:__
````
5
6
````

* eg 2:
````
package example2;

public final class Student {
	private final String name;
	private final int roll;
	
	Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
	public String getStudentName() {
		return this.name;
	}
	public int getStudentRoll() {
		return this.roll;
	}
}
````
````
package example2;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("Mittul", 10);
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentRoll());
		
		Student s2 = new Student("Bheem", 11);
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentRoll());
	}
}
````
__output:__
````
Mittul
10
Bheem
11
````












