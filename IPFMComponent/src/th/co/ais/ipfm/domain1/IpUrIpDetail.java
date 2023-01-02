package th.co.ais.ipfm.domain1;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

import th.co.ais.ipfm.domain.MasterDomain;

/**
 * IpUrIpDetail generated by hbm2java
 */
@Entity
@Table(name="IP_UR_IP_DETAIL"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpUrIpDetail  extends MasterDomain implements java.io.Serializable,Cloneable {

     private String urNo;
     private Long version;
     private String urType;
     private String reqUserId; 
     private String reqName;
     private String reqSection;
     private String reqDept;
     private String reqEmail;
     private String reqPosition;
     private String reqMobile;
     private String reqTel;
     private String reqTeam;
     private IpTeam reqIpTeam;
     private String subject;
     private String t2TeamId;
     private String t2TeamName;
     private String projId;
     private String projName;
     private String projManagerId;
     private String projManagerName;
     private String sysOwnerId;
     private String sysOwnerName;
     private String sysOwnerTeamId;
     private String sysOwnerTeamName;
     private String contactPoint;
     private String nwSysDetail;
     private String networkTypeId;
     private String networkTypeName;
     private String reqType;
     private String zoneId;
     private String zoneName;
     private String ipRef;
     private String locationId;
     private String locationName;
     private Integer totalNode;
     private Integer classB;
     private Integer classC;
     private String systemPlane;
     private String userPlane;
     private String mrgRemark;
     private String t2Remark;
     private String t1Remark;
     private String rowId;
     private String urStatus;
     private String locationType;
     private String approveManagerId;
     private String approveManagerList;
     private Date reqDate;
     private String overSla;
     private String urStatusName;
     
     private String funcId;
     private String v_view;
     private Date reqDateTo;
     
     private String hostName;
     
     private String singleIpCriteria;
     private String ipCriteria;
     
     private String natIP;
     private String natIPTo;
     
     private String singleIpToCriteria;
     private String ipToCriteria;

    public IpUrIpDetail() {
    }
	
    public IpUrIpDetail(String urNo) {
        this.urNo = urNo;
    }
 
	public IpUrIpDetail(String urNo, Long version, String urType,
			String reqUserId, String reqName, String reqSection,
			String reqDept, String reqEmail, String reqPosition,
			String reqMobile, String reqTel, String reqTeam, String subject,
			String t2TeamId, String t2TeamName, String projId, String projName,
			String projManagerId, String projManagerName, String sysOwnerId,
			String sysOwnerName, String sysOwnerTeamId,
			String sysOwnerTeamName, String contactPoint, String nwSysDetail,
			String networkTypeId, String networkTypeName,
			String reqType, String zoneId, String zoneName, String ipRef,
			String locationId, String locationName, Integer totalNode,
			Integer classB, Integer classC, String systemPlane, String userPlane,
			String mrgRemark, String t2Remark, String t1Remark, String rowId,
			String urStatus, String locationType, String approveManagerId,
			String approveManagerList,String hostName) {
		super();
		this.urNo = urNo;
		this.version = version;
		this.urType = urType;
		this.reqUserId = reqUserId;
		this.reqName = reqName;
		this.reqSection = reqSection;
		this.reqDept = reqDept;
		this.reqEmail = reqEmail;
		this.reqPosition = reqPosition;
		this.reqMobile = reqMobile;
		this.reqTel = reqTel;
		this.reqTeam = reqTeam;
		this.subject = subject;
		this.t2TeamId = t2TeamId;
		this.t2TeamName = t2TeamName;
		this.projId = projId;
		this.projName = projName;
		this.projManagerId = projManagerId;
		this.projManagerName = projManagerName;
		this.sysOwnerId = sysOwnerId;
		this.sysOwnerName = sysOwnerName;
		this.sysOwnerTeamId = sysOwnerTeamId;
		this.sysOwnerTeamName = sysOwnerTeamName;
		this.contactPoint = contactPoint;
		this.nwSysDetail = nwSysDetail;
		this.networkTypeId = networkTypeId;
		this.networkTypeName = networkTypeName;
		this.reqType = reqType;
		this.zoneId = zoneId;
		this.zoneName = zoneName;
		this.ipRef = ipRef;
		this.locationId = locationId;
		this.locationName = locationName;
		this.totalNode = totalNode;
		this.classB = classB;
		this.classC = classC;
		this.systemPlane = systemPlane;
		this.userPlane = userPlane;
		this.mrgRemark = mrgRemark;
		this.t2Remark = t2Remark;
		this.t1Remark = t1Remark;
		this.rowId = rowId;
		this.urStatus = urStatus;
		this.locationType = locationType;
		this.approveManagerId = approveManagerId;
		this.approveManagerList = approveManagerList;
		this.hostName = hostName;
	}

	@Column(name="UR_NO", unique=true, nullable=false, length=30)
    public String getUrNo() {
        return this.urNo;
    }
    
    public void setUrNo(String urNo) {
        this.urNo = urNo;
    }
    @Version
    @Column(name="VERSION", precision=10, scale=0)
    public Long getVersion() {
        return this.version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }
    
    @Column(name="UR_TYPE", length=5)
    public String getUrType() {
        return this.urType;
    }
    
    public void setUrType(String urType) {
        this.urType = urType;
    }
    
    @Column(name="REQ_USER_ID", length=20)
    public String getReqUserId() {
        return this.reqUserId;
    }
    
    public void setReqUserId(String reqUserId) {
        this.reqUserId = reqUserId;
    }
    
    @Column(name="REQ_NAME", length=100)
    public String getReqName() {
        return this.reqName;
    }
    
    public void setReqName(String reqName) {
        this.reqName = reqName;
    }
    
    @Column(name="REQ_SECTION", length=100)
    public String getReqSection() {
        return this.reqSection;
    }
    
    public void setReqSection(String reqSection) {
        this.reqSection = reqSection;
    }
    
    @Column(name="REQ_DEPT", length=100)
    public String getReqDept() {
        return this.reqDept;
    }
    
    public void setReqDept(String reqDept) {
        this.reqDept = reqDept;
    }
    
    @Column(name="REQ_EMAIL", length=100)
    public String getReqEmail() {
        return this.reqEmail;
    }
    
    public void setReqEmail(String reqEmail) {
        this.reqEmail = reqEmail;
    }
    
    @Column(name="REQ_POSITION", length=100)
    public String getReqPosition() {
        return this.reqPosition;
    }
    
    public void setReqPosition(String reqPosition) {
        this.reqPosition = reqPosition;
    }
    
    @Column(name="REQ_MOBILE", length=100)
    public String getReqMobile() {
        return this.reqMobile;
    }
    
    public void setReqMobile(String reqMobile) {
        this.reqMobile = reqMobile;
    }
    
    @Column(name="REQ_TEL", length=100)
    public String getReqTel() {
        return this.reqTel;
    }
    
    public void setReqTel(String reqTel) {
        this.reqTel = reqTel;
    }
    
    @Column(name="REQ_TEAM", length=100)
    public String getReqTeam() {
        return this.reqTeam;
    }
    
    public void setReqTeam(String reqTeam) {
        this.reqTeam = reqTeam;
    }
    @Transient
    public String getSubjectDesc() {
		String str = getSubject()==null?"":getSubject();
		int j = 1;
		for (int i=80 ; i<str.trim().length() ; i=i+80) {
			if (str.length() > i) {
				str = str.substring(0,i) + "<br>" + str.substring(i);
				j++;
			}else{
				break;
			}
		}
		return str;
	}
    @Transient
	public String getSubjectDisp(){
		String str = getSubject()==null?"":getSubject();
		if (getSubject()!=null && str.trim().length()>0) 
			if(getSubject().trim().length()>40) str = getSubject().substring(0, 40)+"...";
			else str = getSubject();
		return str;
	}
    @Column(name="SUBJECT", length=1000)
    public String getSubject() {
        return this.subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Column(name="T2_TEAM_ID", length=10)
    public String getT2TeamId() {
        return this.t2TeamId;
    }
    
    public void setT2TeamId(String t2TeamId) {
        this.t2TeamId = t2TeamId;
    }
    
    @Column(name="T2_TEAM_NAME", length=1000)
    public String getT2TeamName() {
        return this.t2TeamName;
    }
    
    public void setT2TeamName(String t2TeamName) {
        this.t2TeamName = t2TeamName;
    }
    
    @Column(name="PROJ_ID", length=30)
    public String getProjId() {
        return this.projId;
    }
    
    public void setProjId(String projId) {
        this.projId = projId;
    }
    
    @Column(name="PROJ_NAME", length=1000)
    public String getProjName() {
        return this.projName;
    }
    
    public void setProjName(String projName) {
        this.projName = projName;
    }
    
    @Column(name="PROJ_MANAGER_ID", length=20)
    public String getProjManagerId() {
        return this.projManagerId;
    }
    
    public void setProjManagerId(String projManagerId) {
        this.projManagerId = projManagerId;
    }
    
    @Column(name="PROJ_MANAGER_NAME", length=1000)
    public String getProjManagerName() {
        return this.projManagerName;
    }
    
    public void setProjManagerName(String projManagerName) {
        this.projManagerName = projManagerName;
    }
    
    @Column(name="SYS_OWNER_ID", length=20)
    public String getSysOwnerId() {
        return this.sysOwnerId;
    }
    
    public void setSysOwnerId(String sysOwnerId) {
        this.sysOwnerId = sysOwnerId;
    }
    
    @Column(name="SYS_OWNER_NAME", length=1000)
    public String getSysOwnerName() {
        return this.sysOwnerName;
    }
    
    public void setSysOwnerName(String sysOwnerName) {
        this.sysOwnerName = sysOwnerName;
    }
    
    @Column(name="SYS_OWNER_TEAM_ID", length=10)
    public String getSysOwnerTeamId() {
        return this.sysOwnerTeamId;
    }
    
    public void setSysOwnerTeamId(String sysOwnerTeamId) {
        this.sysOwnerTeamId = sysOwnerTeamId;
    }
    
    @Column(name="SYS_OWNER_TEAM_NAME", length=1000)
    public String getSysOwnerTeamName() {
        return this.sysOwnerTeamName;
    }
    
    public void setSysOwnerTeamName(String sysOwnerTeamName) {
        this.sysOwnerTeamName = sysOwnerTeamName;
    }
    
    @Column(name="CONTACT_POINT", length=1000)
    public String getContactPoint() {
        return this.contactPoint;
    }
    
    public void setContactPoint(String contactPoint) {
        this.contactPoint = contactPoint;
    }
    
    @Column(name="NW_SYS_DETAIL", length=1000)
    public String getNwSysDetail() {
        return this.nwSysDetail;
    }
    
    public void setNwSysDetail(String nwSysDetail) {
        this.nwSysDetail = nwSysDetail;
    }
    
    @Column(name="NETWORK_TYPE_ID")
    public String getNetworkTypeId() {
        return this.networkTypeId;
    }
    
    public void setNetworkTypeId(String networkTypeId) {
        this.networkTypeId = networkTypeId;
    }
    
    @Column(name="NETWORK_TYPE_NAME", length=1000)
    public String getNetworkTypeName() {
        return this.networkTypeName;
    }
    
    public void setNetworkTypeName(String networkTypeName) {
        this.networkTypeName = networkTypeName;
    }
    
    @Column(name="REQ_TYPE", length=1)
    public String getReqType() {
        return this.reqType;
    }
    
    public void setReqType(String reqType) {
        this.reqType = reqType;
    }
    
    @Column(name="ZONE_ID")
    public String getZoneId() {
        return this.zoneId;
    }
    
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }
    
    @Column(name="ZONE_NAME", length=1000)
    public String getZoneName() {
        return this.zoneName;
    }
    
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    
    @Column(name="IP_REF", length=1000)
    public String getIpRef() {
        return this.ipRef;
    }
    
    public void setIpRef(String ipRef) {
        this.ipRef = ipRef;
    }
    
    @Column(name="LOCATION_ID")
    public String getLocationId() {
        return this.locationId;
    }
    
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    
    @Column(name="LOCATION_NAME", length=1000)
    public String getLocationName() {
        return this.locationName;
    }
    
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
    
    @Column(name="TOTAL_NODE")
    public Integer getTotalNode() {
        return this.totalNode;
    }
    
    public void setTotalNode(Integer totalNode) {
        this.totalNode = totalNode;
    }
    @Transient
    public String getTotalNodeStr(){
    	if (totalNode!=null && totalNode.intValue()>0) {
    		return String.valueOf(totalNode);
    	}
        return "";
    }
    
    public void setTotalNodeStr(String totalNodeStr) {
    	if (totalNodeStr!=null && totalNodeStr.trim().length()>0) {
    		try {
    			this.totalNode = Integer.parseInt(totalNodeStr);
    		}catch(Exception ex){
    			this.totalNode = null;
    		}
    	}else{
    		this.totalNode = 0;
    	}
    }
    
    @Column(name="CLASS_B")
    public Integer getClassB() {
        return this.classB;
    }
    
    public void setClassB(Integer classB) {
        this.classB = classB;
    }
    
    @Transient
    public String getClassBStr(){
    	if (classB!=null && classB.intValue()>0) {
    		return String.valueOf(classB);
    	}
        return "";
    }
    
    public void setClassBStr(String classBStr) {
    	if (classBStr!=null && classBStr.trim().length()>0) {
    		try {
    			this.classB = Integer.parseInt(classBStr);        		
    		}catch(Exception ex){
    			this.classB = null;
    		}
    	}else{
    		this.classB = 0;
    	}
    }
    
    @Column(name="CLASS_C")
    public Integer getClassC() {
        return this.classC;
    }
    
    public void setClassC(Integer classC) {
        this.classC = classC;
    }
    
    @Transient
    public String getClassCStr(){
    	if (classC!=null && classC.intValue()>0) {
    		return String.valueOf(classC);
    	}
        return "";
    }
    
    public void setClassCStr(String classCStr) {
    	if (classCStr!=null && classCStr.trim().length()>0) {
    		try {
    			this.classC = Integer.parseInt(classCStr);        		      		
    		}catch(Exception ex){
    			this.classC = null;
    		}
    	}else{
    		this.classC = 0;
    	}
    }
    
    @Column(name="SYSTEM_PLANE", length=1000)
    public String getSystemPlane() {
        return this.systemPlane;
    }
    
    public void setSystemPlane(String systemPlane) {
        this.systemPlane = systemPlane;
    }
    
    @Column(name="USER_PLANE")
    public String getUserPlane() {
        return this.userPlane;
    }
    
    public void setUserPlane(String userPlane) {
        this.userPlane = userPlane;
    }
    
    @Column(name="MRG_REMARK", length=1000)
    public String getMrgRemark() {
        return this.mrgRemark;
    }
    
    public void setMrgRemark(String mrgRemark) {
        this.mrgRemark = mrgRemark;
    }
    
    @Column(name="T2_REMARK", length=1000)
    public String getT2Remark() {
        return this.t2Remark;
    }
    
    public void setT2Remark(String t2Remark) {
        this.t2Remark = t2Remark;
    }
    
    @Column(name="T1_REMARK", length=1000)
    public String getT1Remark() {
        return this.t1Remark;
    }
    
    public void setT1Remark(String t1Remark) {
        this.t1Remark = t1Remark;
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
    
    @Column(name="UR_STATUS", length=100)
    public String getUrStatus() {
        return this.urStatus;
    }
    
    public void setUrStatus(String urStatus) {
        this.urStatus = urStatus;
    }
    
    @Column(name="LOCATION_TYPE", length=1)
    public String getLocationType() {
        return this.locationType;
    }
    
    public void setLocationType(String locationType) {
        this.locationType = locationType;
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
	
	@Column(name="APPROVE_MANAGER_ID", length=100)
	public String getApproveManagerId() {
		return approveManagerId;
	}

	public void setApproveManagerId(String approveManagerId) {
		this.approveManagerId = approveManagerId;
	}
	
	@Column(name="APPROVE_MANAGER_LIST", length=1000)
	public String getApproveManagerList() {
		return approveManagerList;
	}

	public void setApproveManagerList(String approveManagerList) {
		this.approveManagerList = approveManagerList;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REQ_DATE")
	public Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	@Column(name="OVER_SLA")
	public String getOverSla() {
		return overSla;
	}

	public void setOverSla(String overSla) {
		this.overSla = overSla;
	}

	@Column(name="UR_STATUS_NAME")
	public String getUrStatusName() {
		return urStatusName;
	}

	public void setUrStatusName(String urStatusName) {
		this.urStatusName = urStatusName;
	}

	@Transient
	public String getTotalNodeDesc() {
		return "Total Node " + ((totalNode==null) ? " " : totalNode) + " Hosts";
	}
	@Transient
	public String getClassBDesc() {
		return "class B " + ((classB==null) ? " " : classB) + " Network";
	}
	@Transient
	public String getClassCDesc() {
		return "class C " + ((classC==null) ? " " : classC) + " Network";
	}
	
	@Transient
	public String getNetworkSizeDesc() {
		String str = "";
		if (totalNode!=null && totalNode.intValue()>0) {
			str = getTotalNodeDesc();
		}
		if (str.trim().length()>0 && classC!=null && classB.intValue()>0) {
			str = str + "<BR>" + getClassBDesc();
		}
		if (str.trim().length()>0 && classC!=null && classC.intValue()>0) {
			str = str + "<BR>" + getClassCDesc();
		}
		return str;
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException
    {
		IpUrIpDetail another = (IpUrIpDetail) super.clone();
        //? take care of any deep copies to be made here
        return another;
    }

	@Transient
	public String getFuncId() {
		return funcId;
	}

	public void setFuncId(String funcId) {
		this.funcId = funcId;
	}
	
	@Transient
	public String getV_view() {
		return v_view;
	}

	public void setV_view(String vView) {
		v_view = vView;
	}

	@Transient
	public Date getReqDateTo() {
		return reqDateTo;
	}

	public void setReqDateTo(Date reqDateTo) {
		this.reqDateTo = reqDateTo;
	}
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name="REQ_TEAM" , referencedColumnName="TEAM_ID", nullable=true, insertable=false, updatable=false)
	public IpTeam getReqIpTeam() {
		return reqIpTeam;
	}
	
	public void setReqIpTeam(IpTeam reqIpTeam) {
		this.reqIpTeam = reqIpTeam;
	}

	@Transient
	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	@Transient
	public String getIpCriteria() {
		return ipCriteria;
	}

	public void setIpCriteria(String ipCriteria) {
		this.ipCriteria = ipCriteria;
	}

	@Transient
	public String getSingleIpCriteria() {
		return singleIpCriteria;
	}

	public void setSingleIpCriteria(String singleIpCriteria) {
		this.singleIpCriteria = singleIpCriteria;
	}

	@Transient
	public String getNatIP() {
		return natIP;
	}

	public void setNatIP(String natIP) {
		this.natIP = natIP;
	}

	@Transient
	public String getNatIPTo() {
		return natIPTo;
	}

	public void setNatIPTo(String natIPTo) {
		this.natIPTo = natIPTo;
	}

	@Transient
	public String getSingleIpToCriteria() {
		return singleIpToCriteria;
	}

	public void setSingleIpToCriteria(String singleIpToCriteria) {
		this.singleIpToCriteria = singleIpToCriteria;
	}

	@Transient
	public String getIpToCriteria() {
		return ipToCriteria;
	}

	public void setIpToCriteria(String ipToCriteria) {
		this.ipToCriteria = ipToCriteria;
	}
	
	
	
	
	
}


