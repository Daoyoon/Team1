package org.team1.persistance;

import java.util.List;

public interface CRUDInterface<V,K> {

	public void create(V vo) throws Exception;
	public V read(K key) throws Exception;
	public void update(V vo) throws Exception;
	public void delete(K key) throws Exception;
	public List<V> list() throws Exception;
} // 테스트테스트
