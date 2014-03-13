package com.tistory.tazz009.dao;

import com.tistory.tazz009.domain.AuditObject;

public interface AuditDao {

	int log(AuditObject audit);
}
