package com.cripto.method;

import com.cripto.model.Message;

public class Vigenere {

  public Message tratamiento(String key, String message){
    
    Message mensaje = new Message(key.toUpperCase(), message.toUpperCase());

    if(message.length()<key.length()){
      System.out.println("La clave tiene que ser igual o menor al mensaje");  
    }else if(message.length() == key.length()){

    } else{
        String claveNueva="";
        

        int z=0;
        
        for(int i= 0; i<message.length();i++){
            if(!(message.charAt(i)==' ')){

                char letraClave = key.charAt(z);

                if(letraClave != key.charAt((key.length()-1))){
                    claveNueva += key.charAt(z);
                    z++;
                }
                else{
                    claveNueva += key.charAt(z);
                    z=0;
                    
                }
                 
            }
        }
        mensaje.setKey(claveNueva.toUpperCase());
    }
    
    return mensaje;
 }


 public String encriptMessage(Message mensajito){

    String mensajeParaEncriptar = mensajito.getMessage();
    String clave = mensajito.getKey();
    String mensajeEncriptado = "";
    int primerValor [] = new int[mensajeParaEncriptar.length()];
    int segundoValor [] = new int[clave.length()];

    for(int i = 0; i<mensajeParaEncriptar.length();i++){
        switch(mensajeParaEncriptar.charAt(i)){
            case 'A': 
                primerValor[i] = 0;
            break;
            case 'B':
                primerValor[i] = 1;
            break;
            case 'C':
                primerValor[i] = 2;
            break;
            case 'D':
                primerValor[i] = 3;
            break;
            case 'E':
                primerValor[i] = 4;
            break;
            case 'F':
                primerValor[i] = 5;
            break;
            case 'G':
                primerValor[i] = 6;
            break;
            case 'H':
                primerValor[i] = 7;
            break;
            case 'I':
                primerValor[i] = 8;
            break;
            case 'J':
                primerValor[i] = 9;
            break;
            case 'K':
                primerValor[i] = 10;
            break;
            case 'L':
                primerValor[i] = 11; 
            break; 
            case 'M':
                primerValor[i] = 12;
            break;
            case 'N':
                primerValor[i] = 13;
            break;
            case 'Ñ':
                primerValor[i] = 14;
            break; 
            case 'O': 
                primerValor[i] = 15;
            break;
            case 'P':
                primerValor[i] = 16;
            break;
            case 'Q': 
                primerValor[i] = 17;
            break;
            case 'R':
                primerValor[i] = 18;
            break;
            case 'S':
                primerValor[i] = 19;
            break;
            case 'T':
                primerValor[i] = 20;
            break;
            case 'U':
                primerValor[i] = 21;
            break;
            case 'V':
                primerValor[i] = 22;
            break;
            case 'W':
                primerValor[i] = 23;
            break;
            case 'X':
                primerValor[i] = 24;
            break;
            case 'Y':
                primerValor[i] = 25;
            break;
            case 'Z':
                primerValor[i] = 26;
            break;
            case ' ':
                primerValor[i]= 27;
            break;
        }
    }

    for(int i = 0; i<clave.length();i++){
        switch(clave.charAt(i)){
            case 'A': 
                segundoValor[i] = 0;
            break;
            case 'B':
                segundoValor[i] = 1;
            break;
            case 'C':
                segundoValor[i] = 2;
            break;
            case 'D':
                segundoValor[i] = 3;
            break;
            case 'E':
                segundoValor[i] = 4;
            break;
            case 'F':
                segundoValor[i] = 5;
            break;
            case 'G':
                segundoValor[i] = 6;
            break;
            case 'H':
                segundoValor[i] = 7;
            break;
            case 'I':
                segundoValor[i] = 8;
            break;
            case 'J':
                segundoValor[i] = 9;
            break;
            case 'K':
                segundoValor[i] = 10;
            break;
            case 'L':
                segundoValor[i] = 11; 
            break; 
            case 'M':
                segundoValor[i] = 12;
            break;
            case 'N':
                segundoValor[i] = 13;
            break;
            case 'Ñ':
                segundoValor[i] = 14;
            break; 
            case 'O': 
                segundoValor[i] = 15;
            break;
            case 'P':
                segundoValor[i] = 16;
            break;
            case 'Q': 
                segundoValor[i] = 17;
            break;
            case 'R':
                segundoValor[i] = 18;
            break;
            case 'S':
                segundoValor[i] = 19;
            break;
            case 'T':
                segundoValor[i] = 20;
            break;
            case 'U':
                segundoValor[i] = 21;
            break;
            case 'V':
                segundoValor[i] = 22;
            break;
            case 'W':
                segundoValor[i] = 23;
            break;
            case 'X':
                segundoValor[i] = 24;
            break;
            case 'Y':
                segundoValor[i] = 25;
            break;
            case 'Z':
                segundoValor[i] = 26;
            break;
            case ' ':
                segundoValor[i] = 27;
            break;             

        }
    }

    int mensajeValores [] = new int[mensajeParaEncriptar.length()];
    for(int i = 0; i<mensajeParaEncriptar.length();i++){
        mensajeValores[i] = primerValor[i];
    }

    int arregloSuma [] = new int[mensajeParaEncriptar.length()];

    int k = 0;
    for(int i = 0; i<arregloSuma.length ; i++){
        if(!(mensajeValores[i]==27)){

            arregloSuma[i] = ((primerValor[i] + segundoValor[k])%27);
            k++;        
        } else{
            arregloSuma[i] = 27;
        }
        
    }

    for (int i = 0; i < arregloSuma.length; i++){
        switch(arregloSuma[i]){
        case 0: 
             mensajeEncriptado= mensajeEncriptado + 'A';
        break;
        case 1:
             mensajeEncriptado= mensajeEncriptado + 'B';
        break;
        case 2:
             mensajeEncriptado= mensajeEncriptado + 'C';
        break;
        case 3:
             mensajeEncriptado= mensajeEncriptado + 'D';
            
        break;
        case 4:
             mensajeEncriptado= mensajeEncriptado + 'E';
            
        break;
        case 5:
             mensajeEncriptado= mensajeEncriptado + 'F';
        break;
        case 6:
             mensajeEncriptado= mensajeEncriptado + 'G';
        break;
        case 7:
             mensajeEncriptado= mensajeEncriptado + 'H';
        break;
        case 8:
             mensajeEncriptado= mensajeEncriptado + 'I';
        break;
        case 9:
             mensajeEncriptado= mensajeEncriptado + 'J';
        break;
        case 10:
             mensajeEncriptado= mensajeEncriptado + 'K';
        break;
        case 11:
             mensajeEncriptado = mensajeEncriptado + 'L'; 
        break; 
        case 12:
             mensajeEncriptado = mensajeEncriptado + 'M';
        break;
        case 13:
             mensajeEncriptado = mensajeEncriptado + 'N';
        break;
        case 14:
             mensajeEncriptado = mensajeEncriptado + 'Ñ';
        break; 
        case 15:
              mensajeEncriptado= mensajeEncriptado + 'O';
        break;
        case 16:
              mensajeEncriptado= mensajeEncriptado + 'P';
        break;
        case 17: 
             mensajeEncriptado= mensajeEncriptado + 'Q';
        break;
        case 18:
             mensajeEncriptado= mensajeEncriptado + 'R';
        break;
        case 19:
             mensajeEncriptado= mensajeEncriptado + 'S';
        break;
        case 20:
             mensajeEncriptado= mensajeEncriptado + 'T';
        break;
        case 21:
             mensajeEncriptado= mensajeEncriptado + 'U';
        break;
        case 22:
              mensajeEncriptado= mensajeEncriptado + 'V';
        break;
        case 23:
             mensajeEncriptado= mensajeEncriptado + 'W';
        break;
        case 24:
             mensajeEncriptado= mensajeEncriptado + 'X';
        break;
        case 25:
             mensajeEncriptado = mensajeEncriptado + 'Y';
        break;
        case 26:
             mensajeEncriptado = mensajeEncriptado + 'Z';
        break;
        case 27:
            mensajeEncriptado= mensajeEncriptado + ' ';
        break;
        }
    }

    return mensajeEncriptado;
 }
 

