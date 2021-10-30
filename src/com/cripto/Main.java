package com.cripto;

import com.cripto.method.Vigenere;


public class Main {
    public static void main(String[] args) {

    Vigenere v = new Vigenere();
    

    String cipher = v.encriptMessage(v.tratamiento("loup","paris vaut bien une messe"));
    
    String clearMessage = v.decrypt(v.tratamiento("loup",cipher));

    System.out.println("El mensaje encriptado es: "+cipher);
    System.out.println("El mensaje desencriptado es: "+ clearMessage);

    //int modulo = (0-11 + 27)%27;
    //System.out.println(modulo);
}
}
