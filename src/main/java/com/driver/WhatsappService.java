package com.driver;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepository whatsappRepository = new WhatsappRepository();

    public String createUser(String name, String mobile) throws Exception {                           // 1st API
        return whatsappRepository.createUser(name, mobile);
    }

    public Group createGroup(List<User> users) {                                                     // 2nd API
        return whatsappRepository.createGroup(users);
    }

    public int createMessage(String content){                                                        // 3rd API
        return whatsappRepository.createMessage(content);
    }

    public int sendMessage(Message message, User sender, Group group) throws Exception{             // 4th API
        return whatsappRepository.sendMessage(message, sender, group);
    }

    public String changeAdmin(User approver, User user, Group group) throws Exception{              // 5th API
        return whatsappRepository.changeAdmin(approver, user, group);
    }

    public int removeUser(User user) throws Exception{                                              // 6th API
        return whatsappRepository.removeUser(user);
    }

    public String findMessage(Date start, Date end, int K) throws Exception{                        // 7th API
        return whatsappRepository.findMessage(start, end, K);
    }
}
