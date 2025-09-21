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
  - 
# Constructors
- Constructors initialize objects when created.
- They have the same name as the class and no return type.
- Constructors are called once during object creation and cannot be called like methods.

# There are three types:

- Non-parameterized constructor
- Parameterized constructor
- Default constructor (called if no constructor is explicitly defined)


-- Creating a student constructor and whenever creating an object for that Student class calling the constructor of that class and if we does not create a constructor  in a java program the bt default constructor will be called for the particular programme

-- constructors are created while calling a function
-- constructors does not have an return type
-- constructor can be called only once we can not call a constructor again and again just like other methods

# Desconstructors
-- in java we dont have to create a deconstructor because in java we had a automatic garbage collector 
thats why we dont use a desconstructor in java


# Polymorphism 
-- polymorphis is define as which may have many forms
## Run time Polymorphism
-- It can not detect errors while compilation of the code
-- This is more Harmful as compare to complile time beacuse it does not detect errors at the time of complilation of the code

## Compile time Polymorphism
-- It can detect the Errors during the compilation of the code
-- 


-- When an object is created, the constructor of that class is called.
-- If no constructor is created, the default constructor is called automatically.


-- This version summarizes each topic clearly and keeps your exact content in concise form for a GitHub README.```markdown

-- Java Classes, Objects, and Constructors
#   Classes and Objects
-- A class is a blueprint to create objects.
-- An object is an instance of a class.

-- Objects hold data and behavior defined by their class.

# The this Keyword
# Refers to the current object instance.

-- Used to distinguish instance variables from parameters with the same name.

Example: this.variableName refers to the object's variable.

Creating Objects
Objects are created using new ClassName().

Creating an object calls the class constructor.



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

-- When an object is created, the constructor of that class is called.

-- If no constructor is created, the default constructor is called automatically.
--  PreBuild bacakes In java and user define packages in java
-- Using these we can use dada of one class to another classes in java

# Access modifiers in java
-- Public Access modifiers
-- Private Access modifiers
-- Protected Access modifiers
-- Default Access Modifiers

# notes in my own language

-- today i had studied about use of classes and implimentation of classes
--  also use of this keyword
-- how to create objects and how objects are called by this key word in java






