package th.co.ais.ipfm.domain1;
// Generated 27 �.�. 2553, 17:13:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import th.co.ais.ipfm.domain.MasterDomain;

/**
 * IpUser generated by hbm2java
 */
@Entity
@Table(name="IP_USER"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpUser  extends MasterDomain implements java.io.Serializable , Cloneable {


     /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	 private String userId;
     private Integer version;
     private String userName;
     private String section;
     private String dept;
     private String email;
     private String position;
     private String mobile;
     private String tel;
     private String teamId;
     private String teamName;
     private String managerId;
     private String roleIdList;
     private String delegateStatus;
     private Date effectiveDate;
     private Date expireDate;
     private Date lastLogin;
     private String userActiveStatus;
     private String rowId;
     private String sessionId;
     private String url;
     
     
     
     private String managerName;
    public IpUser() {
    }
    
    public IpUser(String userId) {
        this.userId = userId;
    }

    @Column(name="USER_ID", unique=true, nullable=false, length=20)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    @Version
	@Column(name="VERSION")
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
    
    @Column(name="USER_NAME", length=50)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    @Column(name="SECTION", length=1000)
    public String getSection() {
        return this.section;
    }
    
    public void setSection(String section) {
        this.section = section;
    }
    
    @Column(name="DEPT", length=1000)
    public String getDept() {
        return this.dept;
    }
    
    public void setDept(String dept) {
        this.dept = dept;
    }
    
    @Column(name="EMAIL", length=100)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="POSITION", length=1000)
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    @Column(name="MOBILE", length=100)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
    @Column(name="TEL", length=100)
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    @Column(name="MANAGER_ID")
    public String getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
    
    @Column(name="ROLE_ID_LIST", length=1000)
    public String getRoleIdList() {
        return this.roleIdList;
    }
    
    public void setRoleIdList(String roleIdList) {
        this.roleIdList = roleIdList;
    }
    
    @Column(name="DELEGATE_STATUS", length=1)
    public String getDelegateStatus() {
        return this.delegateStatus;
    }
    
    public void setDelegateStatus(String delegateStatus) {
        this.delegateStatus = delegateStatus;
    }
    
    @Column(name="TEAM_ID", length=20)
    public String getTeamId() {
        return this.teamId;
    }
    
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
    
    @Column(name="TEAM_NAME", length=20)
    public String getTeamName() {
        return this.teamName;
    }
    
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="EFFECTIVE_DATE", length=10)
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    @Temporal(TemporalType.DATE)
    @Column(name="EXPIRE_DATE", length=10)
    public Date getExpireDate() {
        return this.expireDate;
    }
    
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
	
	@Column(name="CREATE_BY")
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name="CREATE_DATE")
	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Column(name="UPDATE_BY")
	public String getLastUpdBy() {
		return lastUpdBy;
	}

	public void setLastUpdBy(String lastUpdBy) {
		this.lastUpdBy = lastUpdBy;
	}
	
	@Column(name="UPDATE_DATE")
	public Date getLastUpd() {
		return lastUpd;
	}
	
	public void setLastUpd(Date lastUpd) {
		this.lastUpd = lastUpd;
	}
	
	
	@Column(name="SESSION_ID")
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Id 
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="ROW_ID", unique=true, length=50)
    public String getRowId() {
        return this.rowId;
    }
    
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }
    
    @Column(name="LAST_LOGIN")
    public Date getLastLogin() {
        return this.lastLogin;
    }
    
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
    
    @Column(name="USER_ACTIVE_STATUS", length=1)
    public String getUserActiveStatus() {
        return this.userActiveStatus;
    }
    
    public void setUserActiveStatus(String userActiveStatus) {
        this.userActiveStatus = userActiveStatus;
    }
    @Transient
    public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	 @Transient
    public String getPhone() {
		if (getTel() != null && getTel().trim().length()>0) {
			return "("+getTel()+")";
		}
		if (getMobile() != null && getMobile().trim().length()>0) {
			return "("+getMobile()+")";
		}
		return "";
	}
	 @Transient
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
    public Object clone() throws CloneNotSupportedException
    {
		IpUser another = (IpUser) super.clone();
        return another;
    }

	
	
}

