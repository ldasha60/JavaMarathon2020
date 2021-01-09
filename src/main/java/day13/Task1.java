package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "I am doing great.");
        user2.sendMessage(user1, "Thanks.");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hi");
        user3.sendMessage(user1, "How are you?");
        user3.sendMessage(user1, "Hope you are ok.");

        user1.sendMessage(user3, "I am doing great.");
        user1.sendMessage(user3, "Thanks.");
        user1.sendMessage(user3, "And you?");

        user3.sendMessage(user1, "I am fine.");

        MessageDatabase.showDialog(user1, user3);

    }
}
