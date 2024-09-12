package com.charroux.javaCodingRules.web;

import com.charroux.javaCodingRules.data.MyData;
import com.charroux.javaCodingRules.service.DataException;
import com.charroux.javaCodingRules.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class WebService {

    MyService myService;
    Logger logger = LoggerFactory.getLogger(WebService.class);

    @Autowired
    public WebService(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public List<MyData> getData(){
        return myService.getData();
    }

    @GetMapping("/average")
    public int getAverage() throws DataException {
        logger.info("getAverage");
        return myService.average();
    }

    @PutMapping("/")
    public void add(int i){
        myService.addData(i);
    }
}
