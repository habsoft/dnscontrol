/*
 * Copyright (c) 2018-2018 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.dns.routing.impl;

import com.openpojo.dns.routing.RoutingTableEntry;
import org.xbill.DNS.Resolver;

/**
 * @author oshoukry
 */
public class DomainRoutingTableEntry implements RoutingTableEntry {
  private final String key;
  private final Resolver[] resolvers;

  public DomainRoutingTableEntry(String key, Resolver... resolvers) {
    this.key = key;
    this.resolvers = resolvers;
  }

  @Override
  public String getKey() {
    return key;
  }

  @Override
  public Resolver[] getResolvers() {
    return resolvers;
  }

}
