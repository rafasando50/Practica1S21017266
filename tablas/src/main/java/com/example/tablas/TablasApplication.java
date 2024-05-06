package com.example.tablas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class TablasApplication {

	public static void main(String[] args) {
		SpringApplication.run(TablasApplication.class, args);

		Scanner sc = new Scanner(System.in);
        boolean salir = true;

        while (salir) {
            System.out.println("Menu: ");
            System.out.println("1 Mostrar una tabla");
            System.out.println("2 Mostrar tablas del 2 al 5");
            System.out.println("3 Salir");
            System.out.print("Seleccione una opcion: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    mostrarTabla();
                    break;
                case "2":
                    mostrarTablasDel2Al5();
                    break;
                case "3":
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }

    static void mostrarTabla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de la tabla a mostrar ");
        int n = sc .nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n* i));
        }
        System.out.println();
    }

    static void mostrarTablasDel2Al5() {
        for (int i = 2; i <= 5; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

