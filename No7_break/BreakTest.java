/**
 * 循环嵌套
 * 在循环前加标签，用：表示，break可以跳转到指定标签的循环外
 */

public class BreakTest
{
  public static void main(String[] args) {
    outer:
    for(int i=0;i<=5;i++)
    {
      for(int j=0;j<=5;j++)
      {
        System.out.println("i="+i+",j="+j);
        if(j==2)
        {
          break outer;
        }
      }
    }
  }
}
