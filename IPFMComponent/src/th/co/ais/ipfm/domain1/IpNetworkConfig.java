package th.co.ais.ipfm.domain1;
// Generated 27 ?.?. 2553, 17:13:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * IpNetworkConfig generated by hbm2java
 */
@Entity
@Table(name="IP_NETWORK_CONFIG"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpNetworkConfig  implements java.io.Serializable {
	
	@Column(name="IP_ADDRESS")
	private String ipAddress;
	
	@Column(name="MASK")
	private String mask; 
	
	@Column(name="VIP_PORT") 
	private String vipPort; 
	
	@Column(name="SOURCE_IP_1")
	private String sourceIp1; 
	
	@Column(name="SOURCE_IP_2") 
	private String sourceIp2; 
	
	@Column(name="SOURCE_HOST_NAME") 
	private String sourceHostName; 
	
	@Column(name="SOURCE_EMAIL") 
	private String sourceEmail; 
	
	@Column(name="SOURCE_VIP") 
	private String sourceVip; 
	
	@Column(name="SOURCE_NAT_IP") 
	private String sourceNatIp; 
	
	@Column(name="SOURCE_LOCATION_NAME") 
	private String sourceLocationName; 
	
	@Column(name="SOURCE_NETWORK_IP") 
	private String sourceNetworkIp; 
	
	@Column(name="SOURCE_INTER_NODE")
	private String sourceInterNode;
	
	@Column(name="SOURCE_INTER_NW") 
	private String sourceInterNw; 
	
	@Column(name="DEST_IP") 
	private String destIp; 
	
	@Column(name="DEST_IP_1") 
	private String destIp1; 
	
	@Column(name="DEST_IP_2") 
	private String destIp2; 
	
	@Column(name="DEST_HOST_NAME") 
	private String destHostName; 
	
	@Column(name="DEST_EMAIL")
	private String destEmail; 
	
	@Column(name="DEST_VIP")
	private String destVip; 
	
	@Column(name="DEST_NAT_IP")
	private String destNatIp; 
	
	@Column(name="DEST_LOCATION_NAME")
	private String destLocationName; 
	
	@Column(name="DEST_NETWORK_IP") 
	private String destNetworkIp; 
	
	@Column(name="DEST_INTER_NODE")
	private String destInterNode;
	
	@Column(name="DEST_INTER_NW")
	private String destInterNw; 
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="REQ_IMPACT")
	private String reqImpact; 
	
	@Column(name="SERVICE_STATUS")
	private String serviceStatus; 
	
	@Column(name="SERVICE_ID")
	private String serviceId;
	
	@Column(name="SERVICE_NAME")
	private String serviceName; 
	
	@Column(name="SERVICE_DESC")
	private String serviceDesc; 
	
	@Column(name="SERVICE_TCP_STATUS")
	private String serviceTcpStatus;
	
	@Column(name="SERVICE_TCP_PORT")
	private String serviceTcpPort; 
	
	@Column(name="SERVICE_UDP_STATUS") 
	private String serviceUdpStatus;
	
	@Column(name="SERVICE_UDP_PORT")
	private String serviceUdpPort; 
	
	@Column(name="SERVICE_OTHER_STATUS")
	private String serviceOtherStatus; 
	
	@Column(name="SERVICE_OTHER_PORT")
	private String serviceOtherPort; 
	
	@Column(name="MAC_ADDRESS")
	private String macAddress; 
	
	@Column(name="FLOOR")
	private String floor;
	
	@Column(name="REQ_VLAN_ID")
	private String reqVlanId; 
	
	@Column(name="INTERFACE_NODE_DESC")
	private String interfaceNodeDesc; 
	
	@Column(name="INTERFACE_DESC")
	private String interfaceDesc; 
	
	@Column(name="PORT_STATUS_DESC")
	private String portStatusDesc; 
	
	@Column(name="SPEED_PORT_DESC")
	private String speedPortDesc; 
	
	@Column(name="ENCLOSURE")
	private String enclosure;
	
	@Column(name="REQ_REMARKS")
	private String reqRemarks;
	
	@Column(name="NETWORK_TYPE_DESC")
	private String networkTypeDesc; 
	
	@Column(name="ROUTING_INTERFACE")
	private String routingInterface;
	
	@Column(name="ROUTING_NEXT_HOP")
	private String routingNextHop;
	
	@Column(name="ROUTING_REQ_DESC")
	private String routingReqDesc; 
	
	@Column(name="IS_SNAP_IP")
	private String isSnapIp; 
	
	@Column(name="SNAP_IP")
	private String snapIp; 
	
	@Column(name="IS_PERSISTENCE")
	private String isPersistence; 
	
	@Column(name="METHOD")
	private String method;
	
	@Column(name="POOL_IP_ADDRESS")
	private String poolIpAddress; 
	
	@Column(name="POOL_IP_PORT")
	private String poolIpPort; 
	
	@Column(name="POOL_WEIGHT")
	private String poolWeight; 
	
	@Column(name="NETWORK_DEVICE")
	private String networkDevice; 
	
	@Column(name="NETWORK_LOCATION_DESC")
	private String networkLocationDesc; 
	
	@Column(name="NETWORK_FLOOR")
	private String networkFloor; 
	
	@Column(name="NETWORK_PORT")
	private String networkPort; 
	
	@Column(name="NETWORK_RACK_NAME")
	private String networkRackName; 
	
	@Column(name="UR_NO") 
	private String urNo; 
	
	@Column(name="SUB_UR_NO")
	private String subUrNo;
	
	@Column(name="REQ_USER_ID")
	private String reqUserId; 
	
	@Column(name="REQ_USER_NAME")
	private String reqUserName;
	
	@Column(name="REQ_FOR")
	private String reqFor; 
	
	@Id 
 	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name="ROW_ID", unique=true, nullable=false, length=50)
	private String rowId; 
	
	@Version
    @Column(name="VERSION", precision=10, scale=0)
	private Long version; 
	
	@Column(name="CREATE_BY")
	private String createdBy;
	
	//@Temporal(TemporalType.DATE)
    @Column(name="CREATE_DATE", length=10)
	private Date created;
	
	@Column(name="UPDATE_BY")
	private String lastUpdBy;
	
	//@Temporal(TemporalType.DATE)
    @Column(name="UPDATE_DATE", length=10)
	private Date lastUpd;

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getVipPort() {
		return vipPort;
	}

	public void setVipPort(String vipPort) {
		this.vipPort = vipPort;
	}

	public String getSourceIp1() {
		return sourceIp1;
	}

	public void setSourceIp1(String sourceIp1) {
		this.sourceIp1 = sourceIp1;
	}

	public String getSourceIp2() {
		return sourceIp2;
	}

	public void setSourceIp2(String sourceIp2) {
		this.sourceIp2 = sourceIp2;
	}

	public String getSourceHostName() {
		return sourceHostName;
	}

	public void setSourceHostName(String sourceHostName) {
		this.sourceHostName = sourceHostName;
	}

	public String getSourceEmail() {
		return sourceEmail;
	}

	public void setSourceEmail(String sourceEmail) {
		this.sourceEmail = sourceEmail;
	}

	public String getSourceVip() {
		return sourceVip;
	}

	public void setSourceVip(String sourceVip) {
		this.sourceVip = sourceVip;
	}

	public String getSourceNatIp() {
		return sourceNatIp;
	}

	public void setSourceNatIp(String sourceNatIp) {
		this.sourceNatIp = sourceNatIp;
	}

	public String getSourceLocationName() {
		return sourceLocationName;
	}

	public void setSourceLocationName(String sourceLocationName) {
		this.sourceLocationName = sourceLocationName;
	}

	public String getSourceNetworkIp() {
		return sourceNetworkIp;
	}

	public void setSourceNetworkIp(String sourceNetworkIp) {
		this.sourceNetworkIp = sourceNetworkIp;
	}

	public String getSourceInterNode() {
		return sourceInterNode;
	}

	public void setSourceInterNode(String sourceInterNode) {
		this.sourceInterNode = sourceInterNode;
	}

	public String getSourceInterNw() {
		return sourceInterNw;
	}

	public void setSourceInterNw(String sourceInterNw) {
		this.sourceInterNw = sourceInterNw;
	}

	public String getDestIp() {
		return destIp;
	}

	public void setDestIp(String destIp) {
		this.destIp = destIp;
	}

	public String getDestIp1() {
		return destIp1;
	}

	public void setDestIp1(String destIp1) {
		this.destIp1 = destIp1;
	}

	public String getDestIp2() {
		return destIp2;
	}

	public void setDestIp2(String destIp2) {
		this.destIp2 = destIp2;
	}

	public String getDestHostName() {
		return destHostName;
	}

	public void setDestHostName(String destHostName) {
		this.destHostName = destHostName;
	}

	public String getDestEmail() {
		return destEmail;
	}

	public void setDestEmail(String destEmail) {
		this.destEmail = destEmail;
	}

	public String getDestVip() {
		return destVip;
	}

	public void setDestVip(String destVip) {
		this.destVip = destVip;
	}

	public String getDestNatIp() {
		return destNatIp;
	}

	public void setDestNatIp(String destNatIp) {
		this.destNatIp = destNatIp;
	}

	public String getDestLocationName() {
		return destLocationName;
	}

	public void setDestLocationName(String destLocationName) {
		this.destLocationName = destLocationName;
	}

	public String getDestNetworkIp() {
		return destNetworkIp;
	}

	public void setDestNetworkIp(String destNetworkIp) {
		this.destNetworkIp = destNetworkIp;
	}

	public String getDestInterNode() {
		return destInterNode;
	}

	public void setDestInterNode(String destInterNode) {
		this.destInterNode = destInterNode;
	}

	public String getDestInterNw() {
		return destInterNw;
	}

	public void setDestInterNw(String destInterNw) {
		this.destInterNw = destInterNw;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReqImpact() {
		return reqImpact;
	}

	public void setReqImpact(String reqImpact) {
		this.reqImpact = reqImpact;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDesc() {
		return serviceDesc;
	}

	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getServiceTcpStatus() {
		return serviceTcpStatus;
	}

	public void setServiceTcpStatus(String serviceTcpStatus) {
		this.serviceTcpStatus = serviceTcpStatus;
	}

	public String getServiceTcpPort() {
		return serviceTcpPort;
	}

	public void setServiceTcpPort(String serviceTcpPort) {
		this.serviceTcpPort = serviceTcpPort;
	}

	public String getServiceUdpStatus() {
		return serviceUdpStatus;
	}

	public void setServiceUdpStatus(String serviceUdpStatus) {
		this.serviceUdpStatus = serviceUdpStatus;
	}

	public String getServiceUdpPort() {
		return serviceUdpPort;
	}

	public void setServiceUdpPort(String serviceUdpPort) {
		this.serviceUdpPort = serviceUdpPort;
	}

	public String getServiceOtherStatus() {
		return serviceOtherStatus;
	}

	public void setServiceOtherStatus(String serviceOtherStatus) {
		this.serviceOtherStatus = serviceOtherStatus;
	}

	public String getServiceOtherPort() {
		return serviceOtherPort;
	}

	public void setServiceOtherPort(String serviceOtherPort) {
		this.serviceOtherPort = serviceOtherPort;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getReqVlanId() {
		return reqVlanId;
	}

	public void setReqVlanId(String reqVlanId) {
		this.reqVlanId = reqVlanId;
	}

	public String getInterfaceNodeDesc() {
		return interfaceNodeDesc;
	}

	public void setInterfaceNodeDesc(String interfaceNodeDesc) {
		this.interfaceNodeDesc = interfaceNodeDesc;
	}

	public String getInterfaceDesc() {
		return interfaceDesc;
	}

	public void setInterfaceDesc(String interfaceDesc) {
		this.interfaceDesc = interfaceDesc;
	}

	public String getPortStatusDesc() {
		return portStatusDesc;
	}

	public void setPortStatusDesc(String portStatusDesc) {
		this.portStatusDesc = portStatusDesc;
	}

	public String getSpeedPortDesc() {
		return speedPortDesc;
	}

	public void setSpeedPortDesc(String speedPortDesc) {
		this.speedPortDesc = speedPortDesc;
	}

	public String getEnclosure() {
		return enclosure;
	}

	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	public String getReqRemarks() {
		return reqRemarks;
	}

	public void setReqRemarks(String reqRemarks) {
		this.reqRemarks = reqRemarks;
	}

	public String getNetworkTypeDesc() {
		return networkTypeDesc;
	}

	public void setNetworkTypeDesc(String networkTypeDesc) {
		this.networkTypeDesc = networkTypeDesc;
	}

	public String getRoutingInterface() {
		return routingInterface;
	}

	public void setRoutingInterface(String routingInterface) {
		this.routingInterface = routingInterface;
	}

	public String getRoutingNextHop() {
		return routingNextHop;
	}

	public void setRoutingNextHop(String routingNextHop) {
		this.routingNextHop = routingNextHop;
	}

	public String getRoutingReqDesc() {
		return routingReqDesc;
	}

	public void setRoutingReqDesc(String routingReqDesc) {
		this.routingReqDesc = routingReqDesc;
	}

	public String getIsSnapIp() {
		return isSnapIp;
	}

	public void setIsSnapIp(String isSnapIp) {
		this.isSnapIp = isSnapIp;
	}

	public String getSnapIp() {
		return snapIp;
	}

	public void setSnapIp(String snapIp) {
		this.snapIp = snapIp;
	}

	public String getIsPersistence() {
		return isPersistence;
	}

	public void setIsPersistence(String isPersistence) {
		this.isPersistence = isPersistence;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPoolIpAddress() {
		return poolIpAddress;
	}

	public void setPoolIpAddress(String poolIpAddress) {
		this.poolIpAddress = poolIpAddress;
	}

	public String getPoolIpPort() {
		return poolIpPort;
	}

	public void setPoolIpPort(String poolIpPort) {
		this.poolIpPort = poolIpPort;
	}

	public String getPoolWeight() {
		return poolWeight;
	}

	public void setPoolWeight(String poolWeight) {
		this.poolWeight = poolWeight;
	}

	public String getNetworkDevice() {
		return networkDevice;
	}

	public void setNetworkDevice(String networkDevice) {
		this.networkDevice = networkDevice;
	}

	public String getNetworkLocationDesc() {
		return networkLocationDesc;
	}

	public void setNetworkLocationDesc(String networkLocationDesc) {
		this.networkLocationDesc = networkLocationDesc;
	}

	public String getNetworkFloor() {
		return networkFloor;
	}

	public void setNetworkFloor(String networkFloor) {
		this.networkFloor = networkFloor;
	}

	public String getNetworkPort() {
		return networkPort;
	}

	public void setNetworkPort(String networkPort) {
		this.networkPort = networkPort;
	}

	public String getNetworkRackName() {
		return networkRackName;
	}

	public void setNetworkRackName(String networkRackName) {
		this.networkRackName = networkRackName;
	}

	public String getUrNo() {
		return urNo;
	}

	public void setUrNo(String urNo) {
		this.urNo = urNo;
	}

	public String getSubUrNo() {
		return subUrNo;
	}

	public void setSubUrNo(String subUrNo) {
		this.subUrNo = subUrNo;
	}

	public String getReqUserId() {
		return reqUserId;
	}

	public void setReqUserId(String reqUserId) {
		this.reqUserId = reqUserId;
	}

	public String getReqUserName() {
		return reqUserName;
	}

	public void setReqUserName(String reqUserName) {
		this.reqUserName = reqUserName;
	}

	public String getReqFor() {
		return reqFor;
	}

	public void setReqFor(String reqFor) {
		this.reqFor = reqFor;
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getLastUpdBy() {
		return lastUpdBy;
	}

	public void setLastUpdBy(String lastUpdBy) {
		this.lastUpdBy = lastUpdBy;
	}

	public Date getLastUpd() {
		return lastUpd;
	}

	public void setLastUpd(Date lastUpd) {
		this.lastUpd = lastUpd;
	}

}


