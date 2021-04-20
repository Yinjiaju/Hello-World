package com.test.exam;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OtherXmlAppCondition implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//-DotherXml=true  （绕行方案，比如xml中引入other。xml中用${other.xml--参数里的:defalut.xml}）  
		String otherProperties = context.getEnvironment().getProperty("otherXml","false");
		if("true".equalsIgnoreCase(otherProperties)) {
			return true;
		}
		return false;
	}
	
}
