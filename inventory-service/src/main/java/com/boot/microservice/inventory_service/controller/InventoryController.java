package com.boot.microservice.inventory_service.controller;

import com.boot.microservice.inventory_service.service.InventoryService;
import com.boot.microservice.inventory_service.utility.APIEndpoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(APIEndpoints.INVENTORY_API_ENDPOINT)
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    ///////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/sku")
    public ResponseEntity<Boolean> isInStockEndpoint(@RequestParam String sku) {

        boolean response = inventoryService.isInStockService(sku);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
