package com.spark.example

import java.util

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}


object sparkKafkaProducer {
  def main(args: Array[String]): Unit = {
    val jsonRec = args(0)
    wrtiteToKafkaProducer(jsonRec)
  }

  def wrtiteToKafkaProducer(json: String) = {
    val kafkaTopic = "topic1" // command separated list of topics
    val kafkaBrokers = "**.***.**.***:9092"

    val props = new util.HashMap[String, Object]()
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaBrokers)
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
      "org.apache.kafka.common.serialization.StringSerializer")
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
      "org.apache.kafka.common.serialization.StringSerializer")
    props.put("producer.partitioner.class",
      "org.apache.kafka.clients.producer.internals.DefaultPartitioner")

    val producer = new KafkaProducer[String, String](props)

    val message = new ProducerRecord[String, String](kafkaTopic, "key", json)

    println(" sending message to kafka " + json)
    producer.send(message)

    producer.close();
  }
}
