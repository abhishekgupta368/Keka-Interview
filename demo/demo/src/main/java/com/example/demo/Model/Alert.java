package com.example.demo.Model;

public class Alert {
    String serviceId;
    Sevirarity sevirarity;
    String title;
    String dedupkey;

    public Alert(String serviceId, Sevirarity sevirarity, String title, String dedupkey) {
        this.serviceId = serviceId;
        this.sevirarity = sevirarity;
        this.title = title;
        this.dedupkey = dedupkey;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Sevirarity getSevirarity() {
        return sevirarity;
    }

    public void setSevirarity(Sevirarity sevirarity) {
        this.sevirarity = sevirarity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDedupkey() {
        return dedupkey;
    }

    public void setDedupkey(String dedupkey) {
        this.dedupkey = dedupkey;
    }
}
