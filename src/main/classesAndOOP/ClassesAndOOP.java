package main.classesAndOOP;

public class ClassesAndOOP {

    /*
    Properties or methods visibility (that you could access)
    Public: access everywhere
    Protected: access only in the class, the package and the subclass
    No mentioned: access only in the class and the package
    Private: access only in the class
     */

    /*
    Overloading VS Overriding
    Overloading:
        Method overloading means providing two or more separate methods in a class with the same name but different parameters
        Method return type may or may not be different and that allows us to reuse the same method name
        Overloading is very handy, it reduces duplicated code and we don't have to remember multiple method names
        Usually overloading happens inside a single class, but a method can also be treated as overloaded in the subclass of tha class.
        We can overload static and instance methods
        Usually overloading happens inside a single class, but a method can also be treated as overloaded in the subclass of that class. The subclass can have another overloaded version of the method
        Throw different checked or unchecked exceptions
     Overriding:
        Method overriding means defining a method in a child class that already exists in the parent class with same signature (same name, same arguments)
        We put @Override above the method definition
        We can't override static methods, only instance methods
        We can't override constructors and private methods
        We can't override final methods
        It must have same name and same arguments
        Return type can be a subclass of the return type in the parent class
        It can't have a lower modifier. For example if the parent method is protected then using private in the child is not allowed, but using public in the child would be allowed
        A subclass can use super.methodName() to call the superclass version of an overridden method
     */

    /*
    Static VS Instance methods
    Static methods:
        Static methods can't access instance methods and instance variables directly
        They are usually used for operations that don't require any data from an instance of the class (from 'this')
        In static methods we can't use the 'this' keyword

    Instance methods:
        Instance methods belong to an instance of a class
        To use an instance method we have to instantiate the class first usually by using the new keyword
        Instance methods can access instance methods and instance variables directly
        Instance methods can also access static methods and static variables directly

     A method should be a static method when she use any fields (instance variables) or instance methods

     Static variables:
        Use static keyword
        Static member variables
        Every instance of that class shares the same static variable
        If changes are made to that variable, all other instances will see the effect of the change
        Are not used very often but can sometimes be very useful
        That way static methods can access it directly

     Instance variables:
        Instance variables belong to an instance of a class
        Every instance has it's own copy of an instance variable
        Every instance can have a different value (state)
        Instance variables represent the state of an instance
        
    */

    /*
    Polymorphism:
    In case of inheritance, if the subclass has overridden a parent method, it is this method that will be called,
    otherwise, it is the parent method.
     */

    /*
    Abstract classes: we can not implement them, but we can use directly their methods in the subclasses
    Abstract methods: we must override the methods in the subclasses
    An abstract method is every time in a abstract class
     */

    /*
    Interface: we can implement multiples interfaces
    The methods must be implemented in the subclass
    An interface does not contain any properties, except constant properties
    An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
    An interface can contain any number of methods.
    You cannot instantiate an interface.
    An interface does not contain any constructors.
    All of the methods in an interface are abstract.
    An interface can extend multiple interfaces.
     */

    /*
    Polymorphism


     */
}
