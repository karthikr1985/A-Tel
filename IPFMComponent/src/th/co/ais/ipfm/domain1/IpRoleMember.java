package th.co.ais.ipfm.domain1;
// Generated 27 �.�. 2553, 17:13:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import th.co.ais.ipfm.domain.MasterDomain;

/**
 * IpRoleMember generated by hbm2java
 */
@Entity
@Table(name="IP_ROLE_MEMBER"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpRoleMember extends MasterDomain implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private IpRoleMemberId id;
     private String roleId;
     private String userId;
     private IpUser ipUser;

     private Integer version;
     private String rowId;
     
     private String userName;
     private String position;
     private String dept;
     private IpRole ipRole;


    public IpRoleMember() {
    }
    
//    public IpRoleMember(IpRoleMemberId id) {
//        this.id = id;
//    }
//    public IpRoleMember(IpRoleMemberId id, String createBy, Date createDate, String updateBy, Date updateDate, String rowId) {
//       this.id = id;
//       this.createBy = createBy;
//       this.createDate = createDate;
//       this.updateBy = updateBy;
//       this.updateDate = updateDate;
//       this.rowId = rowId;
//    }
   
//    @EmbeddedId    
//    @AttributeOverrides( {
//        @AttributeOverride(name="roleId", column=@Column(name="ROLE_ID", nullable=false, length=20) ), 
//        @AttributeOverride(name="userId", column=@Column(name="USER_ID", nullable=false, length=20) ) } )
//    public IpRoleMemberId getId() {
//        return this.id;
//    }
//    
//    public void setId(IpRoleMemberId id) {
//        this.id = id;
//    }
    
    @Column(name="ROLE_ID", nullable=false, length=20)
    public String getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Column(name="USER_ID", nullable=false, length=20)
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Version
    @Column(name="VERSION", precision=10, scale=0)
    public Integer getVersion() {
        return this.version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
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

	@Transient
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Transient
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	@Transient
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="USER_ID" , referencedColumnName="USER_ID", nullable=true, insertable=false, updatable=false)
	public IpUser getIpUser() {
		return ipUser;
	}

	public void setIpUser(IpUser ipUser) {
		this.ipUser = ipUser;
	}
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="ROLE_ID" , referencedColumnName="ROLE_ID", nullable=true, insertable=false, updatable=false)
	public IpRole getIpRole() {
		return ipRole;
	}

	public void setIpRole(IpRole ipRole) {
		this.ipRole = ipRole;
	}

    
}


