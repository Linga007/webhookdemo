package com.example.webhookdemo;

public class WebhookDto {

    private String hubMode;
    private String hubchallenge;
    private String hubverify_token;

    public WebhookDto() {
    }

    public WebhookDto( String hubMode, String hubchallenge, String hubverify_token) {

        this.hubMode = hubMode;
        this.hubchallenge = hubchallenge;
        this.hubverify_token = hubverify_token;
    }



    public String getHubMode() {
        return hubMode;
    }

    public void setHubMode(String hubMode) {
        this.hubMode = hubMode;
    }

    public String getHubchallenge() {
        return hubchallenge;
    }

    public void setHubchallenge(String hubchallenge) {
        this.hubchallenge = hubchallenge;
    }

    public String getHubverify_token() {
        return hubverify_token;
    }

    public void setHubverify_token(String hubverify_token) {
        this.hubverify_token = hubverify_token;
    }

    @Override
    public String toString() {
        return "WebhookDto{" +

                ", hubMode='" + hubMode + '\'' +
                ", hubchallenge='" + hubchallenge + '\'' +
                ", hubverify_token='" + hubverify_token + '\'' +
                '}';
    }
}
