package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERPlattenLagerModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERPlattenLagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.UUID;

@Service
public class USERPlattenLagerService {
    private final USERPlattenLagerRepository userPlattenLagerRepository;

    @Autowired
    public USERPlattenLagerService(USERPlattenLagerRepository userPlattenLagerRepository){
        this.userPlattenLagerRepository = userPlattenLagerRepository;
    }

    public USERPlattenLagerModel getUSERPlattenLagerById(Double id){
        return userPlattenLagerRepository.findByPlattenID(id);
    }

    public void updateUSERPlattenLager(String lagerPlatz, Double lng, Double brt, String mz3, Double plattenId, String auslagerId, String auslagerInfo, Date auslagerDatum, Double menge) {
        userPlattenLagerRepository.updateUSERPlattenLager(lagerPlatz,lng,brt,mz3,plattenId,auslagerId,auslagerInfo,menge);
    }

    public void insertUSERPlattenLager(Integer rowUserId, String matKurzzeichen, Double plattenId, String lagerplatz, String mz3, Double lng, Double brt){
        userPlattenLagerRepository.insertUSERPlattenLager(rowUserId, matKurzzeichen, plattenId, lagerplatz, mz3, lng, brt);
    }

    public Double getMaxPlattenID() {
        Double d = userPlattenLagerRepository.findMaxPlattenID();
        if(d==null){
            return 6000000000.;
        } else if(d==0.0){
            return 6000000000.;
        } else {
            return d;
        }
    }
}
