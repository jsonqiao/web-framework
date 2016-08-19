package cn.jsonqiao.prj.wechat.service.wechat.impl;

import cn.jsonqiao.prj.wechat.domain.wechat.WechatDo;
import cn.jsonqiao.prj.wechat.mapper.BaseMapper;
import cn.jsonqiao.prj.wechat.mapper.wechat.WechatMapper;
import cn.jsonqiao.prj.wechat.service.impl.BaseServiceImpl;
import cn.jsonqiao.prj.wechat.service.wechat.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.ehcache.EhCacheCache;
import org.springframework.cache.jcache.JCacheCache;
import org.springframework.data.redis.cache.RedisCache;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by jsonqiao on 16/8/19.
 */
@Service
public class WechatServiceImpl extends BaseServiceImpl<WechatDo> implements WechatService {

    @Autowired
    private WechatMapper wechatMapper;

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    protected BaseMapper<WechatDo> getMapper() {
        return wechatMapper;
    }

    @Override
//    @CachePut(key = "#appId", cacheNames = "wechatBean")
    @Cacheable(key = "#appId")
    public WechatDo findByAppId(String appId) {
        Cache cache = cacheManager.getCache(appId);
        WechatDo wechatDo = cache.get(appId, WechatDo.class);
        if (wechatDo == null) {
            wechatDo = wechatMapper.findByAppId(appId);
            cache.put(appId, wechatDo);
            return wechatDo;
        }
        return wechatDo;
    }
}
