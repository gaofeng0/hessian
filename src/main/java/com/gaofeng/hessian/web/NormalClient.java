/**
 * NormalClient.java
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
 * NormalClient.java
 * 
 * 2017年6月8日-下午6:32:08
 *  2017XX公司-版权所有
 * 
 */

package com.gaofeng.hessian.web;

import com.caucho.hessian.client.HessianProxyFactory;
import com.gaofeng.hessian.service.SayHello;

/**
 * ClassName:NormalClient
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   gaofeng
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年6月8日		下午6:32:08
 *
 * @see 	 
 * @deprecated 
 */
/**
 * 
 * NormalClient
 * 
 * gaofeng 2017年6月8日 下午6:32:08
 * 
 * @version 1.0.0
 * 
 */
public class NormalClient
{
    public static void main(String[] args) throws Exception
    {
        // Spring Hessian代理Servelet
        String url = "http://localhost:8080/hessian/sayHello";
        HessianProxyFactory factory = new HessianProxyFactory();
        SayHello api = (SayHello) factory.create(SayHello.class, url);

        System.out.println(api.sayHello("masongchao"));
    }
}
