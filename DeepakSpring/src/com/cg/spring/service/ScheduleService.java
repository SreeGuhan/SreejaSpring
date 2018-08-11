package com.cg.spring.service;

import java.util.List;

import com.cg.spring.dto.ScheduledSessions;

public interface ScheduleService {

	public List<ScheduledSessions> viewScheduledSessions();
	public ScheduledSessions searchScheduledSession(int id);
}
