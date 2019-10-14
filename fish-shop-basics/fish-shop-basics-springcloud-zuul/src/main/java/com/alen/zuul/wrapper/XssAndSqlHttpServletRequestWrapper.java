package com.alen.zuul.wrapper;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 防止xss攻击
 * @author alen
 * @create 2019-10-14 10:22
 **/
public class XssAndSqlHttpServletRequestWrapper extends HttpServletRequestWrapper {

	public XssAndSqlHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);

	}

	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		if (!StringUtils.isEmpty(value)) {
			value = StringEscapeUtils.escapeJava(value);
		}
		return value;
	}
}
