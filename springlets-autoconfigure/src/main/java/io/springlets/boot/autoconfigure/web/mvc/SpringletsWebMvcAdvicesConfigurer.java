/*
 * Copyright 2012-2016 the original author or authors.
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

package io.springlets.boot.autoconfigure.web.mvc;

import org.springframework.beans.factory.annotation.Autowired;

import io.springlets.web.mvc.config.SpringletsWebMvcConfigurer;
import io.springlets.web.mvc.config.SpringletsWebMvcSettings;

/**
 * A {@link SpringletsWebMvcConfigurer} that applies configuration items from the
 * Spring Boot `springlets.mvc.advices` namespace to Springlets Web MVC.
 *
 * Based on https://github.com/spring-projects/spring-data-rest[Spring Data REST] project.
 * 
 * @author Enrique Ruiz at http://www.disid.com[DISID Corporation S.L.]
 */
class SpringletsWebMvcAdvicesConfigurer implements SpringletsWebMvcConfigurer {

	@Autowired
	private SpringletsWebMvcAdvicesProperties advicesProperties;

	@Override
	public void configureSpringletsWebMvcSettings(SpringletsWebMvcSettings config) {
		this.advicesProperties.applyTo(config);
	}

}
