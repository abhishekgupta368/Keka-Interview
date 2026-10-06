package com.example.demo.Repository;

import com.example.demo.Model.Alert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlertRepository {
    Map<String,Alert> alertMap;
    public AlertRepository(){
        alertMap = new HashMap<>();
    }

    public Map<String, Alert> getAlertMap() {
        return alertMap;
    }

    public void setAlertMap(Map<String, Alert> alertMap) {
        this.alertMap = alertMap;
    }
}
