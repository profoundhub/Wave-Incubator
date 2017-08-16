/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.google.wave.api;

/**
 * Element Types.
 *
 * @author scovitz@google.com (Seth Covitz)
 * @author mprasetya@google.com (Marcel Prasetya)
 */
public enum ElementType {
  // Form Elements
  INPUT("INPUT"),
  PASSWORD("PASSWORD"),
  CHECK("CHECK"),
  LABEL("LABEL"),
  BUTTON("BUTTON"),
  RADIO_BUTTON("RADIO_BUTTON"),
  RADIO_BUTTON_GROUP("RADIO_BUTTON_GROUP"),
  TEXTAREA("TEXTAREA"),
  // Other
  INLINE_BLIP("INLINE_BLIP"),
  GADGET("GADGET"),
  INSTALLER("INSTALLER"),
  IMAGE("IMAGE"),
  LINE("LINE"),
  ATTACHMENT("ATTACHMENT");

  private final String text;

  private ElementType(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }

  /**
   * Converts a string into an ElementType. This is used primarily during
   * deserialization from JSON.
   *
   * @param name the name of the ElementType.
   * @return the ElementType representing that name.
   */
  public static ElementType valueOfIgnoreCase(String name) {
    return valueOf(name.toUpperCase());
  }
}
