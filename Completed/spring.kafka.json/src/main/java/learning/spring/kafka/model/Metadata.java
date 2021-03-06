package learning.spring.kafka.model;

public class Metadata {

  private String topicName;
  private int partition;
  private long offset;

  public Metadata(String topicName, int partition, long offset) {
    this.topicName = topicName;
    this.partition = partition;
    this.offset = offset;
  }

  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public int getPartition() {
    return partition;
  }

  public void setPartition(int partition) {
    this.partition = partition;
  }

  public long getOffset() {
    return offset;
  }

  public void setOffset(long offset) {
    this.offset = offset;
  }
}
