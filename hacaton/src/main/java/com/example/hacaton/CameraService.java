package com.example.hacaton;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.aggregation.MergeOperation.UniqueMergeId.id;

@Service
public class CameraService {

private final CameraRepositoryI cameraRepositoryI;

    public CameraService(CameraRepositoryI cameraRepositoryI) {
        this.cameraRepositoryI = cameraRepositoryI;
    }


    public Optional<Camera> findById(String id) {
        try {
            ObjectId objectId = new ObjectId(id);
            return cameraRepositoryI.findById(objectId);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid ID format: " + id);
            return Optional.empty();
        }
    }
 public List<Camera> findAll() {
        return cameraRepositoryI.findAll();
 }
}
