package org.team1.persistance;

public interface CRUDInterface<V,K> {

	public void create(V vo) throws Exception;
}
