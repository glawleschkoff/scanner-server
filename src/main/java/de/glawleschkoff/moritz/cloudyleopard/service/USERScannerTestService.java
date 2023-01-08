package de.glawleschkoff.moritz.cloudyleopard.service;

import de.glawleschkoff.moritz.cloudyleopard.model.USERScannerTestModel;
import de.glawleschkoff.moritz.cloudyleopard.repository.USERScannerTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USERScannerTestService {
    private final USERScannerTestRepository userScannerTestRepository;

    @Autowired
    public USERScannerTestService(USERScannerTestRepository userScannerTestRepository){
        this.userScannerTestRepository = userScannerTestRepository;
    }

    public List<USERScannerTestModel> getItems(){
        return userScannerTestRepository.findAll();
    }
    public void modifyUSERScannerTest(String f1, Integer integer){
        userScannerTestRepository.update(f1, integer);
    }
}
