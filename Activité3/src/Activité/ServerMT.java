package Activité;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerMT extends Thread {
  private int nbclient;
  private static final int PORT=600; 
  public static void main(String[] args) {	  new ServerMT().start(); 
	  //lancer le thread 
  }
  public void run()  {
	  try {
		  System.out.println("demarrage su server");
		   ServerSocket ss =new ServerSocket(PORT);
		   //permet de reserver un poort à client 
		   while(true) {
			   Socket s = ss.accept();
			   //tanque y'a client qui demande la connexion accepte
			   Clientprocess p = new Clientprocess(s,++nbclient);
			   //instance de clientprocess
			   System.out.println("le client num"+nbclient+"est connecté");
			   //permet d'afchier le numero de client qui est conneter
			   
			   new PrintWriter(s.getOutputStream(),true).println("Bienvenu "+nbclient);
			   //permert d'envoyer une chaine de caracter a client 
			   
		   }
	  }catch (Exception e) {
		e.printStackTrace();
	}
  }

}
