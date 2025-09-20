# Java Classes, Objects, and Constructors

## Classes and Objects
- A **class** is a blueprint to create objects.
- An **object** is an instance of a class.
- Objects hold data and behavior defined by their class.

## The `this` Keyword
- Refers to the current object instance.
- Used to distinguish instance variables from parameters with the same name.
- Example: `this.variableName` refers to the object's variable.

## Creating Objects
- Objects are created using `new ClassName()`.
- Creating an object calls the class constructor.

## Constructors
- Constructors initialize objects when created.
- They have the same name as the class and no return type.
- Constructors are called once during object creation and cannot be called like methods.
- There are three types:
  - Non-parameterized constructor
  - Parameterized constructor
  - Default constructor (called if no constructor is explicitly defined)

## Example: Student Class

public class Student {
String name;
int age;

// Parameterized constructor
public Student(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Student constructor called");
}

public static void main(String[] args) {
    // Creates object and calls constructor
    Student student1 = new Student("Alice", 20);
}
}

- When an object is created, the constructor of that class is called.
- If no constructor is created, the default constructor is called automatically.


This version summarizes each topic clearly and keeps your exact content in concise form for a GitHub README.```markdown

Java Classes, Objects, and Constructors
Classes and Objects
A class is a blueprint to create objects.

An object is an instance of a class.

Objects hold data and behavior defined by their class.

The this Keyword
Refers to the current object instance.

Used to distinguish instance variables from parameters with the same name.

Example: this.variableName refers to the object's variable.

Creating Objects
Objects are created using new ClassName().

Creating an object calls the class constructor.


Constructors
Constructors initialize objects when created.

They have the same name as the class and no return type.

Constructors are called once during object creation and cannot be called like methods.

There are three types:

Non-parameterized constructor

Parameterized constructor

Default constructor (called if no constructor is explicitly defined)

Example: Student Class

public class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student constructor called");
    }

    public static void main(String[] args) {
        // Creates object and calls constructor
        Student student1 = new Student("Alice", 20);
    }
}

When an object is created, the constructor of that class is called.

If no constructor is created, the default constructor is called automatically.






-- today i had studied about use of classes and implimentation of classes
--  also use of this keyword
-- how to create objects and how objects are called by this key word in java


# constructors
-- constructors are created while calling a function
-- constructors does not have an return type
-- constructor can be called only once we can not call a constructor again and again just like other methods

# there are three type of constructores

-- non perameterized constructor
-- perameterized constructor
-- and default constructore


-- Creating a student constructor and whenever creating an object for that Student class calling the constructor of that class and if we does not create a constructor  in a java program the bt default constructor will be called for the particular programme


-- Desconstructors
-- in java we dont have to create a deconstructor because in java we had a automatic garbage collector 
thats why we dont use a desconstructor in java

