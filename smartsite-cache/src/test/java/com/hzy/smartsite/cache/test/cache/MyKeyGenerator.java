package com.hzy.smartsite.cache.test.cache;

import com.hzy.smartsite.cache.constants.CacheScope;
import com.hzy.smartsite.cache.parser.IKeyGenerator;
import com.hzy.smartsite.cache.parser.IUserKeyGenerator;


public class MyKeyGenerator extends IKeyGenerator {
    @Override
    public IUserKeyGenerator getUserKeyGenerator() {
        return null;
    }

    @Override
    public String buildKey(String key, CacheScope scope, Class<?>[] parameterTypes, Object[] arguments) {
        return "myKey_"+arguments[0];
    }
}
