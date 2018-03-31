package com.gyx.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 表示这个线程是安全的 或者写法是安全的
 */
//表示作用的范围
@Target(ElementType.TYPE)
//注解存在的范围
@Retention(RetentionPolicy.SOURCE)
public @interface ThreadSafe {
    String value() default "这个线程安全";
}
