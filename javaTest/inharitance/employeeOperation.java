package inharitance;

import java.util.*;

public class employeeOperation extends employee{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter name: ");
    String desiredName = in.next();
    employee ep = new employee();
    ep.employeePrimaryDetail(desiredName);
    in.close();
  }
}
