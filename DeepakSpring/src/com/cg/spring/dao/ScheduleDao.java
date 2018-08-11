package com.cg.spring.dao;

import java.util.List;

import com.cg.spring.dto.ScheduledSessions;

public interface ScheduleDao {
	
	public List<ScheduledSessions> viewScheduledSessions();
	public ScheduledSessions searchScheduledSession(int id);

}
