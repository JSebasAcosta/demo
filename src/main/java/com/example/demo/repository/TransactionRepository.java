package com.example.demo.repository;

import com.example.demo.controller.dto.TransactionDTO;
import com.example.demo.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity,Integer>  {

}
