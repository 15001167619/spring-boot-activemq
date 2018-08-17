package spring.boot.activemq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author 武海升
 * @date 2018/8/17 14:58
 */
@Component
public class QueueReceiver {

    @JmsListener(destination = "queueTest", containerFactory = "jmsQueueListenerContainerFactory")
    public void receive(String msg) {
        System.out.println("queue1 监听到的消息内容为: " + msg);
    }

    @JmsListener(destination = "queueTest", containerFactory = "jmsQueueListenerContainerFactory")
    public void receive2(String msg) {
        System.out.println("queue2 监听到的消息内容为: " + msg);
    }

}
