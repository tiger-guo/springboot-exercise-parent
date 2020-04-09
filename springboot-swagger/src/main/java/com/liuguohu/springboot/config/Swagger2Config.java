package com.liuguohu.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: springboot-exercise-parent
 * @description: Swagger 配置类
 * @author: liuguohu
 * @create: 2020-04-09 15:16
 **/

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // 配置基础信息，包括配置页面展示的基本信息包括，标题、描述、版本、服务条款、联系方式等。
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.liuguohu.springboot.controller"))// 修改为自己的 controller 包路径
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger-api文档")
                .description("liuguohu-swagger-api 文档")
                .version("1.0")
                .build();
    }
}
