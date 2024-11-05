package com.iheb.sportt;



import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iheb.sport.SportApplication;
import com.iheb.sport.entities.sport;
import com.iheb.sport.repos.SportRepository;

@SpringBootTest(classes = SportApplication.class)
class SportApplicationTests {

    @Autowired
    private SportRepository sportRepository;
    
    
    @Test
    public void testCreatSport() {
        sport sp = new sport("football","sport collectif", new Date());
        sportRepository.save(sp);
    }
    
    
}
