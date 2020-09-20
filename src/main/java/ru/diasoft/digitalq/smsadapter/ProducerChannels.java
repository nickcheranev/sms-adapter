package ru.diasoft.digitalq.smsadapter;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

import static ru.diasoft.digitalq.smsadapter.ChannelConstants.SMS_VERIFICATION_DELIVERED;

public interface ProducerChannels {

    @Output(SMS_VERIFICATION_DELIVERED)
    MessageChannel smsVerificationDelivered();
}
