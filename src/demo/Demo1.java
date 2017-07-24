package demo;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//��ȡ Class ����ķ�ʽ
		//1��ͨ����� class ���Ի�ȡ
		Class cls = Person.class;
		System.out.println(cls);
		//2��ͨ������ getClass() �������
		Object person = new Person();
		Class cls1 = person.getClass();//�������ҵ�����������
		System.out.println(cls1);
		//3��ͨ�� Class ����ľ�̬���� forName()��� ���ܻ��׳��쳣
		Class cls2 = Class.forName("demo.Person");//��������ȫ�޶��� ����.����
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
		System.out.println("һ�������Ĺ��췽��������");
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
