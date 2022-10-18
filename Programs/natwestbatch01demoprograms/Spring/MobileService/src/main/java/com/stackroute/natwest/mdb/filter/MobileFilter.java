package com.stackroute.natwest.mdb.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.GenericFilter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@WebFilter(urlPatterns = {"/*"})
public class MobileFilter extends GenericFilter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		
	    String authToken=req.getHeader("authorization");
	    System.out.println(authToken);
	    String jwtToken=authToken.substring(7);
	    System.out.println(jwtToken);
	    
	    Claims claims=Jwts.parser().setSigningKey("secretKey")
	    		.parseClaimsJws(jwtToken).getBody();
	    System.out.println("Claims "+claims);
	    chain.doFilter(request, response);    		
	}

}
