package com.example.hacaton;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class CameraController {
    private final CameraService cameraService;

    public CameraController(CameraService cameraService) {
        this.cameraService = cameraService;
    }



    @GetMapping("/getCamera/{id}/quantity")
    public Integer getCameraQuantityById(@PathVariable String id) {
        System.out.println("Received ID: " + id);
        Integer quantity = cameraService.findById(id)
                .map(Camera::getQuantity)
                .orElse(null);
        System.out.println("Quantity: " + quantity);
        return quantity;
    }

    @GetMapping("/getCamera/{id}")
    public Optional<Camera> getCameraById(@PathVariable String id) {
        return cameraService.findById(id);
    }

    @GetMapping("/getCamera/all")
    public List<Camera> getAllCamera() {
        return cameraService.findAll() ;
    }



}