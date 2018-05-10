package com.spring.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.spring.constants.CommonConstants;


/**
 * Web project initializer class
 * 
 *
 */
public class WebAppInitializer implements WebApplicationInitializer {

    /**
     * Register servlets and listeners on startup [web.xml implementation]
     * @param servletContext
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ContextLoaderListener contextLoaderListener = new ContextLoaderListener(ctx);
        servletContext.addListener(contextLoaderListener);
        ctx.register(WebMvcConfig.class);
        ctx.register(WebHibernateConfiguration.class);
        ctx.register(SwaggerConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet(CommonConstants.DISPATCHER,
            new DispatcherServlet(ctx));

        servlet.setLoadOnStartup(CommonConstants.ONE);
        servlet.addMapping(CommonConstants.SLASH);
        // For CORS Pre Filght Request
        servlet.setAsyncSupported(true);
        servlet.setInitParameter("dispatchOptionsRequest", "true");
    }

}