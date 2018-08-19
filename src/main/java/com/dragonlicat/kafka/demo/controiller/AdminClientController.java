/** 
 * Project Name:kafka-demo 
 * File Name:AdminClientController.java 
 * Package Name:com.dragonlicat.kafka.demo.controiller 
 * Date:2018年8月19日下午1:52:37 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
  
package com.dragonlicat.kafka.demo.controiller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;
import com.dragonlicat.kafka.demo.service.AdminKafkaClientServ;
import com.dragonlicat.kafka.demo.utils.ViewTools;

/** 
 * ClassName:AdminClientController <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月19日 下午1:52:37 <br/> 
 * @author   DANAODAI 
 * @version   
 * @since    JDK 1.8
 * @see       
 */
@RestController
public class AdminClientController {
  
  @Autowired
  private AdminKafkaClientServ adminKafkaClientServ;
  
  @GetMapping("/v1/consumers")
  public JSONObject listConsumer() {
    
    return ViewTools.convertJson(adminKafkaClientServ.listConsumer());
    
  }

}
  