 public String decrypt(Message desencriptar){

    String clave = desencriptar.getKey();
    String mensajeParaDesencriptar = desencriptar.getMessage();
    String mensajeDesencriptado = "";
    int primerValor [] = new int[mensajeParaDesencriptar.length()];
    int segundoValor [] = new int[clave.length()];


    for(int i = 0; i<mensajeParaDesencriptar.length();i++){
        switch(mensajeParaDesencriptar.charAt(i)){
            case 'A': 
                primerValor[i] = 0;
            break;
            case 'B':
                primerValor[i] = 1;
            break;
            case 'C':
                primerValor[i] = 2;
            break;
            case 'D':
                primerValor[i] = 3;
            break;
            case 'E':
                primerValor[i] = 4;
            break;
            case 'F':
                primerValor[i] = 5;
            break;
            case 'G':
                primerValor[i] = 6;
            break;
            case 'H':
                primerValor[i] = 7;
            break;
            case 'I':
                primerValor[i] = 8;
            break;
            case 'J':
                primerValor[i] = 9;
            break;
            case 'K':
                primerValor[i] = 10;
            break;
            case 'L':
                primerValor[i] = 11; 
            break; 
            case 'M':
                primerValor[i] = 12;
            break;
            case 'N':
                primerValor[i] = 13;
            break;
            case 'Ñ':
                primerValor[i] = 14;
            break; 
            case 'O': 
                primerValor[i] = 15;
            break;
            case 'P':
                primerValor[i] = 16;
            break;
            case 'Q': 
                primerValor[i] = 17;
            break;
            case 'R':
                primerValor[i] = 18;
            break;
            case 'S':
                primerValor[i] = 19;
            break;
            case 'T':
                primerValor[i] = 20;
            break;
            case 'U':
                primerValor[i] = 21;
            break;
            case 'V':
                primerValor[i] = 22;
            break;
            case 'W':
                primerValor[i] = 23;
            break;
            case 'X':
                primerValor[i] = 24;
            break;
            case 'Y':
                primerValor[i] = 25;
            break;
            case 'Z':
                primerValor[i] = 26;
            break;
            case ' ':
                primerValor[i]= 27;
            break;

        }
    }

    for(int i = 0; i<clave.length();i++){
        switch(clave.charAt(i)){
            case 'A': 
                segundoValor[i] = 0;
            break;
            case 'B':
                segundoValor[i] = 1;
            break;
            case 'C':
                segundoValor[i] = 2;
            break;
            case 'D':
                segundoValor[i] = 3;
            break;
            case 'E':
                segundoValor[i] = 4;
            break;
            case 'F':
                segundoValor[i] = 5;
            break;
            case 'G':
                segundoValor[i] = 6;
            break;
            case 'H':
                segundoValor[i] = 7;
            break;
            case 'I':
                segundoValor[i] = 8;
            break;
            case 'J':
                segundoValor[i] = 9;
            break;
            case 'K':
                segundoValor[i] = 10;
            break;
            case 'L':
                segundoValor[i] = 11; 
            break; 
            case 'M':
                segundoValor[i] = 12;
            break;
            case 'N':
                segundoValor[i] = 13;
            break;
            case 'Ñ':
                segundoValor[i] = 14;
            break; 
            case 'O': 
                segundoValor[i] = 15;
            break;
            case 'P':
                segundoValor[i] = 16;
            break;
            case 'Q': 
                segundoValor[i] = 17;
            break;
            case 'R':
                segundoValor[i] = 18;
            break;
            case 'S':
                segundoValor[i] = 19;
            break;
            case 'T':
                segundoValor[i] = 20;
            break;
            case 'U':
                segundoValor[i] = 21;
            break;
            case 'V':
                segundoValor[i] = 22;
            break;
            case 'W':
                segundoValor[i] = 23;
            break;
            case 'X':
                segundoValor[i] = 24;
            break;
            case 'Y':
                segundoValor[i] = 25;
            break;
            case 'Z':
                segundoValor[i] = 26;
            break;
            case ' ':
                segundoValor[i] = 27;
            break;             

        }
    }

    int mensajeValores [] = new int[mensajeParaDesencriptar.length()];
    for(int i = 0; i<mensajeParaDesencriptar.length();i++){
        mensajeValores[i] = primerValor[i];
    }

    int arregloSuma [] = new int[mensajeParaDesencriptar.length()];

    int k = 0;
    for(int i = 0; i<arregloSuma.length ; i++){

        if(!(mensajeValores[i]==27)){

            if((primerValor[i]-segundoValor[k])<0){
                arregloSuma[i] = ((((primerValor[i] - segundoValor[k])+27))%27);
                k++;
                
            }else{
                arregloSuma[i] = ((primerValor[i] - segundoValor[k])%27);
                k++;
            }
            
        } else{
            arregloSuma[i] = 27;
        }
        
    }

    for (int i = 0; i < arregloSuma.length; i++){
        switch(arregloSuma[i]){
        case 0: 
             mensajeDesencriptado= mensajeDesencriptado + 'A';
        break;
        case 1:
             mensajeDesencriptado= mensajeDesencriptado + 'B';
        break;
        case 2:
             mensajeDesencriptado= mensajeDesencriptado + 'C';
        break;
        case 3:
             mensajeDesencriptado= mensajeDesencriptado + 'D';
            
        break;
        case 4:
             mensajeDesencriptado= mensajeDesencriptado + 'E';
            
        break;
        case 5:
             mensajeDesencriptado= mensajeDesencriptado + 'F';
        break;
        case 6:
             mensajeDesencriptado= mensajeDesencriptado + 'G';
        break;
        case 7:
             mensajeDesencriptado= mensajeDesencriptado + 'H';
        break;
        case 8:
             mensajeDesencriptado= mensajeDesencriptado + 'I';
        break;
        case 9:
             mensajeDesencriptado= mensajeDesencriptado + 'J';
        break;
        case 10:
             mensajeDesencriptado= mensajeDesencriptado + 'K';
        break;
        case 11:
             mensajeDesencriptado = mensajeDesencriptado + 'L'; 
        break; 
        case 12:
             mensajeDesencriptado = mensajeDesencriptado + 'M';
        break;
        case 13:
             mensajeDesencriptado = mensajeDesencriptado+ 'N';
        break;
        case 14:
             mensajeDesencriptado = mensajeDesencriptado + 'Ñ';
        break; 
        case 15:
              mensajeDesencriptado= mensajeDesencriptado + 'O';
        break;
        case 16:
              mensajeDesencriptado= mensajeDesencriptado + 'P';
        break;
        case 17: 
             mensajeDesencriptado= mensajeDesencriptado + 'Q';
        break;
        case 18:
             mensajeDesencriptado= mensajeDesencriptado + 'R';
        break;
        case 19:
             mensajeDesencriptado= mensajeDesencriptado + 'S';
        break;
        case 20:
             mensajeDesencriptado= mensajeDesencriptado + 'T';
        break;
        case 21:
             mensajeDesencriptado= mensajeDesencriptado + 'U';
        break;
        case 22:
              mensajeDesencriptado= mensajeDesencriptado + 'V';
        break;
        case 23:
             mensajeDesencriptado= mensajeDesencriptado + 'W';
        break;
        case 24:
             mensajeDesencriptado= mensajeDesencriptado + 'X';
        break;
        case 25:
             mensajeDesencriptado = mensajeDesencriptado + 'Y';
        break;
        case 26:
             mensajeDesencriptado = mensajeDesencriptado + 'Z';
        break;
        case 27:
            mensajeDesencriptado= mensajeDesencriptado + ' ';
        break;
        }
    }

    return mensajeDesencriptado;

 }

}
