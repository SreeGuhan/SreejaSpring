package com.cg.spring.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.ScheduledSessions;

@Repository("ScheduleDao")
public class ScheduleDaoImpl implements ScheduleDao {
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public List<ScheduledSessions> viewScheduledSessions() {

		List<ScheduledSessions> list = new ArrayList<>();
		Query query = entitymanager.createQuery("FROM ScheduledSessions");
		list = query.getResultList();
		return list;
	}

	@Override
	public ScheduledSessions searchScheduledSession(int id) {

		Query queryOne = entitymanager.createQuery("FROM ScheduledSessions where id=:emp_id");
		queryOne.setParameter("emp_id", id);
		ScheduledSessions schedule = (ScheduledSessions) queryOne.getSingleResult();

		return schedule;
	}

}
