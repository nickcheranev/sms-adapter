package ru.diasoft.digitalq.smsadapter;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;
import ru.diasoft.digitalq.smsadapter.dto.SmsDeliveredMessage;
import ru.diasoft.digitalq.smsadapter.dto.SmsVerificationMessage;

import static ru.diasoft.digitalq.smsadapter.ChannelConstants.SMS_VERIFICATION_CREATED;

/**
 * @author Cheranev N.
 * created on 06.09.2020.
 */
@RequiredArgsConstructor
@Configuration
public class SmsVerificationMessageListener {

    private final SmsAdapterMessagingGateway gateway;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @StreamListener(SMS_VERIFICATION_CREATED)
    public void smsVerificationCreated(SmsVerificationMessage message) {
        logger.info("sms verification created: {}", message);
        gateway.smsVerificationDelivered(
                SmsDeliveredMessage.builder().guid(message.getGuid()).build());
    }
}
