package com.sdk.app.dao;

import java.util.List;

public interface ClassDao {

	List<Object> getData(@SuppressWarnings("rawtypes") Class className);
	
}
