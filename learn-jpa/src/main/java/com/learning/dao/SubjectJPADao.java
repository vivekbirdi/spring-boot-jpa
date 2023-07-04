package com.learning.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.learning.entity.MSubject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class SubjectJPADao {

	@PersistenceContext
	private EntityManager entityManager;
	
	// Insert a Record
	public void insert (MSubject subject) {
		entityManager.merge(subject);
	}
	
	// Select a row
	public MSubject findById (long subjectId) {
		return entityManager.find(MSubject.class, subjectId);
	}
	
	// Select All
	public List<MSubject> findAll(){
		
		String jpql = "SELECT e FROM MSubject e";
		Query query =  entityManager.createQuery(jpql);
		return query.getResultList();
	}
	
	//Delete a row
	public void deleteById (long subjectId) {
		MSubject subject = findById(subjectId);
		entityManager.remove(subject);
	}
}
