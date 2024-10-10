package cn.wyz;

import cn.wyz.bean.Wyz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wyz
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		Object wyz = ac.getBean(Wyz.class);
		System.out.println(wyz);
	}
}