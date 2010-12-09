/*
 * Created on Dec 9, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package lombok.core.util;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

/**
 * Tests for <code>{@link Arrays#copy(Object[])}</code>.
 *
 * @author Alex Ruiz
 */
public class Arrays_copy_Test {

  @Test public void should_copy_array() {
    Object[] array = { "Yoda", "Leia" };
    Object[] copy = Arrays.copy(array);
    assertThat(copy).isEqualTo(array)
                    .isNotSameAs(array);
  }
}
