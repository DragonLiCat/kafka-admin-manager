/** 
 * Project Name:kafka-demo 
 * File Name:ViewTools.java 
 * Package Name:com.dragonlicat.kafka.demo.utils 
 * Date:2018年8月19日下午2:03:16 
 * Copyright (c) 2018, shchsh888@hotmail.com All Rights Reserved. 
 * 
*/  
  
package com.dragonlicat.kafka.demo.utils;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alibaba.fastjson.JSONObject;

/** 
 * ClassName:ViewTools <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年8月19日 下午2:03:16 <br/> 
 * @author   DANAODAI 
 * @version   
 * @since    JDK 1.8
 * @see       
 */
public class ViewTools {
  
  Logger logger = LoggerFactory.getLogger(ViewTools.class);
  
  /**
   * 
   * convertJson:(这里用一句话描述这个方法的作用). <br/> 
   * TODO(这里描述这个方法适用条件 – 可选).<br/> 
   * TODO(这里描述这个方法的执行流程 – 可选).<br/> 
   * TODO(这里描述这个方法的使用方法 – 可选).<br/> 
   * TODO(这里描述这个方法的注意事项 – 可选).<br/> 
   * 
   * @author DANAODAI
   * @param object
   * @return 
   * @since JDK 1.8
   */
  public static JSONObject convertJson(Object object) {
    JSONObject jsonObject = new JSONObject();
    if(object instanceof List) {
      jsonObject.put("list", object);
      return jsonObject;
    }
    return null;
    
  }

}
  