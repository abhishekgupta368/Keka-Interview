package com.example.demo.Model;

public class Incident {
    String incidentId;
    String serviceId;
    Sevirarity sevirarity;
    IncidentStatus incidentStatus;
    NotificationStatus notificationStatus;

    public Incident(String incidentId, String serviceId, Sevirarity sevirarity, IncidentStatus incidentStatus, NotificationStatus notificationStatus) {
        this.incidentId = incidentId;
        this.serviceId = serviceId;
        this.sevirarity = sevirarity;
        this.incidentStatus = incidentStatus;
        this.notificationStatus = notificationStatus;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
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

    public IncidentStatus getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(IncidentStatus incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}
