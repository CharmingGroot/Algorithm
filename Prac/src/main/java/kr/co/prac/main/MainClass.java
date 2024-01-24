package kr.co.prac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.prac.beans.DataBean;
import kr.co.prac.beans.TestBean;
import kr.co.prac.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생성자를 통한 Bean 주입.
		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/prac/config/beans.xml");

		TestBean t1 = new TestBean();
		t1.printData();
		
		TestBean t2 = new TestBean(100);
		t2.printData();
		
		TestBean t3 = new TestBean(11.11);
		t3.printData();
		
		
		TestBean t4 = new TestBean("가즈아");
		t4.printData();
		
		TestBean t5 = new TestBean(1, 0.3, "가즈아");
		t5.printData();
		
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
		
		
		
		System.out.println("---------------------------------");
		TestBean obj5 = ctx.getBean("obj5", TestBean.class);
		obj5.printData();
		
		
		
		System.out.println("=========================================");
		
		DataBean d1 = new DataBean();
		DataBean d2 = new DataBean();
		
		TestBean2 t200 = new TestBean2(d1, d2);
		
		t200.printData();
		
		System.out.println("==============obj8=======================");
		
		TestBean2 obj8 = ctx.getBean("obj8", TestBean2.class);
		obj8.printData();
		
		
		System.out.println("==============obj9=======================");
		
		TestBean2 obj9 = ctx.getBean("obj9", TestBean2.class);
		obj9.printData();
		
		
		ctx.close();
		
	}

}
