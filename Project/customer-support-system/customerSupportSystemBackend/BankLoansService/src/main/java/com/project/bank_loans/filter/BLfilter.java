package com.project.bank_loans.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(urlPatterns = {"/*"})
public class BLfilter extends GenericFilter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) request;
        HttpServletResponse res=(HttpServletResponse) response;

        String authToken=req.getHeader("authorization");
        System.out.println(authToken);
        String jwtToken=authToken.substring(7);
        System.out.println(jwtToken);

        Claims claims= Jwts.parser().setSigningKey("secretKey")
                .parseClaimsJws(jwtToken).getBody();
        System.out.println("Claims "+claims);
        chain.doFilter(request, response);

    }
}
