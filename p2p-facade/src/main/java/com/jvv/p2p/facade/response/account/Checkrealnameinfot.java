package com.jvv.p2p.facade.response.account;

import org.xmappr.Element;
import org.xmappr.RootElement;

import com.jvv.p2p.facade.response.Result;

@RootElement
public class Checkrealnameinfot {

	@Element("id")
	private Integer id;
	@Element("user_id")
	private Integer userId;
	@Element("realname")
	private String realname;
	@Element("cert_no")
	private String certNo;
	@Element("card_type")
	private Integer cardType;

	@Element("cert_outtime")
	private String certOuttime;
	@Element("cert_photo_front")
	private Integer certPhotoFront;
	@Element("cert_photo_back")
	private Integer certPhotoBack;
	@Element("check_user")
	private Integer checkUser;
	@Element("check_time")
	private String checkTime;

	@Element("check_remark")
	private String checkRemark;
	@Element("remark")
	private String remark;
	@Element("create_userid")
	private Integer createUserid;
	@Element("create_time")
	private String createTime;
	@Element("update_time")
	private String updateTime;

	@Element("status")
	private Integer status;
	@Element("isvalid")
	private Integer isvalid;
	@Element("idcardfrontpath")
	private String idcardfrontpath;
	@Element("idcardbackpath")
	private String idcardbackpath;
	@Element("check_username")
	private String checkUsername;

	transient private Result result;

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public String getCertOuttime() {
		return certOuttime;
	}

	public void setCertOuttime(String certOuttime) {
		this.certOuttime = certOuttime;
	}

	public Integer getCertPhotoFront() {
		return certPhotoFront;
	}

	public void setCertPhotoFront(Integer certPhotoFront) {
		this.certPhotoFront = certPhotoFront;
	}

	public Integer getCertPhotoBack() {
		return certPhotoBack;
	}

	public void setCertPhotoBack(Integer certPhotoBack) {
		this.certPhotoBack = certPhotoBack;
	}

	public Integer getCheckUser() {
		return checkUser;
	}

	public void setCheckUser(Integer checkUser) {
		this.checkUser = checkUser;
	}

	public String getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckRemark() {
		return checkRemark;
	}

	public void setCheckRemark(String checkRemark) {
		this.checkRemark = checkRemark;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCreateUserid() {
		return createUserid;
	}

	public void setCreateUserid(Integer createUserid) {
		this.createUserid = createUserid;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getIsvalid() {
		return isvalid;
	}

	public void setIsvalid(Integer isvalid) {
		this.isvalid = isvalid;
	}

	public String getIdcardfrontpath() {
		return idcardfrontpath;
	}

	public void setIdcardfrontpath(String idcardfrontpath) {
		this.idcardfrontpath = idcardfrontpath;
	}

	public String getIdcardbackpath() {
		return idcardbackpath;
	}

	public void setIdcardbackpath(String idcardbackpath) {
		this.idcardbackpath = idcardbackpath;
	}

	public String getCheckUsername() {
		return checkUsername;
	}

	public void setCheckUsername(String checkUsername) {
		this.checkUsername = checkUsername;
	}

}
