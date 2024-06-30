package com.ganeshgc.sprinbootconsumer;

import com.ganeshgc.sprinbootconsumer.Entity.WikimediaEntityData;
import com.ganeshgc.sprinbootconsumer.repository.WikimediaDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDatabase {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerDatabase.class);
    private WikimediaDataRepository wikimediaDataRepository;

    public KafkaConsumerDatabase(WikimediaDataRepository wikimediaDataRepository) {
        this.wikimediaDataRepository = wikimediaDataRepository;
    }

    @KafkaListener(topics="real-kafka-topic", groupId="myGroup")
    public void consume(String evenMessage) {
        logger.info(String.format("Event Message Received ->  %s", evenMessage));
        WikimediaEntityData wikimediaEntityData=new WikimediaEntityData();
        wikimediaEntityData.setWikimediadata(evenMessage);
        wikimediaDataRepository.save(wikimediaEntityData);

    }
}
