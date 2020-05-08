package com.artgallery.artgallery.service;

import org.springframework.stereotype.Service;

@Service
public interface DataManipulationService {
    public Object saveEntity(Object object);
    public void deleteEntity(Object object);
    public Object getEnitity();
}
