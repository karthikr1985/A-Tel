package th.co.ais.ipfm.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class IPFMSourceIP implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="SOURCE_IP", length=100)
	private String ip;
	
	@Column(name="SOURCE_HOST_NAME", length=100)
	private String hostName;
	
	@Column(name="SOURCE_EMAIL", length=100)
	private String email;
	
	@Column(name="SOURCE_NAT_IP", length=100)
	private String natIp;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNatIp() {
		return natIp;
	}

	public void setNatIp(String natIp) {
		this.natIp = natIp;
	}

		
	
}






