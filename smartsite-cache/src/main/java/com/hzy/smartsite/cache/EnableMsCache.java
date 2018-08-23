package com.hzy.smartsite.cache;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author Hzy
 * @create 2017/11/17.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AutoConfiguration.class)
@Documented
@Inherited
public @interface EnableMsCache {
}
