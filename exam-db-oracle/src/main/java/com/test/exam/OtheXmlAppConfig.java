package com.test.exam;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Conditional(OtherXmlAppCondition.class)
@Configuration
@ImportResource(locations = {"classpath:application-other.xml"})
public class OtheXmlAppConfig {
	
}
