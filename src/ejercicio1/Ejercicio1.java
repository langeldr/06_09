/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Random;

/**
 *
 * @author angel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


Random dado= new Random();
int d1,d2,d3;


d1=dado.nextInt(6)+1;
System.out.println(d1);


d2=dado.nextInt(6)+1;
System.out.println(d2);

d3=dado.nextInt(6)+1;
System.out.println(d3);
 
//d1=6;d2=6;d3=6;

if (d1==6 && d2==d1 && d3==d2){
    System.out.println("Excelente los tres arrojaron 6");
    }
else if((d1==6 && d2==d1) && (d1!=d3 && d2!=d3)){
System.out.println("muy bien dos dados tienen seis");
    }
else if((d1==6 && d3==d1) && (d1!=d2 && d3!=d2)){
System.out.println("muy bien dos dados tienen seis");
    }
else if((d2==6 && d3==d2) && (d2!=d1 && d2!=d1)){
System.out.println("muy bien dos dados tienen seis");
    }
else if(d1==6 && d1!=d2 && d1!=d3){
System.out.println("Regular solo uno tiene seis");
    }
else if(d2==6 && d2!=d1 && d2!=d3){
System.out.println("Regular solo uno tiene seis");
    }
else if(d1==6 && d1!=d2 && d1!=d3){
System.out.println("Regular solo uno tiene seis");
    }
else if(d3==6 && d3!=d2 && d3!=d1){
System.out.println("Regular solo uno tiene seis");
    }
else if(d1!=6 && d2!=6 && d3!=6){
System.out.println("Pesimo ningun seis xxx");
    }
    }
       
}
