package com.legaoyi.iov.protocol.downstream.messagebody;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.legaoyi.iov.protocol.message.MessageBody;

/*
 * 删除路线
 * 
 * @author <a href="mailto:shengbo.gao@gmail.com;78772895@qq.com">www.legaoyi.com</a>
 * 
 * @version 1.0.0
 * 
 * @since 2020-06-30
 */
@Scope("prototype")
@Component(MessageBody.MESSAGE_BODY_BEAN_PREFIX + "8607" + MessageBody.MESSAGE_BODY_BEAN_SUFFIX)
public class Jt808_8607_MessageBody extends Jt808_8601_MessageBody {

    private static final long serialVersionUID = -595210563953424446L;

    public static final String MESSAGE_ID = "8607";

}
