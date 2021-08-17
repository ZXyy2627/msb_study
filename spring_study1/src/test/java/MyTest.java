import com.lucky.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: lucky_x
 * @Date: 2021/8/17 - 08 - 17 - 22:10
 * @Description: PACKAGE_NAME
 * @VERSION: 1.0
 */
public class MyTest {
    static ApplicationContext context;

    static {
        context = new ClassPathXmlApplicationContext("ioc.xml");
    }
    /**
     * 测试IOC容器配置bean，并使用property标签初始化对象
     */
    @Test
    public void test1() {
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        Person person11 = context.getBean("person1", Person.class);
        System.out.println(person11 == person1); //ture  证明默认是单例的
    }
}
