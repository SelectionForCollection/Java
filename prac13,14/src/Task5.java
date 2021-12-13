import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();


        int value = 123456;
        System.out.println("---Add elements ( 6kk )");

        Date startAddLinkedTime = new Date();
        for(int i = 0; i < 6000000; i++) {
            if (i == 2999999) {
               linkedList.add(111111);
            }
            linkedList.add(value);
        }
        Date finishAddLinkedTime = new Date();

        System.out.print("linkedList - ");
        System.out.print(finishAddLinkedTime.getTime() - startAddLinkedTime.getTime());
        System.out.println(" ms");

        Date startAddArrayTime = new Date();
        for(int i = 0; i < 6000000; i++) {
            if (i == 2999999) {
                arrayList.add(111111);
            }
            arrayList.add(value);
        }
        Date finishAddArrayTime = new Date();

        System.out.print("ArrayList - ");
        System.out.print(finishAddArrayTime.getTime() - startAddArrayTime.getTime());
        System.out.println(" ms\n");
        //_______________________________________________________________________________
        System.out.println("---Find elements ( 3kk of 6kk )");

        Date startFindLinkedTime = new Date();
        for (Integer x: linkedList) {
            if (x == 111111){
                break;
            }
        }
        Date finishFindLinkedTime = new Date();

        System.out.print("linkedList - ");
        System.out.print(finishFindLinkedTime.getTime() - startFindLinkedTime.getTime());
        System.out.println(" ms");

        Date startFindArrayTime = new Date();
        for(Integer x: arrayList) {
            if (x == 111111) {
                break;
            }
        }
        Date finishFindArrayTime = new Date();

        System.out.print("ArrayList - ");
        System.out.print(finishFindArrayTime.getTime() - startFindArrayTime.getTime());
        System.out.println(" ms\n");
        //_______________________________________________________________________________

        System.out.println("---Remove elements ( 6kk )");

        Date startRemoveLinkedTime = new Date();
        for (int i = 5999999; i>=0; i--) {
            linkedList.remove(i);
        }
        Date finishRemoveLinkedTime = new Date();

        System.out.print("linkedList - ");
        System.out.print(finishRemoveLinkedTime.getTime() - startRemoveLinkedTime.getTime());
        System.out.println(" ms");

        Date startRemoveArrayTime = new Date();
        for (int i = 5999999; i>=0; i--) {
            arrayList.remove(i);
        }
        Date finishRemoveArrayTime = new Date();

        System.out.print("ArrayList - ");
        System.out.print(finishRemoveArrayTime.getTime() - startRemoveArrayTime.getTime());
        System.out.println(" ms");
    }
}