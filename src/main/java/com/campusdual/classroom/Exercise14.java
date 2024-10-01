package com.campusdual.classroom;

public class Exercise14 {

    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        Teacher t = new Teacher("Maria", "Montessori", "Educación");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrología e Infectología");

        System.out.println("Detalles de la Persona:");
        p.getDetails();

        System.out.println("\nDetalles del Profesor:");
        t.getDetails();

        System.out.println("\nDetalles del Oficial de Policía:");
        po.getDetails();

        System.out.println("\nDetalles del Doctor:");
        d.getDetails();
    }

}