package rali;
public class Road {
public static void main(String[] args){
  Car nis=new Car();
   nis.showGas();

  Car bmw = new Car();
  bmw.fill(30);
  bmw.showGas();
  bmw.drive (20);
  bmw.showGas();
  nis.showGas();
  gasStation();
  }


  
  

  
public static void gasStation(){

System.out.println("заправка1");

}




}
