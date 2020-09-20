package ru.diasoft.digitalq.smsadapter;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import ru.diasoft.digitalq.smsadapter.dto.SmsDeliveredMessage;

import static ru.diasoft.digitalq.smsadapter.ChannelConstants.SMS_VERIFICATION_DELIVERED;

/**
 * @author Cheranev N.
 * created on 06.09.2020.
 */
@MessagingGateway
public interface SmsAdapterMessagingGateway {

    @Gateway(requestChannel = SMS_VERIFICATION_DELIVERED)
    void smsVerificationDelivered(SmsDeliveredMessage message);
}
