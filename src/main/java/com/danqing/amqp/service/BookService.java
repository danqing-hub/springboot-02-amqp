package com.danqing.amqp.service;

import com.danqing.amqp.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @author 丹青
 * @date 2020/4/21-19:27
 */
@Service
public class BookService {

    @RabbitListener(queues = "atdanqing.news")//指定监听那一个消息队列
    public void receive(Book book){
        System.out.println("收到消息"+book);
    }

    @RabbitListener(queues = "atdanqing")//指定监听那一个消息队列
    public void receive02(Message message){
        System.out.println(message.getBody());
        System.out.println(message.getMessageProperties());
    }
}
