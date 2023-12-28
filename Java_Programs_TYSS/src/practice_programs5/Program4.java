package practice_programs5;

import java.util.LinkedList;

import arrayOfObject_programs.Student;

public class Program4 {
	int sid;
	String sname;
	int std;
	char sec;
	double per;
	
	public Program4(int sid,String sname,int std,char sec,double per){
		this.sid=sid;
		this.sname=sname;
		this.std=std;
		this.sec=sec;
		this.per=per;
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		LinkedList<Student> l=new LinkedList<Student>();
		//l.add(new Program4(1,"Daya",7,'D',87.56));
	}
}