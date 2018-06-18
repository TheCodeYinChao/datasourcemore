package cn.more.datasource.anno;

import java.lang.annotation.*;

/**
 * 动态选择数据源注解,
 * 可标注于方法和类上
 * 方法上的注解会覆盖类上的而注解
 *
 * @author: lvhao
 * @since: 2016-4-15 11:22
 */
@Documented
@Inherited  // 声明注解可继承
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
public @interface TargetDataSource {

    String value();
}
