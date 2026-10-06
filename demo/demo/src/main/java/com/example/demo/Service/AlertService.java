package com.example.demo.Service;

import com.example.demo.Model.*;
import com.example.demo.Repository.AlertRepository;
import com.example.demo.Repository.ContactRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/*
* EXOTEL_BASE_URL=https://sleeve-courage-how-engaged.trycloudflare.com
POST {EXOTEL_BASE_URL}/v1/calls
* */

@Service
public class AlertService {

    @Autowired
    AlertRepository alertRepository;

    @Autowired
    IncidentService incidentService;

    @Autowired
    ContactRepostory contactRepostory;

    @Autowired
    RestTemplate restTemplate;

    public void create(Alert alert) throws Exception{
        switch(alert.getSevirarity()){
            case Sevirarity.CRITICAL:{
                try {
                    String baseUrl = "https://sleeve-courage-how-engaged.trycloudflare.com/v1/calls";
                    ServiceOnCall serviceOnCall = contactRepostory.getServiceOnCallMap().get(alert.getServiceId());
                    Map<String,Object> payload = new HashMap<>();
                    payload.put("to",serviceOnCall.getContact());
                    payload.put("description","This service is down id: "+alert.getServiceId());
                    Map<String,Object> object = restTemplate.postForEntity(baseUrl,payload, HashMap.class).getBody();
                    Incident incident = new Incident("",alert.getServiceId(),alert.getSevirarity(),IncidentStatus.TRIGGERED, NotificationStatus.SENT,);
                    if(object.get("callSid") == null){
                        incident.setNotificationStatus(NotificationStatus.FAILED);
                    }
                    incidentService.create(incident);

                } catch (RestClientException e) {
                    System.out.println("Error fetching data: " + e.getMessage());

                    throw new  RuntimeException("System is problem");
                }
            }
            case Sevirarity.INFO :{
                incidentService.create(new Incident("",alert.getServiceId(),alert.getSevirarity(),IncidentStatus.NOTIFIED, NotificationStatus.SKIPPED,));
            }
            case  Sevirarity.WARNING:{
                incidentService.create(new Incident("",alert.getServiceId(),alert.getSevirarity(),IncidentStatus.NOTIFIED, NotificationStatus.SKIPPED,));
            }
            default:{

            }
        }
    }
}
