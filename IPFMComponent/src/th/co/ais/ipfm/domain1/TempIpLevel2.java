package th.co.ais.ipfm.domain1;
// Generated 27 �.�. 2553, 17:13:55 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
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
import th.co.ais.ipfm.util.IPFMUtils;

/**
 * IpLevel2 generated by hbm2java
 */
@Entity
@Table(name="TEMP_IP_LEVEL2"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class TempIpLevel2 extends MasterDomain implements java.io.Serializable , Cloneable{


     private String level2Id;
     private Long version;
     private String ipVersion;
     private String level1Id;
     private String level2Start;
     private String level2End;
     private String binary2Start;
     private String binary2End;
     private String ipSubmask;
     private String ipStatus;
     private String ipTypeId;
     private String ipTypeName;
     private String companyId;
     private String companyName;
     private String networkTypeId;
     private String networkTypeName;
     private String vlanId;
     private String networkZoneId;
     private String networkZoneName;
     private String vip;
     private String dnsName;
     private String submask;
     private String networkIp;
     private String gateway;
     private String systemName;
     private String locationId;
     private String locationName;
     private String installTypeId;
     private String installTypeName;
     private Date effectiveDate;
     private Date expiredDate;
     private String t1TeamId;
     private String t1TeamName;
     private String t1Remark;
     private String t2TeamId;
     private String t2TeamName;
     private String t2Remark;
     private BigDecimal totalIp;
     private BigDecimal availableIp;
     private BigDecimal assignIp;
     private BigDecimal reserveIp;
     private BigDecimal useIp;
     private BigDecimal terminateIp;
     private String rowId;
     private boolean rowCheck;
     private String ipStatusOld;
     private Integer levelData;

    public TempIpLevel2() {
    }

    public TempIpLevel2(String level2Id) {
        this.level2Id = level2Id;
    }
   
	public TempIpLevel2(String level2Id, Long version, String ipVersion,
			String level1Id, String level2Start, String level2End,
			String binary2Start, String binary2End, String ipSubmask,
			String ipStatus, String ipTypeId, String ipTypeName,
			String companyId, String companyName, String networkTypeId,
			String networkTypeName, String vlanId, String networkZoneId,
			String networkZoneName, String vip, String dnsName, String submask,
			String networkIp, String gateway, String systemName,
			String locationId, String locationName, String installTypeId,
			String installTypeName, Date effectiveDate, Date expiredDate,
			String t1TeamId, String t1TeamName, String t1Remark,
			String t2TeamId, String t2TeamName, String t2Remark,
			BigDecimal totalIp, BigDecimal availableIp, BigDecimal assignIp,
			BigDecimal reserveIp, BigDecimal useIp, BigDecimal terminateIp,
			String rowId, boolean rowCheck) {
		super();
		this.level2Id = level2Id;
		this.version = version;
		this.ipVersion = ipVersion;
		this.level1Id = level1Id;
		this.level2Start = level2Start;
		this.level2End = level2End;
		this.binary2Start = binary2Start;
		this.binary2End = binary2End;
		this.ipSubmask = ipSubmask;
		this.ipStatus = ipStatus;
		this.ipTypeId = ipTypeId;
		this.ipTypeName = ipTypeName;
		this.companyId = companyId;
		this.companyName = companyName;
		this.networkTypeId = networkTypeId;
		this.networkTypeName = networkTypeName;
		this.vlanId = vlanId;
		this.networkZoneId = networkZoneId;
		this.networkZoneName = networkZoneName;
		this.vip = vip;
		this.dnsName = dnsName;
		this.submask = submask;
		this.networkIp = networkIp;
		this.gateway = gateway;
		this.systemName = systemName;
		this.locationId = locationId;
		this.locationName = locationName;
		this.installTypeId = installTypeId;
		this.installTypeName = installTypeName;
		this.effectiveDate = effectiveDate;
		this.expiredDate = expiredDate;
		this.t1TeamId = t1TeamId;
		this.t1TeamName = t1TeamName;
		this.t1Remark = t1Remark;
		this.t2TeamId = t2TeamId;
		this.t2TeamName = t2TeamName;
		this.t2Remark = t2Remark;
		this.totalIp = totalIp;
		this.availableIp = availableIp;
		this.assignIp = assignIp;
		this.reserveIp = reserveIp;
		this.useIp = useIp;
		this.terminateIp = terminateIp;
		this.rowId = rowId;
		this.rowCheck = rowCheck;
	}

	@Column(name="LEVEL2_ID", unique=true, nullable=false, length=5)
    public String getLevel2Id() {
        return this.level2Id;
    }
    
    public void setLevel2Id(String level2Id) {
        this.level2Id = level2Id;
    }
    @Version
    @Column(name="VERSION", precision=10, scale=0)
    public Long getVersion() {
        return this.version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }
    
    @Column(name="IP_VERSION", length=3)
    public String getIpVersion() {
        return this.ipVersion;
    }
    
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }
    
    @Column(name="LEVEL1_ID", length=5)
    public String getLevel1Id() {
        return this.level1Id;
    }
    
    public void setLevel1Id(String level1Id) {
        this.level1Id = level1Id;
    }
    
    @Column(name="LEVEL2_START", length=21)
    public String getLevel2Start() {
        return this.level2Start;
    }
    
    public void setLevel2Start(String level2Start) {
        this.level2Start = level2Start;
    }
    
    @Column(name="LEVEL2_END", length=21)
    public String getLevel2End() {
        return this.level2End;
    }
    
    public void setLevel2End(String level2End) {
        this.level2End = level2End;
    }
    
    @Column(name="BINARY2_START", length=35)
    public String getBinary2Start() {
        return this.binary2Start;
    }
    
    public void setBinary2Start(String binary2Start) {
        this.binary2Start = binary2Start;
    }
    
    @Column(name="BINARY2_END", length=35)
    public String getBinary2End() {
        return this.binary2End;
    }
    
    public void setBinary2End(String binary2End) {
        this.binary2End = binary2End;
    }
    
    @Column(name="IP_STATUS", length=2)
    public String getIpStatus() {
        return this.ipStatus;
    }
    
    public void setIpStatus(String ipStatus) {
        this.ipStatus = ipStatus;
    }
    @Column(name="COMPANY_ID")
	public String getCompanyId() {
		return companyId;
	}
    public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
    @Column(name="COMPANY_NAME")
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Column(name="VIP")
	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	@Column(name="IP_TYPE_ID", length=30)
    public String getIpTypeId() {
        return this.ipTypeId;
    }
    
    public void setIpTypeId(String ipTypeId) {
        this.ipTypeId = ipTypeId;
    }
    
    @Column(name="IP_TYPE_NAME", length=1000)
    public String getIpTypeName() {
        return this.ipTypeName;
    }
    
    public void setIpTypeName(String ipTypeName) {
        this.ipTypeName = ipTypeName;
    }
    
    @Column(name="NETWORK_TYPE_ID", length=30)
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
    
    @Column(name="VLAN_ID", length=30)
    public String getVlanId() {
        return this.vlanId;
    }
    
    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }
    
    @Column(name="NETWORK_ZONE_ID", length=10)
    public String getNetworkZoneId() {
        return this.networkZoneId;
    }
    
    public void setNetworkZoneId(String networkZoneId) {
        this.networkZoneId = networkZoneId;
    }
    
    @Column(name="NETWORK_ZONE_NAME", length=1000)
    public String getNetworkZoneName() {
        return this.networkZoneName;
    }
    
    public void setNetworkZoneName(String networkZoneName) {
        this.networkZoneName = networkZoneName;
    }
    
    @Column(name="DNS_NAME", length=30)
    public String getDnsName() {
        return this.dnsName;
    }
    
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }
    
    @Column(name="SUBMASK", length=30)
    public String getSubmask() {
        return this.submask;
    }
    
    public void setSubmask(String submask) {
        this.submask = submask;
    }
    
    @Column(name="NETWORK_IP", length=30)
    public String getNetworkIp() {
        return this.networkIp;
    }
    
    public void setNetworkIp(String networkIp) {
        this.networkIp = networkIp;
    }
    
    @Column(name="GATEWAY", length=30)
    public String getGateway() {
        return this.gateway;
    }
    
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }
    
    @Column(name="SYSTEM_NAME", length=1000)
    public String getSystemName() {
        return this.systemName;
    }
    
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }
    
    @Column(name="LOCATION_ID", length=10)
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
    
    @Column(name="IP_SUBMASK")
    public String getIpSubmask() {
		return ipSubmask;
	}

	public void setIpSubmask(String ipSubmask) {
		this.ipSubmask = ipSubmask;
	}

	@Column(name="INSTALL_TYPE_ID", length=10)
    public String getInstallTypeId() {
        return this.installTypeId;
    }
    
    public void setInstallTypeId(String installTypeId) {
        this.installTypeId = installTypeId;
    }
    
    @Column(name="INSTALL_TYPE_NAME", length=1000)
    public String getInstallTypeName() {
        return this.installTypeName;
    }
    
    public void setInstallTypeName(String installTypeName) {
        this.installTypeName = installTypeName;
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
    @Column(name="EXPIRED_DATE", length=10)
    public Date getExpiredDate() {
        return this.expiredDate;
    }
    
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    @Transient
    public String getExpiredDateFormat() {
    	String str="";
        try {
        	str = IPFMUtils.cnvDateToString(this.expiredDate, "yyyyMMdd");
        	//System.out.println("getExpiredDateFormat = " + str);
			return str;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
    }
    
    @Column(name="T1_TEAM_ID", length=10)
    public String getT1TeamId() {
        return this.t1TeamId;
    }
    
    public void setT1TeamId(String t1TeamId) {
        this.t1TeamId = t1TeamId;
    }
    
    @Column(name="T1_TEAM_NAME")
    public String getT1TeamName() {
        return this.t1TeamName;
    }
    
    public void setT1TeamName(String t1TeamName) {
        this.t1TeamName = t1TeamName;
    }
    
    @Column(name="T2_TEAM_ID", length=10)
    public String getT2TeamId() {
        return this.t2TeamId;
    }
    
    public void setT2TeamId(String t2TeamId) {
        this.t2TeamId = t2TeamId;
    }
    
    @Column(name="T2_TEAM_NAME")
    public String getT2TeamName() {
        return this.t2TeamName;
    }
    
    public void setT2TeamName(String t2TeamName) {
        this.t2TeamName = t2TeamName;
    }
    
    @Column(name="T1_REMARK", length=1000)
    public String getT1Remark() {
        return this.t1Remark;
    }
    
    public void setT1Remark(String t1Remark) {
        this.t1Remark = t1Remark;
    }
    
    @Column(name="T2_REMARK", length=1000)
    public String getT2Remark() {
        return this.t2Remark;
    }
    
    public void setT2Remark(String t2Remark) {
        this.t2Remark = t2Remark;
    }
    
    @Column(name="TOTAL_IP", precision=20, scale=0)
    public BigDecimal getTotalIp() {
        return this.totalIp;
    }
    
    public void setTotalIp(BigDecimal totalIp) {
        this.totalIp = totalIp;
    }
    
    @Column(name="AVAILABLE_IP", precision=20, scale=0)
    public BigDecimal getAvailableIp() {
        return this.availableIp;
    }
    
    public void setAvailableIp(BigDecimal availableIp) {
        this.availableIp = availableIp;
    }
    
    @Column(name="ASSIGN_IP", precision=20, scale=0)
    public BigDecimal getAssignIp() {
        return this.assignIp;
    }
    
    public void setAssignIp(BigDecimal assignIp) {
        this.assignIp = assignIp;
    }
    
    @Column(name="RESERVE_IP", precision=20, scale=0)
    public BigDecimal getReserveIp() {
        return this.reserveIp;
    }
    
    public void setReserveIp(BigDecimal reserveIp) {
        this.reserveIp = reserveIp;
    }
    
    @Column(name="USE_IP", precision=20, scale=0)
    public BigDecimal getUseIp() {
        return this.useIp;
    }
    
    public void setUseIp(BigDecimal useIp) {
        this.useIp = useIp;
    }
    
    @Column(name="TERMINATE_IP", precision=20, scale=0)
    public BigDecimal getTerminateIp() {
        return this.terminateIp;
    }
    
    public void setTerminateIp(BigDecimal terminateIp) {
        this.terminateIp = terminateIp;
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
 	@Column(name="LEVEL_DATA")
 	public Integer getLevelData() {
		return levelData;
	}

	public void setLevelData(Integer levelData) {
		this.levelData = levelData;
	}

	@Transient
	public String getIp1StartBinary(){
		String ip1Start = "";
		String ip[] = getLevel2Start().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[0]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp2StartBinary(){
		String ip1Start = "";
		String ip[] = getLevel2Start().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[1]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp3StartBinary(){
		String ip1Start = "";
		String ip[] = getLevel2Start().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[2]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp4StartBinary(){
		String ip1Start = "";
		String ip[] = getLevel2Start().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[3]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp1EndBinary(){
		String ip1Start = "";
		String ip[] = getLevel2End().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[0]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp2EndBinary(){
		String ip1Start = "";
		String ip[] = getLevel2End().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[1]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp3EndBinary(){
		String ip1Start = "";
		String ip[] = getLevel2End().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[2]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
	public String getIp4EndBinary(){
		String ip1Start = "";
		String ip[] = getLevel2End().split("\\.");		
		ip1Start = Integer.toBinaryString(Integer.parseInt(ip[3]));
		for (int i = ip1Start.length() ; i<8 ; i++){
			ip1Start = "0"+ip1Start;
		}
		return ip1Start;
	}
	
	@Transient
    public boolean isRowCheck() {
		return rowCheck;
	}

	public void setRowCheck(boolean rowCheck) {
		this.rowCheck = rowCheck;
	}
	@Transient
	public String getIpStatusOld() {
		return ipStatusOld;
	}

	public void setIpStatusOld(String ipStatusOld) {
		this.ipStatusOld = ipStatusOld;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
    	TempIpLevel2 another = (TempIpLevel2) super.clone();
        return another;
	}
}


