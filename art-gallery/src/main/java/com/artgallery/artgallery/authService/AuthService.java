package com.artgallery.artgallery.authService;

import com.artgallery.artgallery.authDAO.AuthRepositoryDao;
import com.artgallery.artgallery.entityClass.Users;
import com.artgallery.artgallery.service.DataManipulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements DataManipulationService {

    @Autowired
    AuthRepositoryDao authRepositoryDao;

    @Override
    public Object saveEntity(Object object) {
        return authRepositoryDao.save((Users)object);
    }

    @Override
    public void deleteEntity(Object object) {
        authRepositoryDao.delete((Users)object);
    }

    @Override
    public Object getEnitity() {
        return authRepositoryDao.findAll();
    }
}
