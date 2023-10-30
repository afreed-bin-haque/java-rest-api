package inharitance;

public class employee {
  public void employeePrimaryDetail(String name){
    if(!name.isEmpty()){
      System.out.println("Hi :"+name);
    }else{
      System.out.println("Please print your desired employee name here");
    }
  }
}
