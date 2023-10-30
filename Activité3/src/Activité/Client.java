package Activité;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  private int numclient;
private static final int PORT=600;

  public static void main(String[] args) {
	  try {
	   Socket s = new Socket("localhost",PORT);
	   System.out.println("je suis un client");
	   System.out.println(new BufferedReader(new InputStreamReader(s.getInputStream())));
	   Scanner sc = new Scanner(System.in);
	   int op1=sc.nextInt();
	   int op2=sc.nextInt();
	   String oper=sc.nextLine();
	   
	   Operation op = new Operation(op1, op2, "oper");
	   ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
	   ObjectInputStream iis = new ObjectInputStream(s.getInputStream());
	   oos.writeObject(op);
	   
	   op=(Operation) iis.readObject();
	 
	   
	   
	   
  }catch (Exception e) {
	e.printStackTrace();// TODO: handle exception
}

}
}
