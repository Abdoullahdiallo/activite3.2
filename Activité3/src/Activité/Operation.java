package Activité;

import java.io.Serializable;

public class Operation implements Serializable{
   private int op1;
   private int op2;
   private int res;
   private String oper;
public Operation(int op1, int op2 , String oper) {
	super();
	this.op1 = op1;
	this.op2 = op2;
	this.oper = oper;
}
public int getOp1() {
	return op1;
}
public void setOp1(int op1) {
	this.op1 = op1;
}
public int getOp2() {
	return op2;
}
public void setOp2(int op2) {
	this.op2 = op2;
}
public String getOper() {
	return oper;
}
public void setOper(String oper) {
	this.oper = oper;
}
public int getRes() {
	return res;
}
public void setRes(int res) {
	this.res = res;
}
   
   
   
   
}
