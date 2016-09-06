package balbooh;
public class Calculator {
public double result=0;
public static void main (String args[]){
Calculator calc=new Calculator();
calc.addsum(3,3);


}


public void addsum (double a,double b){
this.result=a+b;
}
public void addsubstract (double a,double b){
this.result=a-b;}
public void adddiv (double a,double b){
this.result=a/b;}
public void addmultiple (double a,double b){
this.result=a*b;}
}







