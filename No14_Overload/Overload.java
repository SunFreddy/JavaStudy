/**
 * 方法重载，允许多个同名的方法，只要形参列表不同就可以
 */

public class Overload
{
  public void test()
  {
    System.out.println("No parameter");
  }
  public void test(String msg)
  {
    System.out.println("Overload method "+msg);
  }
  public static void main(String[] args) {
    Overload ol=new Overload();
    ol.test();
    ol.test("hello");
  }
}
