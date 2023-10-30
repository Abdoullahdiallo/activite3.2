package Activité;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Clientprocess {
  private int numclient;
  private Socket s ; 
  int op1 , op2 , res ; 	String oper;
  public Clientprocess(Socket s , int numclient) {
	  this.s=s;
	  this.numclient=numclient;
	 
  }
  public void run()  {
	  try {
	PrintWriter pw = new PrintWriter(s.getOutputStream());
	  pw.println("Bienvenue , vous étes le client num"+numclient);
	 Operation op = (Operation)new ObjectInputStream(s.getInputStream()).readObject();
	 switch (oper) {
	 case "+":
	 	
	 	res=op1+op2;
	 	break;
	 	case "-":
	 		res=op1-op2;
	 		break;
	 	case "*":
	 		res=op1*op2;
	 		break;
	 	case "/":
	 		res=op1/op2;
	 		break;
	  }
	 ObjectOutputStream oss = new ObjectOutputStream(s.getOutputStream());
	 oss.writeObject(op);
	  
  }catch (Exception e) {
	e.printStackTrace();
}
}
}
