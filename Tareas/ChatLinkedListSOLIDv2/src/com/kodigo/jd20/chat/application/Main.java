package com.kodigo.jd20.chat.application;

import com.kodigo.jd20.chat.model.Chat;
import com.kodigo.jd20.chat.model.IMessage;
import com.kodigo.jd20.chat.model.TextMessage;
import com.kodigo.jd20.chat.model.User;
import com.kodigo.jd20.chat.service.ChatService;
import com.kodigo.jd20.chat.service.UserService;

public class Main {
    public static void main(String[] args) {

        // Creamos nuestros servicios: Repositorios y manejo de usuarios y chats
        UserService userService = new UserService();
        ChatService chatService = new ChatService();

        User luis = userService.createUser("1", "Luis");
        User ana = userService.createUser("2", "Ana");

        Chat chat = chatService.createChat();
        chatService.addUserToChat(chat.getId(), luis);
        chatService.addUserToChat(chat.getId(), ana);

        IMessage txtMessage1 = new TextMessage(luis, "Hola Ana, ¿Todavía estas trabajando en el mismo lugar?");
        chatService.sendMessage(chat.getId(), txtMessage1);
        chatService.sendMessage(chat.getId(), new TextMessage(ana, "Hola Luis, sí, sigo en la misma empresa, cada vez más ocupada"));
        chatService.sendMessage(chat.getId(), new TextMessage(luis, "Mandales un saludo a todos, espero que estén bien"));
        chatService.sendMessage(chat.getId(), new TextMessage(ana, "Gracias Luis, les mandaré tus saludos"));

//        chatService.getMessage("chat1");

        for (IMessage message : chat.getMessages().getAll()) {
            System.out.println(message.getSender().getName() + ": " + message.getContent());
        }

    }
}
