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

import java.io.IOException;
import java.util.List;

import com.openpojo.dns.exception.RoutingResolverException;
import org.xbill.DNS.Message;
import org.xbill.DNS.Resolver;
import org.xbill.DNS.ResolverListener;
import org.xbill.DNS.TSIG;

/**
 * @author oshoukry
 */
//TODO: Implement
public class RoutingResolver implements Resolver {

  @Override
  public void setPort(int port) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setTCP(boolean flag) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setIgnoreTruncation(boolean flag) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setEDNS(int level) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setEDNS(int level, int payloadSize, int flags, List options) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setTSIGKey(TSIG key) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setTimeout(int secs, int msecs) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public void setTimeout(int secs) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public Message send(Message query) throws IOException {
    throw RoutingResolverException.getInstance("Operation not supported");
  }

  @Override
  public Object sendAsync(Message query, ResolverListener listener) {
    throw RoutingResolverException.getInstance("Operation not supported");
  }
}
