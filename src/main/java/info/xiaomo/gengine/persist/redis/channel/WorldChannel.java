package info.xiaomo.gengine.persist.redis.channel;

/**
 * 捕鱼达人世界服监听通道
 *
 * <p>2017年7月10日 下午2:40:49
 */
public enum WorldChannel {
  /** 报名参加竞技赛 */
  ApplyAthleticsReq;

  public static String[] getChannels() {
    WorldChannel[] values = WorldChannel.values();
    String[] channels = new String[values.length];
    for (int i = 0; i < values.length; i++) {
      channels[i] = values[i].name();
    }
    return channels;
  }
}
