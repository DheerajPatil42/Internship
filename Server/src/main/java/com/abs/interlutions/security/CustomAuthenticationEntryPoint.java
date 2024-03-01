package com.abs.interlutions.security;

import java.io.IOException;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint
{

    /**
     * Commences an authentication scheme.
     * ExceptionTranslationFilter will populate the HttpSession attribute named
     * AbstractAuthenticationProcessingFilter.SPRING_SECURITY_SAVED_REQUEST_KEY
     * with the requested target URL
     * before calling this method.
     * Implementations modify the headers on the ServletResponse as necessary to
     * commence the authentication process.
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception)
            throws IOException, ServletException
    {

        response.setContentType("application/json");

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        response.getWriter().println(exception.getMessage());
    }
}
