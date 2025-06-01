package com.kodigo.jd20.chat.service;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.Message;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatService {
    private final Map<String, Chat> chats = new HashMap<>();

    public Chat createChat(){
        Chat chat = new Chat();
        chats.put(chat.getId(), chat);
        return chat;
    }

    //nuevo metodo
    public void addUserToChat(String chatId, User user) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
            chat.addParticipant(user);
        }
    }

    public void sendMessage(String chatId, IMessage message) {
        Chat chat = chats.get(chatId);
        if (chat != null) {
//            chat.addMessage(new Message(user, content));
            chat.addMessage(message);
        }
    }

    public List<IMessage> getMessage(String chatId){
        Chat chat = chats.get(chatId);
        if (chat != null) {
            return chat.getMessages().getAll();
        }
        return null; // O lanzar una excepción si el chat no existe
    }
}
