package kr.softsoldesk.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.softsoldesk.beans.MemberBean;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.softsoldesk.controller") //view와 관련
public class ServletAppContext implements WebMvcConfigurer {
	//WebMvcConfigurer: Spring MVC 프로젝트 설정 인터페이스
	
	@Resource(name= "memberBean")
	private MemberBean memberBean;
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
	//Controller의 메서드가 반환하는 jsp 이름 앞 뒤에 경로와 확장자를 붙여주도록 설정	
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	//정적 파일 경로 매핑
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/resources/");
	}
	
}//class
