package neroao.blogs.modle.vo;

import java.util.Date;

public class BlogsArticleBriefVO {
	
	private int id;
	private String title;
	private String digest;
	private Date createTime;
	private Date lastUpdateTime;
	private int likeNum;
	private int readTimes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public int getLikeNum() {
		return likeNum;
	}
	public void setLikeNum(int likeNum) {
		this.likeNum = likeNum;
	}
	public int getReadTimes() {
		return readTimes;
	}
	public void setReadTimes(int readTimes) {
		this.readTimes = readTimes;
	}
	
	
}
