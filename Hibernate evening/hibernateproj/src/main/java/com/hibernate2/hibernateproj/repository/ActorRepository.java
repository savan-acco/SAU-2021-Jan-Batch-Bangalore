package com.hibernate2.hibernateproj.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate2.hibernateproj.entity.Actor;

@Repository
@Transactional
public class ActorRepository {

	@PersistenceContext
    EntityManager entityManager;

    public void add(Actor ac){
        entityManager.persist(ac);
    }
    
    public void deleteActor(Actor ac){
        entityManager.remove(ac);
    }

    public Actor updateActor(Actor ac){
        return entityManager.merge(ac);
    }
    
    public List<Actor> getActorUsingQuery(Integer age) {
        Query query =
                entityManager.createQuery("select x from movie x where x.age > age");
        query.setParameter("age", age);
        return query.getResultList();

    }
    
    public List<Actor> getActorUsingQuery(String gender) {
        Query query =
                entityManager.createQuery("select x from movie x where x.gender  male");
        query.setParameter("gender", gender);
        return query.getResultList();

    }
	
}
