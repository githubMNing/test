package demo;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//获取 Class 对象的方式
		//1、通过类的 class 属性获取
		Class cls = Person.class;
		System.out.println(cls);
		//2、通过对象 getClass() 方法获得
		Object person = new Person();
		Class cls1 = person.getClass();//可用于找到对象所属类
		System.out.println(cls1);
		//3、通过 Class 对象的静态方法 forName()获得 可能会抛出异常
		Class cls2 = Class.forName("demo.Person");//参数：完全限定名 包名.类名
		System.out.println(cls2);
		
		Object obj = cls2.newInstance();
		System.out.println(obj);
		if(obj instanceof Person){
			Person p = (Person)obj;
			p.f1();
		}
		ClassLoader cl = cls2.getClassLoader();
		System.out.println(cl);
		cl = cl.getParent();
		System.out.println(cl);
		cl = cl.getParent();
		System.out.println(cl);
		
		
		
		
	}
	
}
class Person{
	private int age;
	private String name;
	public Person(){}
	public Person(int age){
		System.out.println("一个参数的构造方法。。。");
	}
	public void f1()
	{
		System.out.println("f1........");
	}
}
class Student{
	public void f1()
	{
		System.out.println("f1........");
	}
}
