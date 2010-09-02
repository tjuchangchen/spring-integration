/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.core;

import java.util.concurrent.Future;

import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;

/**
 * @author Mark Fisher
 * @since 2.0
 */
public interface AsyncMessagingOperations {

	Future<Message<?>> asyncSendAndReceive(Message<?> requestMessage);

	Future<Message<?>> asyncSendAndReceive(MessageChannel channel, Message<?> requestMessage);

	Future<Message<?>> asyncSendAndReceive(String channelName, Message<?> requestMessage);

	<R> Future<R> asyncConvertSendAndReceive(Object request);

	<R> Future<R> asyncConvertSendAndReceive(MessageChannel channel, Object request);

	<R> Future<R> asyncConvertSendAndReceive(String channelName, Object request);

}
