package org.example;

import org.example.classes.Family;

public class Main {
    public static void main(String[] args) {

        //En en Main usamos las clases que nosotros programamos
        Integer notaFinal = 5;

        //Para usar una clase debo crear un OBJETO de la CLASE
        //un OBJETO es cualquier lenguajes es una VARIABLE ESPECIAL
        Animal animal = new Animal();
        //Si ya tengo un objeto lo uso para
        // acceder a los atributos y metodos de una clase
        animal.nombre = "Caballo";
        animal.edad = 10;


        Family familia = new Family();
        familia.setNombrePapa("Charly");
        familia.setNombreMama("Gaby");
        familia.setNombreDelHijo("Pablito");
        familia.setEdadPapa(600);

        System.out.println("El papa tiene: "+familia.getEdadPapa());

    }
}