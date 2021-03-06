package com.virjar.dungproxy.server.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.virjar.dungproxy.server.entity.DomainMeta;

@Repository
public interface DomainMetaRepository {
    int deleteByPrimaryKey(Long id);

    int insert(DomainMeta domainmeta);

    int insertSelective(DomainMeta domainmeta);

    DomainMeta selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DomainMeta domainmeta);

    int updateByPrimaryKey(DomainMeta domainmeta);

    int selectCount(DomainMeta domainmeta);

    List<DomainMeta> selectPage(DomainMeta domainmeta, Pageable pageable);

    List<DomainMeta> selectBefore(@Param("date") Date date, @Param("page") Pageable pageable);
}