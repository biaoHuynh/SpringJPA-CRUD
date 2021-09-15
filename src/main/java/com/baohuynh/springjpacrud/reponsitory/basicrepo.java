package com.baohuynh.springjpacrud.reponsitory;


import com.baohuynh.springjpacrud.entity.basic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface basicrepo extends JpaRepository<basic, Long> {

}
