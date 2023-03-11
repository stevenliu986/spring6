package com.learning.spring6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SpringConfig
 * Package: com.learning.spring6.config
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 11/03/2023
 */

@Configuration // 表示这个类是个配置类
@ComponentScan("com.learning.spring6") // 指定组件扫描的路径
public class SpringConfig {

}
