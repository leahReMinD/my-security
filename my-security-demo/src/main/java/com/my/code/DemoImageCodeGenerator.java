/**
 * 
 */
package com.my.code;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import com.my.security.core.validate.code.ValidateCodeGenerator;
import com.my.security.core.validate.code.image.ImageCode;

/**
 * @author xiaoyuan
 *
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	/* (non-Javadoc)
	 * @see com.my.security.core.validate.code.ValidateCodeGenerator#generate(org.springframework.web.context.request.ServletWebRequest)
	 */
	@Override
	public ImageCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}

}
