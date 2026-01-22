package BasicConcepts;

public class SetterGetter {
    public static void main(String[] args){
        // instance variables
        SetterAndGetter s = new SetterAndGetter();
        System.out.println(s.getNumber());
        s.setNumber(10);
        System.out.println("New number: " + s.getNumber());

        // class variable
        System.out.println(SetterAndGetter.getClassNumber());
        SetterAndGetter.setClassNumber(5);
        System.out.println("New number: " + SetterAndGetter.getClassNumber());
    }
}

/**
 * commom practice: every variable is private and change and getting using:
 * getter and setter
 */
class SetterAndGetter {
    // example for instance variables
    private int number = 0;

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int newNumber){
        this.number = newNumber;
    }

    // also works with static, so class variables
    private static int classNumber = 0;

    public static int getClassNumber(){
        return classNumber;
    }

    public static void setClassNumber(int newClassNumber){
        classNumber = newClassNumber;
    }
}
