package org.tview.visualization.model.zk;

/** zookeeper 的 Stat, 具体对象查看 <b>org.apache.zookeeper.data.Stat</b> */
public class ZkStat {
  private long czxid;
  private long mzxid;
  private long ctime;
  private long mtime;
  private int version;
  private int cversion;
  private int aversion;
  private long ephemeralOwner;
  private int dataLength;
  private int numChildren;
  private long pzxid;

  public ZkStat(
      long czxid,
      long mzxid,
      long ctime,
      long mtime,
      int version,
      int cversion,
      int aversion,
      long ephemeralOwner,
      int dataLength,
      int numChildren,
      long pzxid) {
    this.czxid = czxid;
    this.mzxid = mzxid;
    this.ctime = ctime;
    this.mtime = mtime;
    this.version = version;
    this.cversion = cversion;
    this.aversion = aversion;
    this.ephemeralOwner = ephemeralOwner;
    this.dataLength = dataLength;
    this.numChildren = numChildren;
    this.pzxid = pzxid;
  }

  public ZkStat() {}

  public long getCzxid() {
    return czxid;
  }

  public void setCzxid(long czxid) {
    this.czxid = czxid;
  }

  public long getMzxid() {
    return mzxid;
  }

  public void setMzxid(long mzxid) {
    this.mzxid = mzxid;
  }

  public long getCtime() {
    return ctime;
  }

  public void setCtime(long ctime) {
    this.ctime = ctime;
  }

  public long getMtime() {
    return mtime;
  }

  public void setMtime(long mtime) {
    this.mtime = mtime;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public int getCversion() {
    return cversion;
  }

  public void setCversion(int cversion) {
    this.cversion = cversion;
  }

  public int getAversion() {
    return aversion;
  }

  public void setAversion(int aversion) {
    this.aversion = aversion;
  }

  public long getEphemeralOwner() {
    return ephemeralOwner;
  }

  public void setEphemeralOwner(long ephemeralOwner) {
    this.ephemeralOwner = ephemeralOwner;
  }

  public int getDataLength() {
    return dataLength;
  }

  public void setDataLength(int dataLength) {
    this.dataLength = dataLength;
  }

  public int getNumChildren() {
    return numChildren;
  }

  public void setNumChildren(int numChildren) {
    this.numChildren = numChildren;
  }

  public long getPzxid() {
    return pzxid;
  }

  public void setPzxid(long pzxid) {
    this.pzxid = pzxid;
  }
}
