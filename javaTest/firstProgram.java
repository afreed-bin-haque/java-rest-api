public class firstProgram{
  static String inharite = "Default value inharite from all";
  String author;
  double version;
  
  public firstProgram(String a, double v){
     author = a;
     version = v;
  }

  public void display(){
    System.out.println("Author of this software is "+author+" and software version is: "+version);
  }
  public static void someDataTypeExample(){
    int baseNumber = 123456789;
    String text = "This is an string variable";

    System.out.println("Int: "+baseNumber);
    System.out.println("String: "+text);
    System.out.println("Default value from second class: "+inharite);
  }

  public static void switchCase(){
    int day = 4;
    switch(day){
      case 1 :
      System.out.println("Tody is Statuday");
      break;
      case 2 : 
      System.out.println("Tody is Sunday");
      break;
      case 3 : 
      System.out.println("Tody is Monday");
      break;
      case 4:
      System.out.println("Tody is Tuesday");
      break;
      default:
      break;
    }
  }
  public static void main(String [] args){
    firstProgram.someDataTypeExample();
    System.out.println("Default value from main class class: "+inharite);
    firstProgram.switchCase();
     firstProgram fp = new firstProgram("Afreed Bin Haque", 1.0);
     fp.display();
  }
}