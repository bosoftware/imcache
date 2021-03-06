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
package com.cetsoft.imcache.cache.search.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class ETFilter is used to retrieve items equals to the given value.
 */
public class ETFilter extends ArithmeticFilter {

  /**
   * Instantiates a new eT filter.
   *
   * @param attributeName the attribute name
   * @param expectedValue the expected value
   */
  public ETFilter(String attributeName, Object expectedValue) {
    super(attributeName, expectedValue);
  }


  @SuppressWarnings({"rawtypes", "unchecked"})
  public List<Object> filter(List<Object> objects) {
    final List<Object> result = new ArrayList<Object>(objects.size());
    for (final Object object : objects) {
      final Comparable objectValue = (Comparable) getAttributeValue(object);
      if (objectValue.compareTo(value) == 0) {
        result.add(object);
      }
    }
    return result;
  }

}
