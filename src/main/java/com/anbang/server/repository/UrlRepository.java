package com.anbang.server.repository;

import com.anbang.server.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wuweifeng wrote on 2018/3/7.
 */
public interface UrlRepository extends JpaRepository<Url, Long> {
    Url findFirstByUrl(String url);
}
