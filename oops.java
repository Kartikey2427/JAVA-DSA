public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();

        //single level
        Fish shark = new Fish();
        shark.eat();

        // multi level
        Volleyball v = new Volleyball();
        v.bat();
        v.goal();

        // hierarchial
        Kautilya k = new Kautilya();
        k.code();
        k.sing();

        Kahani kt = new Kahani();
        kt.code();
        kt.dance();
        

        // method overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum((float)1.5,(float)2.5));

        // method overriding
        Deer d = new Deer();
        d.eats();

        //abstract 
        Comodo c = new Comodo();
        c.drink();
        c.walk();

        Chicken ck = new Chicken();
        ck.drink();
        ck.walk();

        //interface
        Queen q = new Queen();
        q.moves();

        King kg = new King();
        kg.moves();

        // multiple inheritance
        Beer br = new Beer();
        br.eates();

        //Super Keyword
        Vinayak vyk = new Vinayak();
    }
}


// Constructor
class Student {
    String name;

    //defining constructor (if not defined..java will automatically do it at the time of object creation)

    Student () {
        System.out.println("Constructor is called..");
    }
}


// Encapsulation ( Wrapping up of data and member function together... Also implements data hiding)

class Pen{
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}


// Inheritance -> When prop & methods of base(parent) class is passed to the derived(child) class

// Single level inheritance
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }
}

class Fish extends Animal{
    void swim() {
        System.out.println("Swims");
    }
}


// Multi level inheritance ->[ base class-> derived class -> derived class]
class Cricket {
    void bat () {
        System.out.println("VK bats");
    }
}

class Football extends Cricket {
    void goal() {
        System.out.println("Messi goals");
    }
}

class Volleyball extends Football{
    void smash(){
        System.out.println("Smashes");
    }
}

// Hierarchial inheritance ->[ base class-> derived class1 -> derived class2]
class Kartikey {
    void code(){
        System.out.println("Kartikey Codes");
    }
}

class Kahani extends Kartikey{
    void dance() {
        System.out.println("Kahani dance");
    }
}

class Kautilya extends Kartikey {
    void sing() {
        System.out.println("Kautilya sings");
    }
}

// Hybrid inheritance (base class then derived class then derived classes sub derived class from derived class)
  // base class 
    // DC 1
        // dc 2 (from DC1)
  //  DC 2   


// Polymorphism (many forms)
// When we try to achieve same things in multiple forms

// 1. Compile time polymorphism
        // ** Method Overloading
                // Functions with same name but different parameters

            class Calculator {
                int sum(int a, int b) {
                    return a+ b;
                }

                int sum(int a , int b, int c){
                    return a+b+c;
                }

                float sum( float a , float b){
                    return a + b;
                }
            }


// 2. Run time Polymorphism
        // ** Method overriding
                // both base and derived class have same function name but with different definitions

            class Animals{
                void eats() {
                    System.out.println("Eats anything");
                }
            }

            class Deer extends Animal {
                void eats() {
                    System.out.println("Eats grass");
                }
            }



// Package - collection of similar types of classes, interfaces and sub packages
// Two types
// In- build(ex - util or utility package for Scanner sc) and User defined packages



// Abstraction
// Hiding the implementation details and showing necessary things is known as abstraction
// Can be achieved by -->
// 1. Abstract class   (cannot create object of abstract class)

abstract class Lizard{
    void drink(){
        System.out.println("Drinks");
    }
    abstract void walk();
}

class Comodo extends Lizard{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Lizard {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}


// 2. Interfaces 
// used to achieve multiple inheritance and total abstraction(100%) 

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("Up,down,left,right,diagonally");
    }
}

class King implements ChessPlayer{
    public void moves() {
        System.out.println("left,right,up,down,diagonally(1 step)");
    }
}


// Multiple Inheritance
interface Herbivorous{
    void eates();
}

interface Carnivorous{
    void eates();
}

class Beer implements Herbivorous,Carnivorous{
    public void eates(){
        System.out.println("Eats both");
    }
}


// super keyword
class Harsh{
    Harsh (){
        System.out.println("Harsh constructor is called");
    }
}

class Vinayak extends Harsh{
    Vinayak (){
        super();
        System.out.println("Vinayak constructor is called");
    }
}