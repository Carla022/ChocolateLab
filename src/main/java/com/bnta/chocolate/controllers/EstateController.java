package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Estate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping ( value = "/estates")
public class EstateController {

    @GetMapping
    public ResponseEntity<List<Estate>> getAllEstates(){
        List<Estate> estate =

    }




}
