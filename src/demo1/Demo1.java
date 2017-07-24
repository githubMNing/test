package demo1;

import java.lang.reflect.Field;

public class Demo1 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		
		Class cls = Person.class;
		
		Field[] f = cls.getFields();
		for(Field ff:f){
			System.out.println(ff.getName());
		}
		
		Field[] ff = cls.getDeclaredFields();
		for(Field ff1:ff){
			System.out.println(ff1.getName());
		}
		
		
		Field f1 = cls.getDeclaredField("name");
		System.out.println(f1.getName());
		
		Object obj = cls.newInstance();
		f1.set(obj, "lilei");
		System.out.println(f1.get(obj));
		
		Field f2 = cls.getDeclaredField("age");
		
		System.out.println(f2.getName());
		
		Object obj1 = cls.newInstance();
		f2.setAccessible(true);
		f2.set(obj1,12);
		System.out.println(f2.get(obj1));

		
	}
}
class Person{
	public int age;
	private int num;
	String name;
}