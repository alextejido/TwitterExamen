/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplitwitt;



import javax.swing.JOptionPane;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author atejidosolla
 */
public class Aplitwitt {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
      Metodos.conexion();
    
       
       int select;
             
       do {
  select = Integer.parseInt(JOptionPane.showInputDialog("1. Nuevo estado \n 2.TimeLine \n 3.BuscarTwit \n 4.Mensaje \n 5.Seleccionar twits"));
    switch(select){
        
        case 1:Metodos.twitearN(JOptionPane.showInputDialog(null,"Introducir nuevo Estado"));
            break;
        case 2:Metodos.lineaTiempo();
            break;
        case 3:Metodos.buscarTwit(JOptionPane.showInputDialog("Introduce el hastag"));   
            break;
        case 4:Metodos.enviarMensaje(JOptionPane.showInputDialog("Introduce destinatario"),JOptionPane.showInputDialog("Introduce el mensaje"));
            break;
        case 5:Metodos.seleccion();
            break;
    }
  
          }while(select!=0);
    }
}