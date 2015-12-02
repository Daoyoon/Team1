package org.team1.persistance;

import java.util.List;

public class AbstractCRUDInterface<V,K> implements CRUDInterface<V, K> {

	@Override
	public void create(V vo) throws Exception {
			
	}

	@Override
	public V read(K key) throws Exception {
		
		return null;
	}

	@Override
	public void update(V vo) throws Exception {
		
	}

	@Override
	public void delete(K key) throws Exception {
		
	}

	@Override
	public List<V> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
