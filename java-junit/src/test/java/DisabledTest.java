import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @program: springboot-exercise-parent
 * @description: 禁用测试
 * @author: liuguohu
 * @create: 2020-04-09 10:59
 **/

public class DisabledTest {

    @Test
    //使用@Disabled注解关闭
    @Disabled
    void disabled() {
        System.out.println("Not running");
    }

    @Test
    void open() {
        System.out.println("running");
    }
}
