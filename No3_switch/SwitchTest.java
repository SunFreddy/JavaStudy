/**
 * case后面语句块括号可以省略
 * switch后面的数据类型只能是int、short、char、byte、string和枚举类型，不能是Boolean型
 */

public class SwitchTest
{
  public static void main(String[] args) {
    char grade = 'C';
    switch (grade)
    {
      case 'A':
      System.out.println("youxiu");
      break;
      case 'B':
      System.out.println("liang");
      break;
      case 'C':
      System.out.println("jige");
      break;
      case 'D':
      System.out.println("bujige");
      break;
      default:
      System.out.println("wrong");
    }
  }
}
