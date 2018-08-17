package spring.boot.activemq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author 武海升
 * @date 2018/8/17 14:59
 */
@Component
public class TopicReceiver {

    @JmsListener(destination = "topicTest", containerFactory = "jmsTopicListenerContainerFactory")
    public void receive(String msg) {
        System.out.println("topicTest1 监听到的消息内容为: " + msg);
    }

    @JmsListener(destination = "topicTest", containerFactory = "jmsTopicListenerContainerFactory")
    public void receive2(String msg) {
        System.out.println("topicTest2 监听到的消息内容为: " + msg);
    }

}
