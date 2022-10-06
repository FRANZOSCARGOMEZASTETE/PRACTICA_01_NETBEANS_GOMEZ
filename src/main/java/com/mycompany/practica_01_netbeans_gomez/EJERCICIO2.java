/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_01_netbeans_gomez;

/**
 *
 * @author FRANZGOMEZ
 */
public class EJERCICIO2 {
public static void main(String[]args){
String nombres []={"Victor", "Ronald","Carolina","Paola"};
int edad []={25,30,19,22};
char sexo []={'M','M','M','F'};
          System.out.println("Datos de los usuarios"); 
          System.out.println("NOMBRESEDAD SEXO");
System.out.println("------- ---- ----");
for (int u=0;u<nombres.length;u++){
System.out.println(nombres[u]+ " "+ edad[u] + " " + sexo[u]);
}
}
}