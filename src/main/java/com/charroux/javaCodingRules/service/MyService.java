package com.charroux.javaCodingRules.service;

import com.charroux.javaCodingRules.data.MyData;
import com.charroux.javaCodingRules.web.WebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {

    List<MyData> data = new ArrayList<MyData>();
    Logger logger = LoggerFactory.getLogger(MyService.class);

    public void addData(int i){
        data.add(new MyData(i));
    }

    public int average() throws DataException {
        if(data.size() == 0){
            logger.error("0 element in the list");
            throw new DataException("0 element in the list");
        }
        return data.stream().mapToInt(i -> i.getI()).sum() / data.size();
    }

    public boolean isPresent(int i) {
        return data.stream().anyMatch(value -> value.getI() == i);
    }

    public List<MyData> getData(){
        return data.stream().toList();
    }

}
