package com.mh.config;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import com.mh.context.ServletContextHolder;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import com.zaxxer.hikari.HikariDataSource;

@WebListener
public class ContextParamInitializer implements ServletContextListener {
    // - 톰캣이 웹 앱 시작
   //   - ServletContext 전역 등록
   //  - DB 설정 정보 등록 (context.setInitParameter)
   @Override
   public void contextInitialized(ServletContextEvent sce) {
      ServletContext context = sce.getServletContext();
      
      ServletContextHolder.setServletContext(context);  // 다른 클래스에서도 전역적으로 ServletContext 사용할수 있게 하는 
      

      context.setInitParameter("maria_driver", "org.mariadb.jdbc.Driver");
      context.setInitParameter("maria_url", "jdbc:mariadb://localhost:3307/maria_db");
      context.setInitParameter("maria_userName", "jhj");
      context.setInitParameter("maria_psw", "jhj1217d");
      
      context.setInitParameter("react_env", "production");
//      context.setInitParameter("react_env", "development");

   }
   
   //- 톰캣이 웹 앱 종료
   //- Hikari 커넥션 풀 정리
   //- JDBC 드라이버 해제
   //- MySQL cleanup 스레드 정리
   @Override
   public void contextDestroyed(ServletContextEvent sce) {
      HikariDataSource dataSource = (HikariDataSource)sce.getServletContext().getAttribute("dataSource");
      
      if( dataSource != null ) {
         dataSource.close();
         AbandonedConnectionCleanupThread.checkedShutdown();
         
         try {
            Driver driver = DriverManager.getDriver((String)(sce.getServletContext().getAttribute("closedJdbcUrl")));
            DriverManager.deregisterDriver(driver);
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
}