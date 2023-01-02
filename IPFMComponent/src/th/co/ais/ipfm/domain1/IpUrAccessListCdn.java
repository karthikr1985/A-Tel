package th.co.ais.ipfm.domain1;
// Generated 27 �.�. 2553, 17:13:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import th.co.ais.ipfm.domain.MasterDomain;

/**
 * IpUrAccessListCdn generated by hbm2java
 */
@Entity
@Table(name="IP_UR_ACCESS_LIST_CDN"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpUrAccessListCdn extends MasterDomain    implements java.io.Serializable, Cloneable {


    private IpUrAccessListCdnId id;
    private Long version;
    private String sourceIp;
    private String sourceHostName;
    private String sourceEmail;
    private String destIp;
    private String destHostName;
    private String destEmail;
    private String sysOwnerRemark;
    private String isImpact;
    private String pmRemark;
    private String teamRemark;
    private String rowId;

    private String sourceIp1; 
    private String sourceIp2; 
    private String destIp1; 
    private String destIp2; 
    private String isAssign; 
    private String actmRemark; 
     
    private IpUrStatus subUrStatus;
    private String urType;
    private String subUrStatusTxt;
     
 	
	private String isApprove;
	private String isReject;
	private boolean isSelected;
	
	
	private String isTnp;
	private String changeType;
	
	
	private boolean impactSelected;
	
//	@Transient
//	public boolean isImpactSelected() {
//		if (getIsImpact()==null || getIsImpact().equalsIgnoreCase("N"))
//			return false;
//		else
//			return true;
//	}
	@Transient
	public boolean isImpactSelected() {
		return impactSelected;
	}
    public void setImpactSelected(boolean impactSelected) {
		this.impactSelected = impactSelected;
	}

	public IpUrAccessListCdn() {
    }

	
    public IpUrAccessListCdn(IpUrAccessListCdnId id) {
        this.id = id;
    }
    public IpUrAccessListCdn(IpUrAccessListCdnId id, String reqType, String sourceIp, String sourceHostName, String sourceEmail, String destIp, String destHostName, String destEmail, String sysOwnerRemark, String isImpact, String pmRemark, String createBy, Date createDate, String updateBy, Date updateDate, String rowId) {
       this.id = id;
       this.sourceIp = sourceIp;
       this.sourceHostName = sourceHostName;
       this.sourceEmail = sourceEmail;
       this.destIp = destIp;
       this.destHostName = destHostName;
       this.destEmail = destEmail;
       this.sysOwnerRemark = sysOwnerRemark;
       this.isImpact = isImpact;
       this.pmRemark = pmRemark;
       this.rowId = rowId;
    }
   
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="urNo", column=@Column(name="UR_NO", nullable=false, length=30) ), 
        @AttributeOverride(name="subUrNo", column=@Column(name="SUB_UR_NO", nullable=false, length=10) ) } )
    public IpUrAccessListCdnId getId() {
        return this.id;
    }
    
    public void setId(IpUrAccessListCdnId id) {
        this.id = id;
    }
    @Version
    @Column(name="VERSION", precision=10, scale=0)
    public Long getVersion() {
        return this.version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }
    
    
    @Column(name="SOURCE_IP", length=21)
    public String getSourceIp() {
        return this.sourceIp;
    }
    
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }
    
    @Column(name="SOURCE_HOST_NAME", length=1000)
    public String getSourceHostName() {
        return this.sourceHostName;
    }
    
    public void setSourceHostName(String sourceHostName) {
        this.sourceHostName = sourceHostName;
    }
    
    @Column(name="SOURCE_EMAIL", length=100)
    public String getSourceEmail() {
        return this.sourceEmail;
    }
    
    public void setSourceEmail(String sourceEmail) {
        this.sourceEmail = sourceEmail;
    }
    
    @Column(name="DEST_IP", length=21)
    public String getDestIp() {
        return this.destIp;
    }
    
    public void setDestIp(String destIp) {
        this.destIp = destIp;
    }
    
    @Column(name="DEST_HOST_NAME", length=1000)
    public String getDestHostName() {
        return this.destHostName;
    }
    
    public void setDestHostName(String destHostName) {
        this.destHostName = destHostName;
    }
    
    @Column(name="DEST_EMAIL", length=100)
    public String getDestEmail() {
        return this.destEmail;
    }
    
    public void setDestEmail(String destEmail) {
        this.destEmail = destEmail;
    }
    
    @Column(name="SYS_OWNER_REMARK", length=1000)
    public String getSysOwnerRemark() {
        return this.sysOwnerRemark;
    }
    
    public void setSysOwnerRemark(String sysOwnerRemark) {
        this.sysOwnerRemark = sysOwnerRemark;
    }
    
    @Column(name="IS_IMPACT", length=1)
    public String getIsImpact() {
        return this.isImpact;
    }
    
    public void setIsImpact(String isImpact) {
        this.isImpact = isImpact;
    }
    @Column(name="TEAM_REMARK", length=1000)
    public String getTeamRemark() {
		return teamRemark;
	}

	public void setTeamRemark(String teamRemark) {
		this.teamRemark = teamRemark;
	}

	@Column(name="PM_REMARK", length=1000)
    public String getPmRemark() {
        return this.pmRemark;
    }
    
    public void setPmRemark(String pmRemark) {
        this.pmRemark = pmRemark;
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
	
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="ROW_ID", unique=true, length=50)
    public String getRowId() {
        return this.rowId;
    }
    
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    @Column(name="SOURCE_IP_1", length=50)
	public String getSourceIp1() {
		return sourceIp1;
	}


	public void setSourceIp1(String sourceIp1) {
		this.sourceIp1 = sourceIp1;
	}

	@Column(name="SOURCE_IP_2", length=50)
	public String getSourceIp2() {
		return sourceIp2;
	}


	public void setSourceIp2(String sourceIp2) {
		this.sourceIp2 = sourceIp2;
	}

	@Column(name="DEST_IP_1", length=50)
	public String getDestIp1() {
		return destIp1;
	}

	
	public void setDestIp1(String destIp1) {
		this.destIp1 = destIp1;
	}

	@Column(name="DEST_IP_2", length=50)
	public String getDestIp2() {
		return destIp2;
	}

	public void setDestIp2(String destIp2) {
		this.destIp2 = destIp2;
	}

	@Column(name="IS_ASSIGN", length=50)
	public String getIsAssign() {
		return isAssign;
	}

	
	public void setIsAssign(String isAssign) {
		this.isAssign = isAssign;
	}

	@Column(name="ACTM_REMARK", length=1000)
	public String getActmRemark() {
		return actmRemark;
	}

	
	public void setActmRemark(String actmRemark) {
		this.actmRemark = actmRemark;
	}

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumns( {
    	@JoinColumn(name = "SUB_UR_STATUS", referencedColumnName = "SUB_UR_STATUS_ID", nullable = true, insertable=false, updatable=false),
    	@JoinColumn(name = "UR_TYPE", referencedColumnName = "UR_TYPE" , nullable = true, insertable=false, updatable=false)
    })
	public IpUrStatus getSubUrStatus() {
		return subUrStatus;
	}
	
	public void setSubUrStatus(IpUrStatus subUrStatus) {
		this.subUrStatus = subUrStatus;
	}

	@Column(name="UR_TYPE", length=5)
	public String getUrType() {
		return urType;
	}


	public void setUrType(String urType) {
		this.urType = urType;
	}
	
	@Column(name="SUB_UR_STATUS", length=20)
    public String getSubUrStatusTxt() {
		return subUrStatusTxt;
	}


	public void setSubUrStatusTxt(String subUrStatusTxt) {
		this.subUrStatusTxt = subUrStatusTxt;
	}

	@Transient
	public String getIsApprove() {
		return isApprove;
	}


	public void setIsApprove(String isApprove) {
		this.isApprove = isApprove;
	}

	@Transient
	public String getIsReject() {
		return isReject;
	}

	
	public void setIsReject(String isReject) {
		this.isReject = isReject;
	}

	@Transient
	public boolean getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Column(name="CHANGE_TYPE", length=2)
	public String getChangeType() {
		return changeType;
	}


	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}


	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	@Column(name="IS_TNP", length=2)
	public String getIsTnp() {
		return isTnp;
	}


	public void setIsTnp(String isTnp) {
		this.isTnp = isTnp;
	}
	
    @Override
    public Object clone() throws CloneNotSupportedException
    {
    	IpUrAccessListCdn another = (IpUrAccessListCdn) super.clone();
        //? take care of any deep copies to be made here
        return another;
    }


}

