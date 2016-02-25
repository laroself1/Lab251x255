public class MyInitTest {

static{System.out.println("static block 1");}
static { System.out.println("static block 2");}

{System.out.println("non static block 1");}
{System.out.println("non static block 2");}

public void Costructor(){System.out.println("Constructor 1");}
public void Costructor(int i){this.Costructor();System.out.println("Constructor 2");} }
