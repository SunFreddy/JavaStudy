public class objectTest
{
  public static void main(String[] args) {
    person p=new person();
    p.say("Hello");
  }
}

class person
{
  public String name;
  public int age;
  public void say(String content)
  {
    System.out.println(content);
  }
}
