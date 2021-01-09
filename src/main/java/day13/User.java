package day13;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User currentUser : subscriptions) {
            if (currentUser.getUsername().equals(user.getUsername())) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);

    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);

    }


    @Override
    public String toString() {
        return username;
    }
}
