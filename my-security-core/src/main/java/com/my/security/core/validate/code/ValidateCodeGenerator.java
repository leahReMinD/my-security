/**
 * 
 */
package com.my.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author xiaoyuan
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
