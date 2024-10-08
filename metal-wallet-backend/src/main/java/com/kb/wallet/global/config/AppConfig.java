package com.kb.wallet.global.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = {
    "com.kb.wallet"
})
@MapperScan(
    basePackages = {
        "com.kb.wallet.member.repository"
    },
    annotationClass = org.apache.ibatis.annotations.Mapper.class //해당패키지에서 @Mapper어노테이션이 선언된 인터페이스 찾기
)
@EnableJpaRepositories(basePackages = "com.kb.wallet.member.repository")
@EnableTransactionManagement

public class AppConfig {
  @Bean
  public DataSource dataSource() {
    HikariConfig config = new HikariConfig();
    config.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");  // log4jdbc 사용
    config.setJdbcUrl("jdbc:log4jdbc:mysql://localhost:3306/shop?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC&characterEncoding=UTF-8&useUnicode=true");
    config.setUsername("root");
    config.setPassword("1234");

    config.setConnectionTimeout(30000);
    config.setMinimumIdle(1);
    config.setMaximumPoolSize(5);
    config.setIdleTimeout(600000);
    config.setMaxLifetime(1800000);
    config.setAutoCommit(true);

    return new HikariDataSource(config);
  }

  // JPA 설정
  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
    LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
    emf.setDataSource(dataSource);
    emf.setPackagesToScan("com.kb.wallet.member.domain");  // JPA 엔티티가 있는 패키지 설정
    emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

    // JPA Properties 설정
    Properties jpaProperties = new Properties();
    jpaProperties.put("hibernate.hbm2ddl.auto", "update"); // 테이블 자동 생성
    jpaProperties.put("hibernate.show_sql", "true"); // SQL 쿼리 로그 출력
    jpaProperties.put("hibernate.physical_naming_strategy",
            "org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy");

    emf.setJpaProperties(jpaProperties);

    return emf;
  }

  @Bean
  public PlatformTransactionManager jpaTransactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
    JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
    jpaTransactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
    return jpaTransactionManager;
  }

  // MyBatis 설정
  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);
    sessionFactory.setTypeAliasesPackage("com.kb.wallet.member.domain");  // MyBatis 모델 패키지 설정
    sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/**/*.xml"));  // MyBatis 매퍼 설정

    org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
    configuration.setAutoMappingBehavior(org.apache.ibatis.session.AutoMappingBehavior.PARTIAL); // Set AUTO_MAPPING_BEHAVIOR to PARTIAL
    configuration.setMapUnderscoreToCamelCase(true);
    sessionFactory.setConfiguration(configuration);

    return sessionFactory.getObject();
  }

  @Bean
  public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
    return new SqlSessionTemplate(sqlSessionFactory);
  }

  // MyBatis 트랜잭션 매니저
  @Bean
  public PlatformTransactionManager myBatisTransactionManager(DataSource dataSource) {
    return new DataSourceTransactionManager(dataSource);
  }

  // 두 트랜잭션 매니저를 ChainedTransactionManager로 묶음
  @Bean
  public PlatformTransactionManager transactionManager(
          @Qualifier("jpaTransactionManager") PlatformTransactionManager jpaTransactionManager,
          @Qualifier("myBatisTransactionManager") PlatformTransactionManager myBatisTransactionManager) {
    return new ChainedTransactionManager(jpaTransactionManager, myBatisTransactionManager);
  }

}


