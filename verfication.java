/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.resoucemangment;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

/**
 *
 * @author dz
 */
public class verfication {
     public static void main (String[] args) throws StaleProxyException{
         jade.core.Runtime time = jade.core.Runtime.instance();
           
           Profile p = new ProfileImpl();
           p.setParameter(p.CONTAINER_NAME, "Discovery");
           p.setParameter(p.MAIN_HOST, "localhost");
           
           
           AgentContainer c =  (AgentContainer) time.createAgentContainer(p);
           
           AgentController discoverA= c.createNewAgent("Discovery", discovery_agent.class.getName(), null);
           AgentController mangAgent= c.createNewAgent("Mangement", mangment_agent.class.getName(), null);
           AgentController reasourceA= c.createNewAgent("Reasource", reasource_agent.class.getName(), null);
           
           
           mangAgent.start();
           reasourceA.start();
           discoverA.start();
           
           System.out.println("Discover Node is running ...........");

    }
}
