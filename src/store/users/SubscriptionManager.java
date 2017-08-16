package store.users;

import settings.Sender;

import java.util.ArrayList;

public class SubscriptionManager {
    private static Sender tlsSender = new Sender("fomichov.developer@gmail.com", "***********");
    private ArrayList<User> users = new ArrayList<>();

    public SubscriptionManager() {
    }

    public SubscriptionManager(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message) {
        System.out.println("отправляем письма");
        for (int i = 0; i < getEmailUser().size(); i++) {
            sendEmails(message, getEmailUser().get(i));
        }
    }

    private void sendEmails(String message, String email) {
        //tlsSender.send("Сообщение из интернет магазина", message, "fomichov.developer@gmail.com", email);
    }

    // выводим в консоль всех юзеров
    public void showUsers() {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).show();
        }
    }

    // полуаем список почт для отправки
    private ArrayList<String> getEmailUser(){
        ArrayList<String> emails = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).isSendEmail()){
                emails.add(users.get(i).getEmail());
            }
        }
        return emails;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
