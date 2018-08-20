package spring.boot.activemq.service.impl;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;
import spring.boot.activemq.service.MQService;


/**
 * @author 武海升
 * @date 2018/8/20 14:01
 */
@Service
public class MQServiceImpl implements MQService {

    private final JmsMessagingTemplate jmsTemplate;

    @Autowired
    public MQServiceImpl(JmsMessagingTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }


    @Override
    public void addMessage(String message) {
        jmsTemplate.convertAndSend(new ActiveMQQueue("queueTest"), message);
    }
}
