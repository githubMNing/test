package demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls = Class.forName("demo.Person2");
		
		Method[] m = cls.getMethods();
		for(Method mm:m){
			System.out.println(mm.getName());
		}
		
		Method m1 = cls.getMethod("f1");
		System.out.println(m1.getName());
		
		Method m2 = cls.getMethod("f3",int.class,int.class);
		System.out.println(m2.getName());
		
		Object obj = cls.newInstance();
		Object num = m2.invoke(obj, 3,4);
		System.out.println(num);
		
		Method[] mm1 = cls.getDeclaredMethods();
		for(Method mm:mm1){
			System.out.println(mm.getName());
		}
		
		Method mm2 = cls.getDeclaredMethod("f2");
		System.out.println(mm2.getName());
		
		Object obj1 = cls.newInstance();
		mm2.setAccessible(true);
		mm2.invoke(obj1);
		
	}
}
class Person2{
	private int age;
	private String name;
	
	public Person2(){
		System.out.println("无参数构造方法。。。");
	}
	public Person2(int age,String name){
		System.out.println("有参数构造方法。。。");
		System.out.println(age);
		System.out.println(name);
		
	}
	
	public void f1(){
		System.out.println("公共方法 f1()....");
	}
	
	private void f2(){
		System.out.println("私有方法f2()....");
	}
	
	public int f3(int a,int b){
		int c = a+b;
		System.out.println("公共参数方法 f3()....");
		return c;
	}
}