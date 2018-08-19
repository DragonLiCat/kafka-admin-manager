/** 
 * Project Name:kafka-demo 
 * File Name:AdminKafkaClientServImpl.java 
 * Package Name:com.dragonlicat.kafka.demo.service.impl
 * Date:2018年8月19日下午1:38:23 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/
package com.dragonlicat.kafka.demo.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.ConsumerGroupListing;
import org.apache.kafka.clients.admin.ListConsumerGroupsResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dragonlicat.kafka.demo.service.AdminKafkaClientServ;

/** 
 * ClassName:AdminKafkaClientServImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月19日 下午1:38:23 <br/> 
 * @author   DANAODAI 
 * @version  
 * @since    JDK 1.8
 * @see       
 */
@Service
public class AdminKafkaClientServImpl  implements AdminKafkaClientServ {
  
  Logger logger = LoggerFactory.getLogger(AdminKafkaClientServ.class);


  @Autowired
  private AdminClient adminClient;

  @Override
  public List<String> listConsumer() {
    // TODO Auto-generated method stub
    List<String> list= new ArrayList<>();
    ListConsumerGroupsResult listConsumerGroupsResult=adminClient.listConsumerGroups();
    try {
      
      logger.info("grouplist:{}",listConsumerGroupsResult.all().get().stream().collect(Collectors.toList()));
      
      for(ConsumerGroupListing consumerGroupListing:listConsumerGroupsResult.all().get().stream().collect(Collectors.toList())) {
        list.add(consumerGroupListing.groupId().toString());
      }
    } catch (InterruptedException | ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      
    }
    return list;
  }
  
  
  @Override
  public void descConsumner() {
    // TODO Auto-generated method stub
    
    adminClient.listConsumerGroups();
  }






  

 

}
