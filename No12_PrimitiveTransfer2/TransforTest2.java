public class TransforTest2
{
  public static void swap(DataWrap dw)
  {
    int temp = dw.a;
    dw.a = dw.b;
    dw.b = temp;
    System.out.println("a="+dw.a+",b="+dw.b);
  }
  public static void main(String[] args) {
    DataWrap dw=new DataWrap();
    dw.a = 5;
    dw.b = 6;
    System.out.println("a="+dw.a+",b="+dw.b);
    swap(dw);
  }
}


class DataWrap
{
  int a;
  int b;
}
