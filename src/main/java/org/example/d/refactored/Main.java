package org.example.d.refactored;

public class Main {
    public static void main(String[] args) {
        MailProvider serviceMail = new ServiceMail();
        User user = new User(serviceMail);
        user.sendEmail("addressee@adress.com","Hello World");
    }
}
