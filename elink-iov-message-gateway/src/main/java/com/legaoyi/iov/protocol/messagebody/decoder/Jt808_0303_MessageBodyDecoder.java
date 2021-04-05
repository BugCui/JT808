package com.legaoyi.iov.protocol.messagebody.decoder;

import org.springframework.stereotype.Component;

import com.legaoyi.iov.protocol.exception.IllegalMessageException;
import com.legaoyi.iov.protocol.message.MessageBody;
import com.legaoyi.iov.protocol.message.decoder.MessageBodyDecoder;
import com.legaoyi.iov.protocol.upstream.messagebody.Jt808_0303_MessageBody;
import com.legaoyi.iov.protocol.util.ByteUtils;

/*
 * 
 * @author <a href="mailto:shengbo.gao@gmail.com;78772895@qq.com">www.legaoyi.com</a>
 * 
 * @version 1.0.0
 * 
 * @since 2020-06-30
 */
@Component(MessageBodyDecoder.MESSAGE_BODY_DECODER_BEAN_PREFIX + "0303" + MessageBodyDecoder.MESSAGE_BODY_DECODER_BEAN_SUFFIX)
public class Jt808_0303_MessageBodyDecoder implements MessageBodyDecoder {

    @Override
    public MessageBody decode(Object message) throws IllegalMessageException {
        Jt808_0303_MessageBody messageBody = new Jt808_0303_MessageBody();
        try {
            byte[] bytes = (byte[]) message;

            int offset = 0;
            messageBody.setType(ByteUtils.byte2int(bytes[offset++]));
            messageBody.setFlag(ByteUtils.byte2int(bytes[offset]));
            return messageBody;
        } catch (Exception e) {
            throw new IllegalMessageException(e);
        }
    }
}
