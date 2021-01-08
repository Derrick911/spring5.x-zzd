/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.aop.testfixture.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * Simple before advice example that we can use for counting checks.
 *
 * @author Rod Johnson
 */
@SuppressWarnings("serial")
public class CountingBeforeAdvice extends MethodCounter implements MethodBeforeAdvice {

	// 实现before的回调接口,这是接口MethodBeforeAdvice的要求
	@Override
	public void before(Method m, Object[] args, Object target) throws Throwable {
		count(m);
	}

}
