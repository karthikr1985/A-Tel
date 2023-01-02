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
 * IpUrAccessListTnp generated by hbm2java
 */
@Entity
@Table(name="IP_UR_ACCESS_LIST_TNP"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpUrAccessListTnp extends MasterDomain   implements java.io.Serializable, Cloneable {


     private IpUrAccessListTnpId id;
     private Long version;
     private String sourceIp;
     private String sourceHostName;
     private String sourceInterNode;
     private String sourceInterNw;
     private String sourceLocationName;
     private String destIp;
     private String destHostName;
     private String destInterNode;
     private String destInterNw;
     private String destLocationName;
     private String sysOwnerRemark;
     private String isImpact;
     private String pmRemark;
     private String teamRemark;
     private String rowId;
     
     private String sourceNetworkIp; 
     private String destNetworkIp; 
     private String description; 
     private String reqImpact; 
     private String isAssign; 
     private String actmRemark; 
     
     private IpUrStatus subUrStatus;
     private String urType;
     private String subUrStatusTxt;
     
 	private String changeType;
     
 	
	private String isApprove;
	private boolean isSelected;
	private String isReject;
	private String isTnp;
     
	
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
    public IpUrAccessListTnp() {
    }

	
    public IpUrAccessListTnp(IpUrAccessListTnpId id) {
        this.id = id;
    }
    public IpUrAccessListTnp(IpUrAccessListTnpId id, String reqType, String sourceIp, String sourceHostName, String sourceInterNode, String sourceInterNw, String sourceLocationId, String sourceLocationName, String sourceNetwork, String destIp, String destHostName, String destInterNode, String destInterNw, String destLocationId, String destLocationName, String destNetwork, String sysOwnerRemark, String isImpact, String pmRemark, String createBy, Date createDate, String updateBy, Date updateDate, String rowId) {
       this.id = id;
       this.sourceIp = sourceIp;
       this.sourceHostName = sourceHostName;
       this.sourceInterNode = sourceInterNode;
       this.sourceInterNw = sourceInterNw;
       this.sourceLocationName = sourceLocationName;
       this.destIp = destIp;
       this.destHostName = destHostName;
       this.destInterNode = destInterNode;
       this.destInterNw = destInterNw;
       this.destLocationName = destLocationName;
       this.sysOwnerRemark = sysOwnerRemark;
       this.isImpact = isImpact;
       this.pmRemark = pmRemark;

       this.rowId = rowId;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="urNo", column=@Column(name="UR_NO", nullable=false, length=30) ), 
        @AttributeOverride(name="subUrNo", column=@Column(name="SUB_UR_NO", nullable=false, length=10) ) } )
    public IpUrAccessListTnpId getId() {
        return this.id;
    }
    
    public void setId(IpUrAccessListTnpId id) {
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
    
    @Column(name="SOURCE_INTER_NODE", length=100)
    public String getSourceInterNode() {
        return this.sourceInterNode;
    }
    
    public void setSourceInterNode(String sourceInterNode) {
        this.sourceInterNode = sourceInterNode;
    }
    
    @Column(name="SOURCE_INTER_NW", length=100)
    public String getSourceInterNw() {
        return this.sourceInterNw;
    }
    
    public void setSourceInterNw(String sourceInterNw) {
        this.sourceInterNw = sourceInterNw;
    }
    
    
    @Column(name="SOURCE_LOCATION_NAME", length=1000)
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }
    
    public void setSourceLocationName(String sourceLocationName) {
        this.sourceLocationName = sourceLocationName;
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
    
    @Column(name="DEST_INTER_NODE", length=100)
    public String getDestInterNode() {
        return this.destInterNode;
    }
    
    public void setDestInterNode(String destInterNode) {
        this.destInterNode = destInterNode;
    }
    
    @Column(name="DEST_INTER_NW", length=100)
    public String getDestInterNw() {
        return this.destInterNw;
    }
    
    public void setDestInterNw(String destInterNw) {
        this.destInterNw = destInterNw;
    }
    
    
    @Column(name="DEST_LOCATION_NAME", length=1000)
    public String getDestLocationName() {
        return this.destLocationName;
    }
    
    public void setDestLocationName(String destLocationName) {
        this.destLocationName = destLocationName;
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
    
    @Column(name="PM_REMARK", length=1000)
    public String getPmRemark() {
        return this.pmRemark;
    }
    
    public void setPmRemark(String pmRemark) {
        this.pmRemark = pmRemark;
    }
    
    @Column(name="TEAM_REMARK", length=1000)
    public String getTeamRemark() {
		return teamRemark;
	}

	public void setTeamRemark(String teamRemark) {
		this.teamRemark = teamRemark;
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

//==============================================================================    
    

	@Column(name="SOURCE_NETWORK_IP", unique=true, length=50)
	public String getSourceNetworkIp() {
		return sourceNetworkIp;
	}


	public void setSourceNetworkIp(String sourceNetworkIp) {
		this.sourceNetworkIp = sourceNetworkIp;
	}

	@Column(name="DEST_NETWORK_IP", unique=true, length=50)
	public String getDestNetworkIp() {
		return destNetworkIp;
	}


	public void setDestNetworkIp(String destNetworkIp) {
		this.destNetworkIp = destNetworkIp;
	}

	@Column(name="DESCRIPTION", unique=true, length=1000)
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name="REQ_IMPACT", unique=true, length=50)
	public String getReqImpact() {
		return reqImpact;
	}


	public void setReqImpact(String reqImpact) {
		this.reqImpact = reqImpact;
	}

	@Column(name="IS_ASSIGN", unique=true, length=50)
	public String getIsAssign() {
		return isAssign;
	}


	public void setIsAssign(String isAssign) {
		this.isAssign = isAssign;
	}

	@Column(name="ACTM_REMARK", unique=true, length=1000)
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
    	IpUrAccessListTnp another = (IpUrAccessListTnp) super.clone();
        //? take care of any deep copies to be made here
        return another;
    }


}

