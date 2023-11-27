package cn.wyz.entracne;

import cn.wyz.bean.Wyz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wnx
 */
public class Entrance {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		Wyz bean = ac.getBean(Wyz.class);
		System.out.println(bean);
	}
}
