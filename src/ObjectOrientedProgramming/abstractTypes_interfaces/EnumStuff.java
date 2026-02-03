package ObjectOrientedProgramming.abstractTypes_interfaces;

/**
 * We have another problem: You want to switch between some cases (more than 2)
 * When one case is chosen, other ones should be set to false
 * This is actually very difficult to implement just as it is
 *
 * Meet: Enums: All cases are public, static and final
 *              Variables (like the boolean below or the int) are as it is,
 *                  meaning they are not public, static and final until declared
 *                  => since Enums can't be instantiated, their non-static
 *                     variables are called on objects whose class calls on the
 *                     enum (see MainStuff)
 *
 */
enum EnumStuff { // enum: enumeration: Aufzählung
    CASE1, CASE2, CASE3, CASE4; // etc

    /**
     * you check for enum cases with switch
     */
    boolean checkCases(){
        switch(this){
            case CASE3: return true;
            default: return false;
        }
    }

    int number = 0;
}

class SpecificCase {
    EnumStuff specificCase = EnumStuff.CASE1;
}
