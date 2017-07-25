/**
 * 形参个数不定
 */

public class Varargs
{
  public static void booklist(String... books)
  {
    for(String tmp:books)
    {
      System.out.println(tmp);
    }
  }
  public static void main(String[] args) {
    booklist("book1","book2","book3");
  }
}
