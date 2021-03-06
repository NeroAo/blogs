package neroao.blogs.modle.po;

import java.util.Date;

public class BlogsArticlePO {
	private int id;
	private String title;
	private String digest;
	private int isDefaultDig;
	private String content;
	private Date createTime;
	private Date lastUpdateTime;
	private int likeNum;
	private int readTimes;
	private int isDel;
	
	public BlogsArticlePO(){
		
	}

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public int getIsDefaultDig() {
		return isDefaultDig;
	}

	public void setIsDefaultDig(int isDefaultDig) {
		this.isDefaultDig = isDefaultDig;
	}
	
	

}
