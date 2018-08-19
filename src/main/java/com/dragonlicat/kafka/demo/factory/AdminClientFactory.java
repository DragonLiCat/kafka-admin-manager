/** 
 * Project Name:kafka-demo 
 * File Name:AdminClientFactory.java 
 * Package Name:com.dragonlicat.kafka.demo.factory
 * Date:2018年8月19日下午1:38:23 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
package com.dragonlicat.kafka.demo.factory;

import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.config.SslConfigs;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/** 
 * ClassName:AdminClientFactory <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月19日 下午1:38:23 <br/> 
 * @author   shichengshan 
 * @version   
 * @since    JDK 1.8
 * @see       
 */
@Configuration
public class AdminClientFactory {

  @Value("${bootstrap.servers}")
  private String bootstrapServers;

  @Value("${security.protocol}")
  private String securityProtocol;

  @Value("${ssl.keystore.location}")
  private String sslKeystoreLocation;

  @Value("${ssl.keystore.password}")
  private String sslKeystorePassword;

  @Value("${ssl.key.password}")
  private String sslKeyPassword;

  @Value("${ssl.truststore.location}")
  private String sslTruststoreLocation;

  @Value("${ssl.truststore.password}")
  private String sslTruststorePassword;



  @Bean
  public Map<String, Object> adminClientConfigs() {
    Map<String, Object> props = new HashMap<>();
    props.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    props.put(AdminClientConfig.SECURITY_PROTOCOL_CONFIG, securityProtocol);
    props.put(SslConfigs.SSL_KEYSTORE_LOCATION_CONFIG, sslKeystoreLocation);
    props.put(SslConfigs.SSL_KEYSTORE_PASSWORD_CONFIG, sslKeystorePassword);
    props.put(SslConfigs.SSL_KEY_PASSWORD_CONFIG, sslKeyPassword);
    props.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, sslTruststoreLocation);
    props.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, sslTruststorePassword);
    props.put(SslConfigs.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_CONFIG, "");
    return props;
  }

  @Bean
  public AdminClient createAdminClient() {
    AdminClient adminClient = AdminClient.create(adminClientConfigs());
    return adminClient;
  }

}
