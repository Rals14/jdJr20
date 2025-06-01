package com.kodigo.jd20.chat.application;

import com.kodigo.jd20.chat.model.Chat;
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

        Chat chat = chatService.createChat("chat1");
        chat.addParticipant(luis);
        chat.addParticipant(ana);

        chatService.sendMessage("chat1", luis, "Hola Ana, ¿Todavía estas trabajando en el mismo lugar?");
        chatService.sendMessage("chat1", ana, "Hola Luis, sí, sigo en la misma empresa, cada vez más ocupada");
        chatService.sendMessage("chat1", luis, "Mandales un saludo a todos, espero que estén bien");
        chatService.sendMessage("chat1", ana, "Gracias Luis, les mandaré tus saludos");

        chatService.getMessage("chat1");

    }
}
