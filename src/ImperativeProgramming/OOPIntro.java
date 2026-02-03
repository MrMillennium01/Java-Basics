package ImperativeProgramming;

/**
 * Classes vs Objects/Instances
 * Classes are blueprints, so only the structure of something
 * Objects define the structure with concrete/specific values
 * Objects and Classes have properties
 * They also can have Capabilities to change their properties
 * Objects are reference data types (their memory holds the address of its values)
 */

public class OOPIntro {
    public static void main(String[] args){
        Student li = new Student("li", 18);
        System.out.println(li);
        System.out.println(Student.moin + ", mein Name ist " +
                li.name + ", ich bin " + li.alter + " Jahre alt und studiere "+ li.studiengang);
        // change something
        li.studiengang = "Wirtschaftsinformatik";
        System.out.println(Student.moin + ", mein Name ist " +
                li.name + ", ich bin " + li.alter + " Jahre alt und studiere "+ li.studiengang);
        li.vorstellen();

        // new object:
        Student.defaultStudiengang = "Maschinenbau";
        // change the property of whole class: works for all later objects
        Student max = new Student("Max", 23);
        max.vorstellen();

        // new object:
        Student.setMoin("Hallo"); // the same as Student.moin = "Hallo";
        // but unlike max.moin = etc. it is a class variable,
        // so it can not be changed for one single object: it is static
        Student lorenz = new Student("Lorenz", 21);
        lorenz.vorstellen();

        System.out.println("Uni: " + Student.UNI + " ist gleich " + lorenz.UNI);

        // call instance method
        Changer.changeAlter(lorenz, 25);
        Changer.announcement();
        lorenz.vorstellen();

        System.out.println();
        // ClassName.nameOfVariable.instanceMethod()
    }
}

class Student { // this is a package thingy
    // fields
    // Instance variables: specific for Object, not Class
    String name;
    int alter;
    String studiengang;

    // Class variables: for the whole Class (the blueprint of all Objects), always has static
    static String moin = "Moin";
    static String defaultStudiengang = "Informatik";
    public static final String UNI = "TU Berlin"; // cannot be changed

    // constructor - like python __init__
    public Student(String hallo, int alter){
        // this method takes the variables at the beginning,
        // while other instance variables only can be changed later
        this.name = hallo;
        this.alter = alter;
        this.studiengang = defaultStudiengang;
    }

    // class method
    public static void setMoin(String neuMoin) {
        moin = neuMoin;
    }

    // methods
    public void vorstellen(){
        System.out.println(moin + ", mein Name ist " +
                name + ", ich bin " + alter + " Jahre alt und studiere "+ studiengang + " an der " + UNI);
    }
}

class Changer{
    private int geheimzahl = 42; // can only be seen within the same class;
    // instance variables are mostly private
    // int nichtGanzSoGeheim = 37; declared in package, so file paths
    protected int fastPublic = 7; // can also be seen by all its subclasses
    public static void announcement(){
        // public can be seen by all classes, mostly only used for methods
        System.out.println("Ich verändere was!");
    }
    static void changeAlter (Student x, int alter) {
        // instance method: no static in its name
        x.alter = alter;
    }
}
