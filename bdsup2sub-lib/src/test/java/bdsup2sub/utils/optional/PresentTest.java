/*
 * Copyright 2014 Miklos Juhasz (mjuhasz)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package bdsup2sub.utils.optional;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PresentTest {

    private Optional<String> subject = Optional.of("foo");

    @Test
    public void shouldBePresent() throws Exception {
        assertTrue(subject.isPresent());
    }

    @Test
    public void getGetValue() throws Exception {
        assertEquals("foo", subject.get());
    }

    @Test
    public void shouldReturnValue() throws Exception {
        assertEquals("foo", subject.get());
    }
}
