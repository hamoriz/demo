package com.micro.service1.controller;

import com.micro.service1.Loggable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zoltan_Hamori on 2/22/2017.
 */
@RestController
public class Service1Controller {


    @Loggable
    @RequestMapping("/getFive")
    public ResponseEntity<Integer> getFive() {
        return new ResponseEntity<Integer>(5, HttpStatus.OK);
    }
}
