package com.tistory.tazz009.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tistory.tazz009.dao.AuditDao;
import com.tistory.tazz009.domain.AuditObject;

@Service
public class AuditService {
	
//	@Resource(name="auditDao")
	private AuditDao auditDao;
	
	public void log(AuditObject audit) {
		auditDao.log(audit);
	}
	
	public void setAuditDao(AuditDao auditDao) {
		this.auditDao = auditDao;
	}
	
}
