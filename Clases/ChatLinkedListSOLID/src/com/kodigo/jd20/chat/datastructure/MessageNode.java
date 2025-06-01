package com.kodigo.jd20.chat.datastructure;

import com.kodigo.jd20.chat.model.Message;

public class MessageNode {
    Message message;
    MessageNode next;

    public MessageNode(Message message) {
        this.message = message;
        this.next = null;
    }
}
