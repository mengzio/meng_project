package org.admin.mapper;

import java.util.HashMap;
import java.util.List;

public interface HomeMybatis {
	
	public int getTotalCount();
	public List<HashMap<String, Object>> getTestList();
	
}
