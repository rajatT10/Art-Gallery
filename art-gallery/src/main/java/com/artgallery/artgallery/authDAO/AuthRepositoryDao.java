package com.artgallery.artgallery.authDAO;

import com.artgallery.artgallery.entityClass.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AuthRepositoryDao extends JpaRepository<Users,String> {
}
