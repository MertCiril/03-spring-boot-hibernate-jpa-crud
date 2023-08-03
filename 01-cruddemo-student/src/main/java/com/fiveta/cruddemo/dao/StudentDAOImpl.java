package com.fiveta.cruddemo.dao;

import com.fiveta.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository //veri tabanı işlemlerinde kullanılır
public class StudentDAOImpl implements IStudentDAO{

    //define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //implement save method
    @Override
    @Transactional //veri tabanı işlemlerini gerçekleştiren fonksiyonlara yazılır
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }
}
