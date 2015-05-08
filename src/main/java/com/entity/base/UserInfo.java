package com.entity.base;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
@Entity
@Table(name = "user_info", schema = "")
public class UserInfo implements java.io.Serializable{
	private String id;
    private String userName;
    @Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		if (!StringUtils.isBlank(this.id)) {
			return this.id;
		}
		return "bm"+Long.toString(System.currentTimeMillis());
	}

	public void setId(String id) {
		this.id = id;
	}
	@Column(name = "user_name",length = 36)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

   
	
}
