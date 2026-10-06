package com.example.demo.Service;

import com.example.demo.Exception.IncidentException;
import com.example.demo.Model.Incident;
import com.example.demo.Repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class IncidentService {

    @Autowired
    IncidentRepository incidentRepository;

    public Incident create(Incident incident) throws Exception{
        Incident incident1 = incidentRepository.getIncidentMap().get(incident.getIncidentId());
        if(incident1 != null){
            throw new IncidentException("Incident already exsits");
        }
        incidentRepository.getIncidentMap().put(incident.getIncidentId(),incident);
        return incident;
    }

    public Incident get(String id) throws Exception{
        Incident incident1 = incidentRepository.getIncidentMap().get(id);
        if(incident1 == null){
            throw new IncidentException("Incident not found");
        }
;
        return incidentRepository.getIncidentMap().get(id);
    }
}
