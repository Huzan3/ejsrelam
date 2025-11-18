package ejerciciosrelampago;

import java.util.ArrayList;
import java.util.Scanner;

public class respuestas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hola mundo");

        // --------------------------------------------------------------------------------------------------------
        System.out.println("---Calcladora de numeros---");
        System.out.println("Introduzca el primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("Introduzca el segundo numero");
        double numero2 = sc.nextDouble();

        double resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);

        // --------------------------------------------------------------------------------------------------------
        System.out.println("---Calculadora de area---");
        System.out.println("Introduzca el radio del circulo");
        double radio = sc.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El area es: " + area);

        // --------------------------------------------------------------------------------------------------------
        System.out.println("Conversor de temperatura");
        double celsius = sc.nextDouble();
        double farenheit = celsius * 1.8 + 32;
        System.out.println("Conversor de celsius es: " + farenheit);

        // --------------------------------------------------------------------------------------------------------
        System.out.println("Numero ¿Par o Impar?");
        double num = sc.nextDouble();

        if (num % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        // --------------------------------------------------------------------------------------------------------
        System.out.println("Mayor de tres numeros");
        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = sc.nextInt();

        int mayor = num1;

        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        System.out.println("El numero mayor es: " + mayor);

        // --------------------------------------------------------------------------------------------------------
        System.out.println("Aprobado o suspenso");

        System.out.println("Introduzca su nota");
        int nota = sc.nextInt();
        if (nota >= 60) {
            System.out.println("Has aprobado");
        } else  {
            System.out.println("Has suspendido");
        }

        // --------------------------------------------------------------------------------------------------------
        System.out.println("Que dia de la semana es");
        ArrayList<String> dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");

        System.out.print("Introduce un número (1-7): ");
        int nums = sc.nextInt();

        if (nums >= 1 && nums <= 7) {
            System.out.println("El día es: " + dias.get(nums - 1));
        } else {
            System.out.println("Número inválido. Debe ser entre 1 y 7.");
        }

        // --------------------------------------------------------------------------------------------------------
        System.out.println("---Calculadora simple---");
        System.out.println("Introduzca el primer número:");
        double a = sc.nextDouble();
        System.out.println("Introduzca el segundo número:");
        double b = sc.nextDouble();
        System.out.println("Introduzca la operación (+, -, *, /):");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Resultado: " + (a + b));
                break;
            case '-':
                System.out.println("Resultado: " + (a - b));
                break;
            case '*':
                System.out.println("Resultado: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Resultado: " + (a / b));
                } else {
                    System.out.println("Error: división por cero");
                }
                break;
            default:
                System.out.println("Operador no válido");
        }

        // --------------------------------------------------------------------------------------------------------
        System.out.println("---Año bisiesto---");
        System.out.println("Introduzca un año:");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es bisiesto.");
        } else {
            System.out.println(anio + " NO es bisiesto.");
        }

        // --------------------------------------------------------------------------------------------------------
        System.out.println("---Imprimir primeros 10 numeros---");

        System.out.println("\nNúmeros del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // --------------------------------------------------------------------------------------------------------

        System.out.println("---Suma 100 primeros numeros---");
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("\nSuma del 1 al 100: " + suma);

        // --------------------------------------------------------------------------------------------------------

        System.out.println("---Tablas de multiplicar---");
        System.out.println("\nIntroduce un número para su tabla de multiplicar:");
        int numeroTabla = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + numeroTabla + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabla + " x " + i + " = " + (numeroTabla * i));
        }

        // --------------------------------------------------------------------------------------------------------

        System.out.println("---Factrorial de un numero---");
        System.out.println("\nIntroduce un número para calcular su factorial:");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);

        // --------------------------------------------------------------------------------------------------------

        System.out.println("---Imprimir numeros pares---");
        System.out.println("\nNúmeros pares entre 1 y 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
