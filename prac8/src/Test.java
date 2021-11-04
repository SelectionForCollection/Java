public class Test {
    Test(){};

    public void testWaitList(){

        WaitList<String> waitString = new WaitList<String>();//Объявление экземпляра WaitList для тестирования конструктора по умолчанию
        System.out.println(waitString.isEmpty());
        waitString.add("One");
        waitString.add("Two");
        waitString.add("Three");
        System.out.println(waitString.contains("One"));
        System.out.println(waitString.contains("Four"));
        System.out.println(waitString.isEmpty());
        System.out.println(waitString.toString());

        System.out.println("\n");

        WaitList<String> waitString1 = new WaitList<String>(waitString.content);
        System.out.println(waitString1.containsAll(waitString.content));
        System.out.println(waitString1.isEmpty());
        System.out.println(waitString1.toString());
        waitString1.add("Four");
        System.out.println(waitString1.toString());
        System.out.println(waitString1.remove());
        System.out.println(waitString1.toString());

    }
    public void testBoundedWaitList(){
        BoundedWaitList<Boolean> BoundedWaitListBool = new BoundedWaitList<>(4);//Объявление экземпляра BoundedWaitList для тестирования конструктора по умочанию
        System.out.println(BoundedWaitListBool.toString());
        System.out.println("Емкость списка равна " +  BoundedWaitListBool.getCapacity());
        BoundedWaitListBool.add(1);
        BoundedWaitListBool.add(0);
        BoundedWaitListBool.add(0);
        BoundedWaitListBool.add(0);
        BoundedWaitListBool.add(1);
        System.out.println(BoundedWaitListBool.toString());
    }
    public void testUnfairWaitList(){
        UnfairWaitList<Integer> UnfairWaitList = new UnfairWaitList<Integer>();//Объявление экзепляра UnfairWaitList для тестирования конструктора по умоляанию
        UnfairWaitList.moveToBack(1);
        UnfairWaitList.remove(3);

    }

}
