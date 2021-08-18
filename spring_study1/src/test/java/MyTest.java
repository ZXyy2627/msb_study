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

    /**
     * 测试IOC容器默认是用无参构造器创建对象的，如果没有无参构造器会报错
     * 抛出异常：BeanInstantiationException   No default constructor found;
     */
    @Test
    public void test2() {
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
    }

    /**
     * 使用constructor-arg 标签配置bean，并初始化  使用name属性
     */
    @Test
    public void test3() {
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
    }

    /**
     * 使用constructor-arg标签配置bean，并初始化，使用index属性
     */
    @Test
    public void test4() {
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
    }

    /**
     * 测试使用constructor-arg配置bean，并初始化，使用type
     */
    @Test
    public void test5() {
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person2);
    }

    /**
     * 测试使用p命名空间
     */
    @Test
    public void test6() {
        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);
    }

    /**
     * 为bean复杂类型属性赋值
     */
    @Test
    public void test7() {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    /**
     * 为bean配置其它对象
     */
    @Test
    public void test8() {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    /**
     * 为bean配置list对象
     */
    @Test
    public void test9() {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    /**
     * 为bean配置set对象
     */
    @Test
    public void test10() {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    /**
     * 为bean配置map对象
     */
    @Test
    public void test11() {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    /**
     * 为bean配置property对象
     */
    @Test
    public void test12() {
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
    }

    /**
     * 继承关系的bean配置
     */
    @Test
    public void test13() {
        Person person5 = context.getBean("person5", Person.class);
        System.out.println(person5);
        Person son = context.getBean("son", Person.class);
        System.out.println(son);
    }

    /**
     * 为bean配置依赖关系  使用depends on
     */
    @Test
    public void test14() {
        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6);
    }

    /**
     * 使用静态工厂创建bean 使用静态工厂创建bean，不需要将工厂实例化，也就是说不需要配置该工厂的bean
     */
    @Test
    public void test15() {
        Person person8 = context.getBean("person8", Person.class);
        System.out.println(person8);
    }

    /**
     * 测试使用实例工厂创建对象
     */
    @Test
    public void test16() {
        Person person9 = context.getBean("person9", Person.class);
        System.out.println(person9);
        Person person99 = context.getBean("person99", Person.class);
        System.out.println(person99);
    }

    /**
     * 测试实现FactoryBean接口创建单例对象延迟加载
     *
     */
    @Test
    public void test17() {
        Person person11 = context.getBean("person11", Person.class);
        System.out.println(person11);
    }

    /**
     * 测试指定bean的init-method 和 destroy-method
     */
    @Test
    public void test18() {
        Person person12 = context.getBean("person12", Person.class);
        System.out.println(person12);
        //当调用关闭容器的方法时，对象会被销毁
        ((ClassPathXmlApplicationContext)context).close();
    }

    /**
     * 测试初始化增强方法
     */
    @Test
    public void test19() {
        Person person13 = context.getBean("person13", Person.class);
        System.out.println(person13);
    }
}
