package com.entity.base;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "base", schema = "")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BaseEntity  implements java.io.Serializable{
	/**实体主键，递增**/
	private Integer id;
	
	/**状态标示**/
    private Integer status;
	
    /**创建时间**/
    private Date createTime;
    
    /**修改时间**/
    private Date updateTime;
    
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "id", nullable = false,length = 36)
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="status")
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createDate" ,length =7)
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateDate" ,length =7)
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}  
}
