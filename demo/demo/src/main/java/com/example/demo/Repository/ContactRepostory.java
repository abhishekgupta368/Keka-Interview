package com.example.demo.Repository;

import com.example.demo.Model.ServiceOnCall;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ContactRepostory {
    Map<String, ServiceOnCall> serviceOnCallMap;

    public ContactRepostory(){
        serviceOnCallMap = new HashMap<>();
//        serviceOnCallMap.add("svc-")
    }

    public Map<String, ServiceOnCall> getServiceOnCallMap() {
        return serviceOnCallMap;
    }

    public void setServiceOnCallMap(Map<String, ServiceOnCall> serviceOnCallMap) {
        this.serviceOnCallMap = serviceOnCallMap;
    }
}
