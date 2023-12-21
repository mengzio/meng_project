package org.admin.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.admin.mapper.HomeMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class HomeServiceImpl implements HomeService{
	
	private final HomeMybatis homeMybatis;
	
	@Autowired
	public HomeServiceImpl(HomeMybatis homeMybatis) {
		this.homeMybatis = homeMybatis;
	}
//	@Setter
//	private HomeMybatis homeMybatis;
	
	@Override
	public int getTotalCount() {
		
		int a = 0;
		
		if (homeMybatis != null && homeMybatis.getTotalCount() != 0) {
				a = homeMybatis.getTotalCount();
		} else {
				System.out.println("NULL 또는 0");
		}
		
		System.out.println("homeMybatis: " + homeMybatis);
		
		return a;
	}
	
	@Override
	public List<HashMap<String, Object>> getTestList() {
		
		List<HashMap<String, Object>> map = new ArrayList<HashMap<String, Object>>();
		
		if (homeMybatis != null && homeMybatis.getTestList().size() > 0) {
			map = homeMybatis.getTestList();
		} else {
			System.out.println("NULL 또는 0");
		}
		System.out.println("getTestList: " + homeMybatis.getTestList());
		System.out.println("homeMybatis: " + homeMybatis);
		map = null;
		return map;
	}
	
	
	
}
