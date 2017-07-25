public class PersonTest
{
  public static void main(String[] args) {
    Person p = new Person();
    p.SetAge(1000);
    System.out.println(p.GetAge());
    p.SetAge(30);
    System.out.println(p.GetAge());

    p.SetName("Jacky");
    System.out.println(p.GetName());
  }
}
