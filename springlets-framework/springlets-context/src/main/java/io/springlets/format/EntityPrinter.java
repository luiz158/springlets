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
package io.springlets.format;

import org.springframework.core.convert.ConversionService;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;

import java.util.Locale;

/**
 * A Printer for objects values. It uses a SpEl expression to build a String
 * with the object properties and methods.
 * 
 * @author Cèsar Ordiñana at http://www.disid.com[DISID Corporation S.L.]
 */
public class EntityPrinter extends AbstractEntityPrinter {

  private final String expression;

  /**
   * Creates a new instance with the given expression and expression parser.
   * @param expression expression to generate a String from the provided objects
   * @param parser to parse the expression
   * @param templateParserContext context to use to parse the expression
   * @param defaultExpression expression to use if the expression to use in the conversion is empty
   */
  public EntityPrinter(String expression, ExpressionParser parser,
      TemplateParserContext templateParserContext, String defaultExpression) {
    super(parser, templateParserContext, defaultExpression);
    this.expression = expression;
  }

  /**
   * Creates a new instance with the given expression and expression parser.
   * @param expression expression to generate a String from the provided objects
   * @param parser to parse the expression
   * @param templateParserContext context to use to parse the expression
   * @param conversionService the ConversionService to use to convert property values 
   * inside the expression
   * @param defaultExpression expression to use if the expression to use in the conversion is empty
   */
  public EntityPrinter(String expression, ExpressionParser parser,
      TemplateParserContext templateParserContext, ConversionService conversionService,
      String defaultExpression) {
    super(parser, templateParserContext, conversionService, defaultExpression);
    this.expression = expression;
  }

  @Override
  protected String getExpression(Locale locale) {
    return expression;
  }

}
