package ru.diasoft.digitalq.smsadapter;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

import static ru.diasoft.digitalq.smsadapter.ChannelConstants.SMS_VERIFICATION_CREATED;

/**
 * @author Cheranev N.
 * created on 06.09.2020.
 */
public interface ConsumerChannels {

    @Input(SMS_VERIFICATION_CREATED)
    SubscribableChannel smsVerificationCreated();
}
