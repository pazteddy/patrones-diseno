package estructural.Facade.Services.Rest.Notification.Models;

public class Message {

    private String content;

    public Message(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println(content);
    }

}
