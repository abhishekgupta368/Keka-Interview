package com.example.demo.Repository;

import com.example.demo.Model.Incident;
import com.example.demo.Model.ServiceOnCall;

import java.util.HashMap;
import java.util.Map;

public class IncidentRepository {
    Map<String, Incident> incidentMap;

    public IncidentRepository(){
        incidentMap = new HashMap<>();
//        serviceOnCallMap.add("svc-")
    }

    public Map<String, Incident> getIncidentMap() {
        return incidentMap;
    }

    public void setIncidentMap(Map<String, Incident> incidentMap) {
        this.incidentMap = incidentMap;
    }
}
