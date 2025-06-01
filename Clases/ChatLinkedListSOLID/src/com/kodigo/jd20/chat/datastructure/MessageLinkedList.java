package com.kodigo.jd20.chat.datastructure;

import com.kodigo.jd20.chat.model.Message;

public class MessageLinkedList {
    private MessageNode head;

    public void addMessage(Message message) {
        // Creamos el nodo con el "message" que nos proporcionan
        MessageNode newMessageNode = new MessageNode(message);


        if (head == null) {
            head = newMessageNode;
        } else {
            MessageNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newMessageNode;
        }
    }

    public void showAll(){
        MessageNode current = head;
        while (current != null) {
            Message message = current.message;
            System.out.println(
                "[" + message.getSender().getName() + "] " + message.getContent() + " (" + message.getTimeStamp() + ")"
            );
            current = current.next;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

}
