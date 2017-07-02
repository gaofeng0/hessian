/**
 * SpringClient.java
 * com.gaofeng.hessian.web
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2017年6月8日 		gaofeng
 *
 * Copyright (c) 2017, TNT All Rights Reserved.
*/
/**
 * 系统项目名称
 * com.gaofeng.hessian.web
 * SpringClient.java
 * 
 * 2017年6月8日-下午6:55:42
 *  2017XX公司-版权所有
 * 
 */

package com.gaofeng.hessian.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaofeng.hessian.service.SayHello;

/**
 * ClassName:SpringClient
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   gaofeng
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年6月8日		下午6:55:42
 *
 * @see 	 
 * @deprecated 
 */
/**
 * 
 * SpringClient
 * 
 * gaofeng 2017年6月8日 下午6:55:42
 * 
 * @version 1.0.0
 * 
 */
public class SpringClient
{
    public static void main(String[] args)
    {
        ApplicationContext contex = new ClassPathXmlApplicationContext(
                "config/hessian-client.xml");
        // 获得客户端的Hessian代理工厂bean
        SayHello i = (SayHello) contex.getBean("hessianClient");
        System.out.println(i.sayHello("masongchao"));
    }
}
