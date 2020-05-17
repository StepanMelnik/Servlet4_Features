package com.sme.servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.PushBuilder;

/**
 * Home servlet working with {@link PushBuilder} in Servlet 4 specification.
 */
@WebServlet(displayName = "Home Servlet", name = "Home", value = {"/http2"})
public class HomeServlet extends HttpServlet
{
    public HomeServlet()
    {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PushBuilder newPushBuilder = request.newPushBuilder();
        Objects.requireNonNull(newPushBuilder, "Tomcat must use org.apache.coyote.http11.Http11NioProtocol with <UpgradeProtocol className=\"org.apache.coyote.http2.Http2Protocol\" /> property");

        newPushBuilder
                .path("resources/images/tomcat.png")
                .push();

        getServletContext().getRequestDispatcher("/tomcat.jsp").forward(request, response);
    }
}
