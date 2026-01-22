public class ArraysAndLoops {
    public static void main(String[] args){
        System.out.println(15 + 29 + "lol" + 15 + 29);

        int[] newArr = {32, 4537, 4326, 5647854, 856, 9, 789};

        System.out.println(java.util.Arrays.toString(newArr));

        int [][][] twoDArr = {{{25, 3425}, {23, 236}}};

        System.out.println(java.util.Arrays.deepToString(twoDArr));
        System.out.println(twoDArr.length); // get length of array (only first depth, so not the whole dimensions)

        for (int element: newArr){ // like the for loop in python
            System.out.println(element); // name in Java: for-each (not only for-loop)
        }

        // loops can be also written in one line, when only one line in the loop
        for (int element: newArr) System.out.println(element); // same as above

        // unterschied: tiefenkopie und flachkopie
        int [] copyArr = newArr; // flachkopie: nur Referenz kopiert, denselben Speicher
        System.out.println(copyArr[0] + "=" + newArr[0]);
        copyArr[0]++;
        System.out.println(copyArr[0] + "=" + newArr[0]);

        int [] deepArr = new int[newArr.length]; // tiefenkopie
        for (int i=0; i<newArr.length;i++) {
            deepArr[i] = newArr[i]; // unterschiedliche Speicher
        }
        System.out.println(deepArr[0] + "=" + newArr[0]);
        deepArr[0]++;
        System.out.println(deepArr[0] + "=" + newArr[0]);

        // do-while vs while: do-while führt alles mindestens 1-mal aus, while 0-mal
        // while(false) System.out.println("Hello"); => kein einziges Mal ausgeführt

        do System.out.println("Hello"); while(false);

        do {
            System.out.println("Hello"); // das gleiche wie oben
        } while(false);
    }
}
