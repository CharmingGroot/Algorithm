package kr.co.prac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.prac.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/prac/config/beans.xml");

		TestBean t1 = new TestBean();
		t1.printData();
		
		TestBean t2 = new TestBean(100);
		t2.printData();
		
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		
		
		TestBean t4 = new TestBean("°¡Áî¾Æ");
		t4.printData();
		
		System.out.println("---------------------------------");
		
		TestBean obj1 = ctx.getBean("obj1", TestBean.class);
		obj1.printData();
		
		System.out.println("---------------------------------");
		TestBean obj2 = ctx.getBean("obj2", TestBean.class);
		obj2.printData();
		
		
		System.out.println("---------------------------------");
		TestBean obj3 = ctx.getBean("obj3", TestBean.class);
		obj3.printData();
		
		
		
		System.out.println("---------------------------------");
		TestBean obj4 = ctx.getBean("obj4", TestBean.class);
		obj4.printData();
		
		
		
		
		
		
		
		
		
		ctx.close();
		
	}

}
