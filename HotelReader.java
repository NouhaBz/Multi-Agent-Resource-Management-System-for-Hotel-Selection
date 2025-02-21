/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resoucemangment;

import java.util.ArrayList;


public class HotelReader {
        ArrayList<Hotel> HLXML= new ArrayList<Hotel>();

    public HotelReader(String path ){
 
    
    int i =0;
    while(true){
    String HS ="<hotel>";
    String HE = "</hotel>";
    
    int si = path.indexOf(HS,i);
    
    if (si== -1) {
        break; 
    }
    int ei = path.indexOf(HE ,si)+HE.length();
    
    
    String hotels= path.substring(si,ei);
    
     String name = getP(path, "<name>", "</name>", 0);
     String location = getP(path, "<location>", "</location>", 0);
     String cost = getP(path, "<cost>", "</cost>", 0);
     String roomsAvailable = getP(path, "<roomsAvailable>", "</roomsAvailable>", 0);
     String responseTime = getP(path, "<responseTime>", "</responseTime>", 0);
     String roomType = getP(path, "<roomType>", "</roomType>", 0);
     String date = getP(path, "<date>", "</date>", 0);
     String numberOfGuests = getP(path, "<numberOfGuests>", "</numberOfGuests>", 0);
    
    System.out.println("Hotel Details:");
    System.out.println("Name: " + name);
    System.out.println("Location: " + location);
    System.out.println("Cost: " + cost);
    System.out.println("Rooms Available: " + roomsAvailable);
    System.out.println("Response Time: " + responseTime);
    System.out.println("Room Type: " + roomType);
    System.out.println("Date: " + date);
    System.out.println("Number of Guests: " + numberOfGuests);
    System.out.println();
    
    
    Hotel h = new Hotel(name, location, cost, roomsAvailable, responseTime, roomType, date, numberOfGuests);
            HLXML.add(h);
    i= ei ;
    
  
   }
    }
  private String getP(String P ,String start , String end , int h){
           int s =P.indexOf(start,h);
          // System.out.println("s ;"+s);
           if (s ==-1){
               return "0";
           }
           
           s+= start.length();
         //  System.out.println("s ;"+s);
           int e = P.indexOf(end , s);
          // System.out.println("e ;"+e);
            return (e != -1) ? P.substring(s, e).trim() : "0";
     }
  
   public void printHotels() {
        for (Hotel hotel : HLXML) {
            System.out.println(hotel);
        }
    }

public static void main(String[] args) {
   String path ="\"C:\\Users\\dz\\OneDrive\\Desktop\\m2\\taia\\tp\\ResourceMangment\\src\\main\\java\\Hotels.xml\"";
    
    HotelReader reader = new HotelReader(path);
    reader.printHotels();
    
    
        
   
}


  
}



    




class Hotel{
  private  String name ;
  private  String location ;
  private  String cost ;
  private  String room_ava ;
  private  String responseT;
  private  String roomT ;
  private  String date ;
  private  String NG;
    public Hotel(String name ,String location , String cost ,String room_ava , String responseT,String roomT ,String date ,String NG){
        this.name=name;
        this.location=location;
        this.cost=cost;
        this.room_ava =room_ava;
        this.responseT=responseT;
        this.roomT=roomT;
        this.date=date;
        this.NG=NG;
    }
} 