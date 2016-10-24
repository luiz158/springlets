/*
 * Copyright 2016 the original author or authors.
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
package io.springlets.boot.autoconfigure.security.jpa;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import io.springlets.security.jpa.config.EnableSpringletsSecurityJpaAuthentication;
import io.springlets.security.jpa.config.SpringletsSecurityJpaAuthenticationConfiguration;

/**
 * {@link ConfigurationProperties} for Springlets Web MVC.
 * 
 * Based on DevToolsProperties.
 * 
 * @author Enrique Ruiz at http://www.disid.com[DISID Corporation S.L.]
 */
//@AutoConfigureBefore(JpaBaseConfiguration.class)
//@ConditionalOnClass({SpringletsSecurityJpaAuthenticationConfiguration.class,
//    LocalContainerEntityManagerFactoryBean.class})
//@Configuration
//@ConfigurationProperties(prefix = "springlets.security.jpa")
//@EnableSpringletsSecurityJpaAuthentication
public class SpringletsSecurityJpaAuthenticationAutoConfiguration {


}