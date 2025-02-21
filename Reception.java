/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resoucemangment;
import jade.wrapper.AgentContainer;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;
/**
 *
 * @author dz
 */
public class Reception {
       public static void main (String[] args ) throws StaleProxyException{
           Runtime time = Runtime.instance();
           
           Profile p = new ProfileImpl();
           p.setParameter(p.CONTAINER_NAME, "Reception");
           p.setParameter(p.MAIN_HOST, "localhost");
           
           
           AgentContainer c =  (AgentContainer) time.createAgentContainer(p);
           
           AgentController mangAgent= c.createNewAgent("Mangement", mangment_agent.class.getName(), null);
           AgentController reasourceA= c.createNewAgent("Reasource", reasource_agent.class.getName(), null);
           
           
           mangAgent.start();
           reasourceA.start();
           
           
           System.out.println("Reception Node is running ");

           
           
           
         
           
       }
    
    
    
    


}
