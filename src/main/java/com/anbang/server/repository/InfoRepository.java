package com.anbang.server.repository;

import com.anbang.server.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface InfoRepository extends JpaRepository<Info, Long>, JpaSpecificationExecutor<Info> {
    List<Info> findByPhone(String phone);
}
