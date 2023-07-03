package org.docksysprune.d;

public class User {

    private ServiceMail serviceMail;

    public User(){
        this.serviceMail = new ServiceMail();
    }

    public void sendEmail(String addresse, String message){
        serviceMail.send(addresse,message);
    }
}
