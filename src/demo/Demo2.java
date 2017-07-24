package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("demo.Person1");
		/*Constructor[] con = cls.getConstructors();
		
		for(Constructor cons:con){
			System.out.println(cons);
		}*/
		Constructor con = cls.getConstructor();
		    System.out.println(con);
		    con.newInstance();
	    Constructor cons = cls.getConstructor(int.class,String.class);
	    	System.out.println(cons);
	    	cons.newInstance(3,"LILEI");
	    	
	}	
}
class Person1{
	private int age;
	private String name;
	
	public Person1(){
		System.out.println("无参数构造方法。。。");
	}
	public Person1(int age,String name){
		System.out.println("有参数构造方法。。。");
		System.out.println(age);
		System.out.println(name);
		
	}
	
	public void f1(){
		System.out.println("f1()....");
	}
	
	private void f2(){
		System.out.println("f2()....");
	}
	
	public void f3(){
		System.out.println("f3()....");
	}
}
