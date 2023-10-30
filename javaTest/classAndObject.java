public class classAndObject {
  int x = 0;
  static int y = 0;

  //Constructor
  public classAndObject(){
    x++;
    y++;
    System.out.println("Value of X: "+x);
    System.out.println("Value of Y: "+y);
  }

  public static void main(String[] args) {
    classAndObject cAo = new classAndObject();
    System.out.println(cAo.x);
    System.out.println(classAndObject.y);
  }
}
