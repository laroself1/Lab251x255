//Lab 2.5.5
public class InitTest {

   private  static  int nextId= (int)(1000* Math.random());
    {nextId++;}
    private  int id=nextId;
    //public  static void InitTest(){new InitTest();
    //nextId++;}-	 Increments  static field “nextId” each time when new instance of InitTest created;

   public static void getNextId(){System.out.println("static field nextId: "+(nextId));}
    public void getId(){System.out.println(" Id: "+(this.id)); }}
