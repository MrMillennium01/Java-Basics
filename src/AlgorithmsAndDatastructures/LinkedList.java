package AlgorithmsAndDatastructures;

import java.util.ArrayList;

/**
 * has a defined element before this element and one after this element
 */
public class LinkedList {
    ArrayList<ListElement> list = new ArrayList<ListElement>();

    private class ListElement {
        Object val;
        ListElement previousElement;
        ListElement nextElement;

        ListElement(Object o){
            this.val = o;
            this.previousElement = list.getLast();
        }
    }

    LinkedList(ListElement e){
        this.list.getLast().nextElement = e;
        this.list.add(e);
    }
}
