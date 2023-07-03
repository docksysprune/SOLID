package org.docksysprune.d.refactored;

public class User {

    private MailProvider mailProvider;

    public User(MailProvider mailProvider){
        this.mailProvider = mailProvider;
    }

    public void sendEmail(String addresse, String message){
        mailProvider.send(addresse,message);
    }
}
