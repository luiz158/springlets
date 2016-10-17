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
package io.springlets.web.config;

import io.springlets.http.converter.json.BindingResultModule;
import io.springlets.http.converter.json.BindingResultSerializer;
import io.springlets.http.converter.json.FieldErrorSerializer;

import org.springframework.context.annotation.Import;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to automatically register the following Jackson deserializers 
 * for usage with Spring MVC:
 * 
 * * {@link BindingResultSerializer}: to serialize {@link BindingResult} 
 *   objects.
 * * {@link FieldErrorSerializer}: to serialize {@link FieldError} objects
 *
 * @see BindingResultModule
 * @author Cèsar Ordiñana at http://www.disid.com[DISID Corporation S.L.]
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Inherited
@Import({BindingResultModule.class})
public @interface EnableSpringletsWebJacksonSupport {

}
