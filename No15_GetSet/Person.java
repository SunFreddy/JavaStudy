public class Person
{
  private String name;
  private int age;
  public void SetName(String name)
  {
    if (name.length() >6 || name.length() < 2)
    {
      System.out.println("This name is illegal");
      return;
    }
    else
    {
      this.name=name;
    }
  }
  public String GetName()
  {
    return this.name;
  }
  public void SetAge(int age)
  {
    if (age > 100 || age <0 )
    {
      System.out.println("This age is illegal");
      return;
    }
    else
    {
      this.age=age;
    }
  }
  public int GetAge()
  {
    return this.age;
  }
}
