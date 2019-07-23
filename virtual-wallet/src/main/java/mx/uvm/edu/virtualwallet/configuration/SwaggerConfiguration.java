/*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <https://www.gnu.org/licenses/>.
* 
*
* Nombre de archivo: SwaggerConfiguration.java
* Autor: salvgonz
* Fecha de creación: 22/07/2019
*/


package mx.uvm.edu.virtualwallet.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * The Class SwaggerConfiguration.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  /**
   * Api.
   *
   * @return the docket
   */
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .groupName("VIRTUAL-WALLET")
        .apiInfo(apiInfo())
        .useDefaultResponseMessages(false)
        .select().paths(regex("/api/*.*"))
        .build();
  }

  /**
   * Api info.
   *
   * @return the api info
   */
  private ApiInfo apiInfo() {

    return new ApiInfoBuilder().title("VIRTUAL WALLET API'S")
        .description("Application manager REST API documentation.")
        .version("1.0")
        .contact(new Contact("uvm.edu", null, null))
        .extensions(Collections.emptyList()).build();
  }
}