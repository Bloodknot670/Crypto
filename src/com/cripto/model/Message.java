package com.cripto.model;

public class Message {
   private String message;
   private String key;
   
   public Message(String key, String message){
    this.message = message;
    this.key = key;
   }

   public void setKey(String key){
    this.key = key;
   }

   public String getKey(){
    return this.key;
   }

   public void setMessage(String message){
    this.message = message;
   }

   public String getMessage(){
       return this.message;
   }
}