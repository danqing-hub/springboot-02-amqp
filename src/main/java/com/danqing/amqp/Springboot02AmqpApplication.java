package com.danqing.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置类（RabbitAutoConfiguration）
 *  1、CachingConnectionFactory：；连接工厂
 *  2、RabbitProperties： 封装了RabbitMQ的所有配置
 *  3、RabbitTemplate：给RabbitMQ发送和接收消息
 *  4、AmqpAdmin：RabbitMQ的系统管理组件
 *  5、@EnableRabbit + @RabbitListener 监听消息队列的内容
 */
@EnableRabbit//开启基于注解的RabbitMQ模式
@SpringBootApplication
public class Springboot02AmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02AmqpApplication.class, args);
    }

}
