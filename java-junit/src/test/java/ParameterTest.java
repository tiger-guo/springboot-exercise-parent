import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.concurrent.TimeUnit;

/**
 * @program: springboot-exercise-parent
 * @description: 参数化测试
 * @author: liuguohu
 * @create: 2020-04-09 11:04
 **/

public class ParameterTest {

    @ParameterizedTest
    @ValueSource(strings= {"shi","yan","lou"})
    void parameter(String args) {
        System.out.println(args);
    }

    @ParameterizedTest
    //使用names制定需要的枚举常量
    @EnumSource(value = TimeUnit.class, names = { "DAYS", "HOURS" })
    void enumSource(TimeUnit timeUnit) {
        System.out.println(timeUnit.toString());
    }

    @ParameterizedTest
    @CsvSource({ "shi, 1", "yan, 2", "'lou, plus', 3" })
    void csvSource(String first, int second) {
        System.out.println(first+"---"+second);
    }
}
