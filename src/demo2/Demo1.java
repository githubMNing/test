package demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		final Calculator c = new CalculatorImp();
		//创建代理对象
		
		Calculator proxy = (Calculator)Proxy.newProxyInstance(c.getClass().getClassLoader(), 
				new Class[]{Calculator.class}, new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args)
							throws Throwable {
						System.out.println(method.getName()+"方法执行了"+Arrays.asList(args));
						Object obj = method.invoke(c, args);
						System.out.println(method.getName()+"方法结束了"+obj);
						return obj;
					}
				});
		System.out.println("buyukuai ");
		int result = proxy.add(3, 4);
		System.out.println("over");
	}
}
