import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        MyInitTest L = new MyInitTest();
        L.Costructor(1);
        MyInit i1 = new MyInit();
        MyInit i2 = new MyInit();
        MyInit i3 = new MyInit();

        i1.printArray();System.out.println("-- arr1");
        i2.printArray();System.out.println("-- arr2");
        i3.printArray();System.out.println("-- arr3");
        System.out.println();
//Lab 2.5.5
        /*InitTest.getNextId();
        InitTest.InitTest();
        InitTest.InitTest();       Increments  static field “nextId” each time when new instance of InitTest created;
        InitTest.InitTest();
        InitTest.getNextId();*/

InitTest.getNextId();
        InitTest A = new InitTest();A.getId();
        InitTest B = new InitTest();B.getId();
        InitTest C = new InitTest();C.getId();
        InitTest D = new InitTest();D.getId();
        InitTest E = new InitTest();E.getId();
        InitTest.getNextId();

}}

