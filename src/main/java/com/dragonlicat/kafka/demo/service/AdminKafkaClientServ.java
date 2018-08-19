/** 
 * Project Name:kafka-demo 
 * File Name:AdminKafkaClientServ.java 
 * Package Name:com.dragonlicat.kafka.demo.service
 * Date:2018年8月19日下午1:38:23 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/
package com.dragonlicat.kafka.demo.service;

import java.util.List;
import org.apache.kafka.clients.admin.ConsumerGroupListing;
import org.springframework.stereotype.Service;

/** 
 * ClassName:AdminKafkaClientServ <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月19日 下午1:38:23 <br/> 
 * @author   shichengshan 
 * @version   
 * @since    JDK 1.8
 * @see       
 */
@Service
public interface AdminKafkaClientServ {
  
  
  /**
   * 
   * listConsumer:(这里用一句话描述这个方法的作用). <br/> 
   * TODO(这里描述这个方法适用条件 – 可选).<br/> 
   * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
   * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
   * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
   * 
   * @author shichengshan
   * @return 
   * @since JDK 1.8
   */
  public List<String> listConsumer();

  /**
   * 
   * descConsumner:(这里用一句话描述这个方法的作用). <br/> 
   * TODO(这里描述这个方法适用条件 – 可选).<br/> 
   * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
   * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
   * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
   * 
   * @author shichengshan 
   * @since JDK 1.8
   */
  public  void  descConsumner();



}
