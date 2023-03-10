package th.co.ais.ipfm.domain1;

// Generated 9 �.�. 2553, 12:00:07 by Hibernate Tools 3.2.1.GA


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import th.co.ais.ipfm.domain.MasterDomain;
import th.co.ais.ipfm.util.IPFMUtils;

/**
 * IpUrIpResult generated by hbm2java
 */
@Entity
@Table(name="IP_UR_IP_RESULT"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpUrIpResult extends MasterDomain implements java.io.Serializable,Cloneable {


     private IpUrIpResultId id;
     private Long version;
     private String companyId;
     private String companyName;
     private String ipVersion;
     private String ipTypeId;
     private String ipTypeName;
     private String vlanId;
     private String dnsName;
     private String vip;
     private String locationId;
     private String locationName;
     private String installTypeId;
     private String installTypeName;
     private String networkTypeId;
     private String networkTypeName;
     private String networkZoneId;
     private String networkZoneName;
     private String networkIp;
     private String gateway;
     private String remarks;
     private String level1Start;
     private String level1End;
     private String binary1Start;
     private String binary1End;
     private String level2Start;
     private String level2End;
     private String binary2Start;
     private String binary2End;
     private Date effectiveDate;
     private Date expireDate;
     private String rowId;
     private Integer totalIp;
     
     private String systemName;
     
 	 private String ipDigit1;
	 private String ipDigit2;
	 private String ipDigit3;
	 private String ipDigit4;
	 private String mask;
	 private String ip;
	 private String effDate;
	 private String expDate;
	 
	 private String ipStart;
	 private String ipEnd;
	 private String result;
	 private String level1Id;
	 private String level2Id;
	 private String vt1TeamId;
	 private String vt1TeamName;
	 private String vt2TeamId;
	 private String vt1Remarks;
	 private String vipSubmask;
	 private boolean rowShowIpInfo = false;
	 private boolean rowCheck = false;
	 private List<IpInfo> ipInfoList = new ArrayList<IpInfo>();
	 private IpLevel1 ipLevel1 = new IpLevel1();
	 private IpLevel2 ipLevel2 = new IpLevel2();
	 private Integer vmask;
	 private String V_Mode_Assign;
	 
    public IpUrIpResult() {
    }

	
    public IpUrIpResult(IpUrIpResultId id) {
        this.id = id;
    }
    public IpUrIpResult(IpUrIpResultId id, String companyId, String companyName, String ipVersion, String ipTypeId, String ipTypeName, String vlanId, String dnsName, String vip, String networkTypeId, String networkTypeName, String networkZoneId, String networkZoneName, String networkIp, String gateway, String remarks, String level1Start, String level1End, String binary1Start, String binary1End, Date effectiveDate, Date expireDate, String createBy, Date createDate, String updateBy, Date updateDate, String rowId, Integer totalIp) {
       this.id = id;
       this.companyId = companyId;
       this.companyName = companyName;
       this.ipVersion = ipVersion;
       this.ipTypeId = ipTypeId;
       this.ipTypeName = ipTypeName;
       this.vlanId = vlanId;
       this.dnsName = dnsName;
       this.vip = vip;
       this.networkTypeId = networkTypeId;
       this.networkTypeName = networkTypeName;
       this.networkZoneId = networkZoneId;
       this.networkZoneName = networkZoneName;
       this.networkIp = networkIp;
       this.gateway = gateway;
       this.remarks = remarks;
       this.level1Start = level1Start;
       this.level1End = level1End;
       this.binary1Start = binary1Start;
       this.binary1End = binary1End;
       this.effectiveDate = effectiveDate;
       this.expireDate = expireDate;
       this.rowId = rowId;
       this.totalIp = totalIp;
    }
    
    
    @EmbeddedId
    @AttributeOverrides( {
        @AttributeOverride(name="urNo", column=@Column(name="UR_NO", nullable=false, length=20) ), 
        @AttributeOverride(name="seq", column=@Column(name="SEQ", nullable=false, precision=22, scale=0) ) } )
    public IpUrIpResultId getId() {
        return this.id;
    }
    
     
    public void setId(IpUrIpResultId id) {
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
    
    @Column(name="COMPANY_ID")
    public String getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    
    @Column(name="COMPANY_NAME", length=1000)
    public String getCompanyName() {
        return this.companyName;
    }
    
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    @Column(name="LOCATION_ID")
    public String getLocationId() {
		return locationId;
	}

    public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

    @Column(name="LOCATION_NAME", length=1000)
	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Column(name="INSTALL_TYPE_ID")
	public String getInstallTypeId() {
		return installTypeId;
	}


	public void setInstallTypeId(String installTypeId) {
		this.installTypeId = installTypeId;
	}

	@Column(name="INSTALL_TYPE_NAME", length=1000)
	public String getInstallTypeName() {
		return installTypeName;
	}

	public void setInstallTypeName(String installTypeName) {
		this.installTypeName = installTypeName;
	}

	@Column(name="IP_VERSION", length=3)
    public String getIpVersion() {
        return this.ipVersion;
    }
    
    public void setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
    }
    
    @Column(name="IP_TYPE_ID")
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
    
    @Column(name="VLAN_ID", length=30)
    public String getVlanId() {
        return this.vlanId;
    }
    
    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }
    
    @Column(name="DNS_NAME", length=30)
    public String getDnsName() {
        return this.dnsName;
    }
    
    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }
    
    @Column(name="VIP", length=1)
    public String getVip() {
        return this.vip;
    }
    
    public void setVip(String vip) {
        this.vip = vip;
    }

    @Column(name="SYSTEM_NAME", length=1000)
    public String getSystemName() {
        return this.systemName;
    }    
    
    public void setSystemName(String systemName) {
    	this.systemName = systemName;
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
    
    @Column(name="NETWORK_ZONE_ID")
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
    
    @Column(name="REMARKS", length=1000)
    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    @Column(name="LEVEL1_START", length=21)
    public String getLevel1Start() {
        return this.level1Start;
    }
    
    public void setLevel1Start(String level1Start) {
        this.level1Start = level1Start;
    }
    
    @Column(name="LEVEL1_END", length=21)
    public String getLevel1End() {
        return this.level1End;
    }
    
    public void setLevel1End(String level1End) {
        this.level1End = level1End;
    }
    
    @Column(name="BINARY1_START", length=35)
    public String getBinary1Start() {
        return this.binary1Start;
    }
    
    public void setBinary1Start(String binary1Start) {
        this.binary1Start = binary1Start;
    }
    
    @Column(name="BINARY1_END", length=35)
    public String getBinary1End() {
        return this.binary1End;
    }
    
    public void setBinary1End(String binary1End) {
        this.binary1End = binary1End;
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
    
    @Temporal(TemporalType.DATE)
    @Column(name="EFFECTIVE_DATE", length=7)
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }
    
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    
    @Transient
    public String getStrEffectiveDate() {
    	String str="";
        try {
        	str = IPFMUtils.cnvDateToString(this.effectiveDate, "dd/MM/yyyy");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
    }
    
    @Temporal(TemporalType.DATE)
    @Column(name="EXPIRE_DATE", length=7)
    public Date getExpireDate() {
        return this.expireDate;
    }
    
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    
    @Transient
    public String getStrExpireDate() {
    	String str="";
        try {
        	str = IPFMUtils.cnvDateToString(this.expireDate, "dd/MM/yyyy");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
    }
    
    @Column(name="ROW_ID", unique=true, length=50)
    public String getRowId() {
        return this.rowId;
    }
    
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }
    
    @Column(name="TOTAL_IP", precision=8, scale=0)
    public Integer getTotalIp() {
        return this.totalIp;
    }
    
    public void setTotalIp(Integer totalIp) {
        this.totalIp = totalIp;
    }

    @Transient
	public String getIpDigit1() {
		return ipDigit1;
	}
	public void setIpDigit1(String ipDigit1) {
		this.ipDigit1 = ipDigit1;
	}
	@Transient
	public String getIpDigit2() {
		return ipDigit2;
	}
	public void setIpDigit2(String ipDigit2) {
		this.ipDigit2 = ipDigit2;
	}
	@Transient
	public String getIpDigit3() {
		return ipDigit3;
	}
	public void setIpDigit3(String ipDigit3) {
		this.ipDigit3 = ipDigit3;
	}
	@Transient
	public String getIpDigit4() {
		return ipDigit4;
	}
	public void setIpDigit4(String ipDigit4) {
		this.ipDigit4 = ipDigit4;
	}
	@Transient
	public String getMask() {
		return mask;
	}
	public void setMask(String mask) {
		this.mask = mask;
	}
	@Transient
	public String getIpStart() {
		return ipStart;
	}

	public void setIpStart(String ipStart) {
		this.ipStart = ipStart;
	}
	@Transient
	public String getIpEnd() {
		return ipEnd;
	}

	public void setIpEnd(String ipEnd) {
		this.ipEnd = ipEnd;
	}
	
	@Transient
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
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
	
	@Transient
	public List<IpInfo> getIpInfoList() {
		return ipInfoList;
	}

	public void setIpInfoList(List<IpInfo> ipInfoList) {
		this.ipInfoList = ipInfoList;
	}

	@Transient
	public String getLevel1Id() {
		return level1Id;
	}


	public void setLevel1Id(String level1Id) {
		this.level1Id = level1Id;
	}


	@Transient
	public String getIpAddress() {
		String str="";
		if ((getIpDigit1()!=null && getIpDigit1().trim().length()>0)
			&& (getIpDigit2()!=null && getIpDigit2().trim().length()>0)
			&& (getIpDigit3()!=null && getIpDigit3().trim().length()>0)
			&& (getIpDigit4()!=null && getIpDigit4().trim().length()>0)
			){
			str = getIpDigit1()+"."+getIpDigit2()+"."+getIpDigit3()+"."+getIpDigit4();
		}
		return str;
	}
	@Transient
	public void setIpAddress(String ipAddress) {
//		System.out.println("setIpAddress = "+ ipAddress);
		if (ipAddress!=null && ipAddress.trim().length()>0) {
			String[] ip = ipAddress.split("\\.");
//			System.out.println("ip.length = "+ip.length);
			setIpDigit1(ip[0]);
			setIpDigit2(ip[1]);
			setIpDigit3(ip[2]);
			setIpDigit4(ip[3]);
		}else{
			setIpDigit1("");
			setIpDigit2("");
			setIpDigit3("");
			setIpDigit4("");
		}
	}
	@Transient
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Transient
	public String getEffDate() {
		return effDate;
	}

	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	@Transient
	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Transient
	public boolean isRowShowIpInfo() {
		return rowShowIpInfo;
	}


	public void setRowShowIpInfo(boolean rowShowIpInfo) {
		this.rowShowIpInfo = rowShowIpInfo;
	}
	
	@Transient
	public boolean isRowCheck() {
		return rowCheck;
	}


	public void setRowCheck(boolean rowCheck) {
		this.rowCheck = rowCheck;
	}


	@Transient
	public IpLevel2 getIpLevel2() {
		return ipLevel2;
	}


	public void setIpLevel2(IpLevel2 ipLevel2) {
		this.ipLevel2 = ipLevel2;
	}
	
	@Transient
	public String getVt1TeamId() {
		return vt1TeamId;
	}


	public void setVt1TeamId(String vt1TeamId) {
		this.vt1TeamId = vt1TeamId;
	}
	
	@Transient
	public String getVt1TeamName() {
		return vt1TeamName;
	}


	public void setVt1TeamName(String vt1TeamName) {
		this.vt1TeamName = vt1TeamName;
	}


	@Transient
	public String getVt2TeamId() {
		return vt2TeamId;
	}


	public void setVt2TeamId(String vt2TeamId) {
		this.vt2TeamId = vt2TeamId;
	}

	@Transient
	public String getVt1Remarks() {
		return vt1Remarks;
	}


	public void setVt1Remarks(String vt1Remarks) {
		this.vt1Remarks = vt1Remarks;
	}

	@Override
    public Object clone() throws CloneNotSupportedException
    {
		IpUrIpResult another = (IpUrIpResult) super.clone();
		another.setIpLevel2((IpLevel2)getIpLevel2().clone());
        //? take care of any deep copies to be made here
        return another;
    }
	
	@Transient
	public String getVipSubmask() {
		return vipSubmask;
	}


	public void setVipSubmask(String vipSubmask) {
		this.vipSubmask = vipSubmask;
	}


	@Transient
	public String getV_Mode_Assign() {
		return V_Mode_Assign;
	}

	public void setV_Mode_Assign(String vModeAssign) {
		V_Mode_Assign = vModeAssign;
	}

	@Transient
	public Integer getVmask() {
		return vmask;
	}


	public void setVmask(Integer vmask) {
		this.vmask = vmask;
	}

	@Transient
	public String getLevel2Id() {
		return level2Id;
	}


	public void setLevel2Id(String level2Id) {
		this.level2Id = level2Id;
	}


	@Transient
	public IpLevel1 getIpLevel1() {
		return ipLevel1;
	}


	public void setIpLevel1(IpLevel1 ipLevel1) {
		this.ipLevel1 = ipLevel1;
	}

	

	
}


