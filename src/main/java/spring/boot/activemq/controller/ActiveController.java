package spring.boot.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.activemq.service.MQService;


/**
 * @author 武海升
 * @date 2018/8/17 15:04
 */
@RestController
public class ActiveController {

    @Autowired
    private MQService mqService;

    @GetMapping("jms/queue")
    public void jmsQueueTemplate(@RequestParam String value) {
        mqService.addMessage(value);
    }

    @GetMapping("jms/topic")
    public void jmsTopicTemplate(@RequestParam String value) {
        mqService.addMessage(value);
    }

}
