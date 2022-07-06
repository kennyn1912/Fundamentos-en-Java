/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronComan;

import javax.swing.JOptionPane;

/**
 *
 * @author kenny
 */
public class EPS {
    public EPS(){
        }
    public void programar(String TipoCita){
     
        if(TipoCita.compareTo("CITA GENERAL")==0){
            System.out.println("Programando Cita General");
        }
            else if(TipoCita.compareTo("CITA ESPECIALISTA")==0){
            System.out.println("programando cita especialista");
        }
            else if(TipoCita.compareTo("CITA URGENCIA")==0){
                    System.out.println("programando cita urgencia");
                    }
        }
    }


    

