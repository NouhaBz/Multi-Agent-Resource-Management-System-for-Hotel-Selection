/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resoucemangment;

/**
 *
 * @author dz
 */
public class Infrastructure {
    private int ava_cpu;
    private int ava_RAM;
    private int ava_Storage ;
    
    
    public Infrastructure (int cpu , int ram , int storage){
        this.ava_cpu=cpu;
        this.ava_RAM =ram;
        this.ava_Storage=storage;
    }
    
    public void resource_request(boolean vmR , boolean stR, String op ) throws Exception{
      if (vmR){
            System.out.println("Infrastructure :received request to obtain new VM");
        
        
        if (ava_cpu >0 && ava_RAM >0){
            int lagtime =10;
            int thre =5;
            
            
            if(lagtime >thre){
                System.out.println("adding new VM");
                throw new Exception ();
            }
            
            if(ava_cpu==0 || ava_RAM==0){
                System.out.println("RAM or cpu is fully occupied \n create new VM");
                createVM(op);
            }
            
        }else{
            System.out.println("Physical reasource unvailabel , request iaas more reasource");
            iaas.requestVM(2,4,100);
            throw new Exception();
            }
      }
      
      if(stR){
          System.out.println("Infrastructure :received request to obtain Storage");
          if(ava_Storage>0){
              System.out.println("Unified logic partition is available and sufficient");
          }else{
              System.out.println("not enough stourage , request iaas more reasource");
              iaas.requestStorage(100);
              throw new Exception();
              
          }
      }
    
    
}
    
    private void createVM(String op){
        if("big".equals(op)){
            System.out.println("minimizing ram size and number cpu ");
        }else{
            if("average".equals(op)){
            System.out.println("minimizing number cpu");
        }else{
             if("small".equals(op)){
                 System.out.println("minimize ram size and number cpu");
             }   
            }
        }
        System.out.println("transferring data to creat new VM");
    }
}