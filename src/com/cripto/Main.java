package com.cripto;

import javax.swing.JOptionPane;

import com.cripto.method.Vigenere;


public class Main {
    public static void main(String[] args) {

    Vigenere v = new Vigenere();
    String respuesta = " ";
    String clave;
    String mensaje;
    String mensajeEncriptado = ""; 
    

    do {

        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quieres hacer: 1.Encriptar, 2. Desencriptar"));
        switch (opcion){
            case 0: 
                mensaje = JOptionPane.showInputDialog("Ingresa la palabra para codificar");
                clave = JOptionPane.showInputDialog("Ingresa la clave para codificar");
                String cipher = v.encriptMessage(v.tratamiento(clave,mensaje));
                System.out.println("La palabra encriptada es: " + cipher);
                opcion = 0;
                mensajeEncriptado = cipher;
            break;
            case 1:
                String clearMessage = v.decrypt(v.tratamiento("loup",mensajeEncriptado));
                System.out.println(clearMessage);
                opcion = 0;
            break;

            default:
                System.out.println("No es una opcion valida");

        }

        respuesta = JOptionPane.showInputDialog("Quieres volver a hacerlo?");
    } while (respuesta.equals("si"));
    
    System.out.println("Saliendo");
}
}
