/*
 * Copyright 2020 Yu Liebing
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
 * */
package com.github.tm.stindex.api;

import com.github.tm.stindex.ByteArray;
import org.junit.Test;

public class ByteArrayTest {

  @Test
  public void fromLongTest() {
    ByteArray ba = new ByteArray(12L);
    System.out.println(ba.getHexString());
  }

  @Test
  public void toLongTest() {
    byte[] testBytes = new byte[] {1, 2, 3, 4};
    ByteArray ba = new ByteArray(testBytes);
    System.out.println(ba.toLong());
    System.out.println(ba.getHexString());
  }

}