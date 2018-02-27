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

package com.openpojo.dns.routing;

import java.util.ArrayList;
import java.util.List;

import com.openpojo.dns.exception.RouteSetupException;
import com.openpojo.dns.routing.impl.DefaultRoute;
import com.openpojo.dns.routing.impl.HostRoute;
import com.openpojo.dns.routing.impl.SimpleRoutingTable;
import com.openpojo.dns.routing.impl.TopLevelDomainRoute;

/**
 * @author oshoukry
 */
public class RoutingTableBuilder {
  private List<HostRoute> hostRoutes = new ArrayList<>();
  private List<TopLevelDomainRoute> topLevelDomainRoutes = new ArrayList<>();
  private List<DefaultRoute> defaultRoutes = new ArrayList<>();

  public static RoutingTableBuilder create() {
    return new RoutingTableBuilder();
  }

  public RoutingTableBuilder with(Route entry) {
    boolean added = false;

    if (entry instanceof HostRoute)
      added = hostRoutes.add((HostRoute) entry);

    if (entry instanceof TopLevelDomainRoute)
      added = topLevelDomainRoutes.add((TopLevelDomainRoute) entry);

    if (entry instanceof DefaultRoute)
      added = defaultRoutes.add((DefaultRoute) entry);

    if (!added)
      throw RouteSetupException.getInstance("Unrecognized route type [" + entry.getClass().getName() + "]");

    return this;
  }

  public RoutingTable build() {
    return new SimpleRoutingTable(hostRoutes, topLevelDomainRoutes, defaultRoutes);
  }

  private RoutingTableBuilder() {}
}
