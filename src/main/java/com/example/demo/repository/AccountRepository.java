package com.example.demo.repository;

import com.example.demo.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Transactional
@Repository
public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
    @Modifying
    @Query(value = "update ACCOUNT a set a.MONEY = a.Money+ :money  where a.ID = :id",nativeQuery = true)
    void depositMoney(@Param("money") int money, @Param("id") int id);
    @Query(value ="select * from ACCOUNT where USER = ?1", nativeQuery = true)
    List<AccountEntity> getAllAccounts(int document);
}
