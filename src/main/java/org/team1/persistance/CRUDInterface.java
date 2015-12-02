package org.team1.persistance;

public interface CRUDInterface<V,K> {

	public void create(V vo) throws Exception;
	public V read(K key) throws Exception;
	public void update(V vo) throws Exception;
	public void delete()
}
