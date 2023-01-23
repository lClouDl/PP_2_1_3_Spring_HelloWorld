import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println("Сравниваем singleton: " + (bean == applicationContext.getBean("helloworld")));
        System.out.println("Сравниваем prototype: " + (applicationContext.getBean("cat") == applicationContext.getBean("cat")));
    }
}