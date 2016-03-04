package com.company;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        String nombre, apellido, cedula;
        float telefono;
        int cont1 = 0, cont2 = 0, cont3 = 0;
        int cursos;
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "s";
        while (opcion.equals("S") || opcion.equals("s")) {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = n.readLine();
            System.out.print("Ingrese el apellido del estudiante: ");
            apellido = n.readLine();
            System.out.print("Ingrese la cedula: ");
            cedula = n.readLine();
            System.out.print("Ingrese su numero telefonico: ");
            telefono = Float.parseFloat(n.readLine());
            System.out.println("Elija el curso deseado:");
            System.out.println("1.-Programacion en C++");
            System.out.println("2.-Programacion en Python");
            System.out.println("3.-Ptogramacion en Java");
            System.out.println("4.-Salir");
            System.out.print("Curso: ");
            cursos = Integer.parseInt(n.readLine());
            switch (cursos) {
                case 1:
                    System.out.print("Usted ha escogido el curso de C++");
                    cont1++;
                    break;
                case 2:
                    System.out.print("Usted ha escogido el curso de Python");
                    cont2++;
                    break;
                case 3:
                    System.out.print("Usted ha escogido el curso de Java");
                    cont3++;
                    break;
                case 4:
                    System.out.print("Ha finalizado con el uso del programa.");
                    break;
                default:
                    System.out.print("ERROR.A ingresado un valor no valido");
                    break;
            }
            System.out.println("Desea continuar? S = si y N = no");
            opcion = n.readLine();
        }
        System.out.println("Listado de estudiantes:");
        System.out.println("\nC++:");
        System.out.print("Cantidad de estudiantes: " + cont1);
        System.out.println("\nPython:");
        System.out.print("Cantidad de estudiantes: " + cont2);
        System.out.println("\nJava:");
        System.out.print("Cantidad de estudiantes: " + cont3);
    }
}
