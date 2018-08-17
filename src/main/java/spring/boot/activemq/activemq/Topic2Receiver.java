package spring.boot.activemq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author 武海升
 * @date 2018/8/17 15:00
 */
@Component
public class Topic2Receiver {

    @JmsListener(destination = "topicTest", containerFactory = "jmsTopicListenerContainerFactory2")
    public void receive(String msg) {
        System.out.println("这是持久订阅: " + msg);
    }


}
