/**
 * Every Class is a subclass of the Main Class "Object"
 * So everything inherits properties from there automatically
 * below are some key methods of Objects
 */

public class BasisObject {
    /**
     * compares an Object with another one (so all properties, when they are from the same class)
     * @param obj   the reference object with which to compare.
     * It's usually: this.variableName == obj.variableName
     *      variableName is just some placeholder name I came up with - replace with the real variable names
     */
    @Override // this overrides the inherited equals method of "Object" Class
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * used for cryptography etc.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * overridden the most, since it returns memory address etc, which is not human readable
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * wonder what super or super() means?
     * ----------
     *      super.methodName (methodName is just the name of a method you want to call)
     * this calls the method, but only the method in the parent class, even if the method
     * was overridden in the child class - it excludes the stuff in the child class, so
     * only the stuff in the parent class and only the parent class are called
     *      So, it is similar to this.methodName, but "this" calls the method in the child
     * class while super calls the method in the class above
     * ---------
     *      super() is something vastly different: it is similar to this()
     * this(<params>) calls the constructor (in the same subclass)
     * => super(<params>) calls the constructor of the parent call
     * For example, see ObjectInheritence.java
     */

    public static void main(String[] args){
        OfficeBuilding meins = new OfficeBuilding(2323464, 3243, "Bahnhof", "Li");
        OfficeBuilding deins = new OfficeBuilding(245, 356, "fag", "deins");

        System.out.println(deins.equals(meins));
    }
}