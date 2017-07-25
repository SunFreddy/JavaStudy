public class ForTest
{
  public static void main(String[] args) {
    for(int i=0;i<=10;i++)
    {
      System.out.println("number"+i);
    }
    System.out.println("End");
    //将for循环变量初始化在for之前，这样j的结果在循环结束后仍然可以访问
    //但是循环变量作用域变大后，之后的循环程序就不能在使用该变量了
    int j=0;
    for (;j<=10 ;j++ )
    {
      System.out.println("number"+j);
    }
    System.out.println("j="+j);
  }
}
