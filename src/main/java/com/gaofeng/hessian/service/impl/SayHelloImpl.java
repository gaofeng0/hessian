/**
 * SayHelloImpl.java
 * com.gaofeng.hessian.service.impl
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
 * com.gaofeng.hessian.service.impl
 * SayHelloImpl.java
 * 
 * 2017年6月8日-下午6:31:00
 *  2017XX公司-版权所有
 * 
 */

package com.gaofeng.hessian.service.impl;

import com.gaofeng.hessian.service.SayHello;

/**
 * ClassName:SayHelloImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   gaofeng
 * @version  
 * @since    Ver 1.1
 * @Date	 2017年6月8日		下午6:31:00
 *
 * @see 	 
 * @deprecated 
 */
/**
 * 
 * SayHelloImpl
 * 
 * gaofeng 2017年6月8日 下午6:31:00
 * 
 * @version 1.0.0
 * 
 */
public class SayHelloImpl implements SayHello
{

    public String sayHello(String name)
    {
        System.out.println("服务端方法被调用！");
        return "Hello," + name + "!";
    }
}
