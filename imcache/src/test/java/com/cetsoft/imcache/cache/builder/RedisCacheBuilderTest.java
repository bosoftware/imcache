/**
 * Copyright © 2013 Cetsoft. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cetsoft.imcache.cache.builder;

import static org.junit.Assert.assertTrue;

import com.cetsoft.imcache.cache.Cache;
import com.cetsoft.imcache.redis.RedisCache;
import org.junit.Test;

/**
 * The Class RedisCacheBuilderTest.
 */
public class RedisCacheBuilderTest {

  /**
   * Builds the.
   */
  @Test
  public void build() {
    Cache<Object, Object> cache = CacheBuilder.redisCache()
        .cacheLoader(BaseCacheBuilder.DEFAULT_CACHE_LOADER)
        .evictionListener(BaseCacheBuilder.DEFAULT_EVICTION_LISTENER)
        .serializer(BaseCacheBuilder.DEFAULT_SERIALIZER)
        .hostName("localhost").port(6379).concurrencyLevel(2).build();
    assertTrue(cache instanceof RedisCache);
  }
}
