package org.team1.service;

import java.util.List;

import org.team1.domain.BoardVO;

public interface BoardService<V, K> {

   
   public List<V> listAll() throws Exception;

   public void create(V vo)throws Exception;
   
   public BoardVO read(K key)throws Exception;
   
   public void delete(K key)throws Exception;
   
   public void update(V vo)throws Exception;
    
   public List<V> listpage(int page) throws Exception;
   
   public void hit(K key)throws Exception;

   public int totalcount() throws Exception;

}