package com.cg.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.ScheduleDao;
import com.cg.spring.dto.ScheduledSessions;

@Service("Scheduleservice")
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
	ScheduleDao scheduleDao;

	@Override
	public List<ScheduledSessions> viewScheduledSessions() {
		
	return scheduleDao.viewScheduledSessions();
	}
	@Override
	public ScheduledSessions searchScheduledSession(int id) {
		
		return scheduleDao.searchScheduledSession(id);
	}
	


}
