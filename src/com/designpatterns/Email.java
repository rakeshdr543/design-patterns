package com.designpatterns;

public class Email {
    public void sendEmail(){
        connect();
        authenticate();

        // Send email handling

        disconnect();

    }

    private void connect (){}

    private void disconnect (){}

    private void authenticate (){}

}
