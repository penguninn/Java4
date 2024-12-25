package poly.utils;

import poly.entity.ViewCount;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class VisitorCounterListener implements ServletContextListener, HttpSessionListener {
    private int visitors = 0;
    EntityManager em = XJPA.getEntityManager();
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        visitors = ((Number) em.createQuery("select v.visitorsCount from ViewCount v where v.id = 1").getSingleResult()).intValue();
        sce.getServletContext().setAttribute("visitors", visitors);
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        visitors++;
        se.getSession().getServletContext().setAttribute("visitors", visitors);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        em.getTransaction().begin();
        em.merge(new ViewCount(1L, (long)visitors));
        em.getTransaction().commit();
    }
}
