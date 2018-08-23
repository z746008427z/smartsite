/**
 *
 */
package com.hzy.smartsite.cache.service;

import com.hzy.smartsite.cache.entity.CacheBean;
import com.hzy.smartsite.cache.vo.CacheTree;

import java.util.List;


/**
 * 解决问题：
 *
 * @author Hzy
 * @version 1.0
 * @date 2018年8月3日
 * @since 1.7
 */
public interface ICacheManager {
    public void removeAll();

    public void remove(String key);

    public void remove(List<CacheBean> caches);

    public void removeByPre(String pre);

    public List<CacheTree> getAll();

    public List<CacheTree> getByPre(String pre);

    public void update(String key, int hour);

    public void update(List<CacheBean> caches, int hour);

    public String get(String key);
}
