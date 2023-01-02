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
 * IpUrRouting generated by hbm2java
 */
@Entity
@Table(name="IP_UR_ROUTING"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpUrRouting extends MasterDomain implements java.io.Serializable , Cloneable {


    private IpUrRoutingId id;
    private String IpAddress; 
    private String Mask; 
    private String Interface; 
    private String NextHop; 
    private String ReqDesc;
  	private String isAssign;
  	private String isImpact;
  	private String sysOwnerRemark; 
  	private String pmRemark; 
  	private String teamRemark; 
  	private String actmRemark; 
    private IpUrStatus subUrStatus;
    private String subUrStatusTxt;
    private String urType; 
	private String isTnp;
    private String rowId;
	private String changeType;
	private Long version;
	
	private String isApprove;
	private String isReject;
	private boolean isSelected;
      
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
      
    
    @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
  	@Column(name="ROW_ID", unique=true, length=50)
  	public String getRowId() {
  		return rowId;
  	}

  	public void setRowId(String rowId) {
  		this.rowId = rowId;
  	}
  	
    @Version
    @Column(name="VERSION", precision=10, scale=0)
  	public Long getVersion() {
  		return version;
  	}

  	public void setVersion(Long version) {
  		this.version = version;
  	}

	@EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="urNo", column=@Column(name="UR_NO", nullable=false, length=20) ), 
        @AttributeOverride(name="subUrNo", column=@Column(name="SUB_UR_NO", nullable=false, length=10) ) } )
	public IpUrRoutingId getId() {
		return id;
	}

	public void setId(IpUrRoutingId id) {
		this.id = id;
	}
	@Column(name="IP_ADDRESS", length=50)
	public String getIpAddress() {
		return IpAddress;
	}

	public void setIpAddress(String ipAddress) {
		IpAddress = ipAddress;
	}
	
	@Column(name="MASK", length=50)
	public String getMask() {
		return Mask;
	}

	public void setMask(String mask) {
		Mask = mask;
	}
	
	@Column(name="INTERFACE", length=50)
	public String getInterface() {
		return Interface;
	}

	public void setInterface(String interface1) {
		Interface = interface1;
	}
	@Column(name="NEXT_HOP", length=50)
	public String getNextHop() {
		return NextHop;
	}

	public void setNextHop(String nextHop) {
		NextHop = nextHop;
	}
	@Column(name="REQ_DESC", length=50)
	public String getReqDesc() {
		return ReqDesc;
	}

	public void setReqDesc(String reqDesc) {
		ReqDesc = reqDesc;
	}
	@Column(name="IS_ASSIGN", length=10)
	public String getIsAssign() {
		return isAssign;
	}

	public void setIsAssign(String isAssign) {
		this.isAssign = isAssign;
	}
	@Column(name="IS_IMPACT", length=10)
	public String getIsImpact() {
		return isImpact;
	}

	public void setIsImpact(String isImpact) {
		this.isImpact = isImpact;
	}
	@Column(name="SYS_OWNER_REMARK", length=1000)
	public String getSysOwnerRemark() {
		return sysOwnerRemark;
	}

	public void setSysOwnerRemark(String sysOwnerRemark) {
		this.sysOwnerRemark = sysOwnerRemark;
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
		return pmRemark;
	}

	public void setPmRemark(String pmRemark) {
		this.pmRemark = pmRemark;
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
	
    @Override
    public Object clone() throws CloneNotSupportedException
    {
    	IpUrRouting another = (IpUrRouting) super.clone();
        //? take care of any deep copies to be made here
        return another;
    }

}

