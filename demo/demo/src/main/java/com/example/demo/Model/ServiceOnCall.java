package com.example.demo.Model;


public class ServiceOnCall {
    String serviceId;
    String contact;

    public ServiceOnCall(String serviceId, String contact) {
        this.serviceId = serviceId;
        this.contact = contact;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
