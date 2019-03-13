package es.estech;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el nombre  del usuario");
        person.setName(scanner.next());

        System.out.println("Introduzca el primer apellido  del usuario");
        person.setSurname1(scanner.next());

        System.out.println("Introduzca el segundo apellido del usuario");
        person.setSurname2(scanner.next());

        System.out.println("Introduzca la altura del usuario en metros");
        person.setHeight(Float.parseFloat(scanner.next()));

        System.out.println("Introduzca el peso del usuario en kg");
        person.setWeight(Float.parseFloat(scanner.next()));

        System.out.println("Usuario: " + person.getName() + " " + person.getSurname1() + " " + person.getSurname2());
        System.out.println("IMC (índice de masa corporal): " + person.getIMC() + " ::: " + person.getIMCLevel(person.getIMC()));






    }
}
