package Ejercicio1;
public class Clase1 {
    //inicializacion de valiables
 private String var1;
 private int var2;
 private double var3;
 private float var4;
 private boolean var5;
 public Clase1(){//metodo constructor

    var1 = "hola";
    var2 = 2;
    var3 = 2;
    var4 = 3;
    var5 = true;
 }


 public static void main(String[] args) {
    Clase1 vars = new Clase1();
    System.out.println(
        vars.var1 + "\n" +
        vars.var2 + "\n" +
        vars.var3 + "\n" +
        vars.var4 + "\n" +
        vars.var5 + "\n" 
    );
 }
//encapsulamineto
 public String getVar1(){
    return var1;
 }
 public int getVar2(){
    return var2;
 }
 public double getVar3(){
    return var3;
 }
 public float getVar4(){
    return var4;
 }
 public boolean getVar5(){
    return var5;
 }

}
