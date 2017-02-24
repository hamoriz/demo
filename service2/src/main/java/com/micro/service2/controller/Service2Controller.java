package com.micro.service2.controller;

import com.micro.service2.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zoltan_Hamori on 2/22/2017.
 */
@RestController
public class Service2Controller {


    @Autowired
    private NumberService numberService;

    @RequestMapping("/getNumber")
    public ResponseEntity<String> getFive() {
        return new ResponseEntity<String>("Number:"+numberService.getNumber(), HttpStatus.OK);
    }
}
