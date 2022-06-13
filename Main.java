import java.text.*;
import java.util.*;

class Main {

  public static double productCost(Product n)
  {
    double pc = n.getPrice() * n.getQuantity();
    return pc;
  }

  public static double grandTotal(Product[] r)
  {
    double gt = 0.0;
    for (Product od : r)
    {
      gt += (od.getPrice() * od.getQuantity());
    }
    return gt;
  }
 
  public static void main(String[] args)
  {

    Product[] objects = new Product[6];
  
  Product p = new Product(); 
  Men m = new Men();
  Electronics e = new Electronics();
 Clothing c = new Clothing();
    Media mn = new Media();
    Women w = new Women();
    //populate array
    objects[0] = p;
    objects[1] = m;
    objects[2] = e;
    objects[3] = c;
    objects[4] = mn;
    objects[5] = w;


    for (Product x : objects)
    {
      System.out.println(x + "\n");
    }
    System.out.println("-------------------------------------------------------");


    NumberFormat nf=NumberFormat.getCurrencyInstance();
    String fmt = "%1$20s %2$20s %3$15s %4$15s %5$15s";
    System.out.printf(fmt, "Name", "Company", "Quantity" , "Price", "Total Cost\n");
    System.out.println("*******************************************************************************************");

    for(int i = 0; i<objects.length; i++)
    {
      System.out.printf(fmt, objects[i].getName() , objects[i].getCompany() , objects[i].getQuantity(), nf.format(objects[i].getPrice()), nf.format(productCost(objects[i])));
     
      System.out.println();
    }
    System.out.println("*******************************************************************************************");
    System.out.printf("Grand Total%20s" , nf.format(grandTotal(objects)));
  }
}