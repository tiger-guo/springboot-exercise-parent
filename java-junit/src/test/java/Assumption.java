import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

/**
 * @program: springboot-exercise-parent
 * @description: 假设和条件测试
 * @author: liuguohu
 * @create: 2020-04-09 10:49
 **/

public class Assumption {

    @Test
    void assumeTrueTest() {
        //如果假设传入的值为True，那么就会执行后面测试，否则直接停止执行
        assumeTrue(false);
        System.out.println("This will not be implemented.");
    }

    @Test
    void assumeFalseTest() {
        //如果假设传入的值为false，那么就会执行后面测试，否则直接停止执行
        assumeFalse(true);
        System.out.println("This will not be implemented.");
    }

    @Test
    void assumingThatTest() {
        //    assumingThat​(boolean assumption, Executable executable)
        //assumingThat 接受一个boolean值assumption，如果assumption为true，那么将会执行executable，否则不会执行，
        //但是assumingThat即使为false也不会影响后续代码的执行，他和assumeFalse和assumeTrue不同，assumingThat只
        //决定Executable是否执行，Executable是一个函数式接口，接受一个没有参数和返回值的方法。
        assumingThat(false,
                () -> {
                    System.out.println("This will not be implemented.");
                });
        //下面的输出将会执行
        System.out.println("This will be implemented.");
    }
}
