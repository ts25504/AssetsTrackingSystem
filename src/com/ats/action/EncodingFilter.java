package com.ats.action;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter{

	private FilterConfig config;
	private String encoding="utf-8";
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(encoding);//���� �ı���
		chain.doFilter(request, response);//��������
		response.setContentType("text/html;charset=UTF-8");//������Ӧ�ı���
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		this.config=filterConfig;
		String s = config.getInitParameter("encoding");//��ȡ��ʼ������ֵ
		if(s!=null){
			this.encoding=s;
		}
	}

}
