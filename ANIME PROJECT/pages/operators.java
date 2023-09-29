class main
{
 public static void main(String args[])
 {
  pie=3.14;
  int c;
  class circle
  {
   int r=2;
   System.out.println("r=",+r);
  }
  class result extends circle
  {
   c=pie*r*r;
   System.out.println("the area of circle:",+c);
  }
 }	
}