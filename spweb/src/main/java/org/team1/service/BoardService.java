package org.team1.service;

import java.util.List;

import org.team1.domain.Criteria;

public interface BoardService<V, K> {

   
   public List<V> listAll() throws Exception;

   public void create(V vo)throws Exception;
   
   public V read(K key)throws Exception;
   
   public void delete(K key)throws Exception;
   
   public void update(V vo)throws Exception;
    
   public void hit(K key)throws Exception;

   public int searchCount(Criteria cri) throws Exception;

   public List<V> search(Criteria cri) throws Exception;
}