package th.co.ais.ipfm.domain1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* IpLevel1 generated by hbm2java
*/
@Entity
@Table(name="IP_MASK_DISPLAY"
) 

public class IpMaskDisplay implements java.io.Serializable ,Cloneable{


    private Integer mask;
    private Integer length;
    private Integer digit;
    private Integer subnet;

	public IpMaskDisplay() {
	}
  
	@Override
    public Object clone() throws CloneNotSupportedException
    {
		IpMaskDisplay another = (IpMaskDisplay) super.clone();
        return another;
    }


	@Id 
	@Column(name="MASK", unique=true, nullable=false)
	public Integer getMask() {
		return mask;
	}


	public void setMask(Integer mask) {
		this.mask = mask;
	}

	@Column(name="LENGTH")
	public Integer getLength() {
		return length;
	}


	public void setLength(Integer length) {
		this.length = length;
	}

	@Column(name="DIGIT")
	public Integer getDigit() {
		return digit;
	}


	public void setDigit(Integer digit) {
		this.digit = digit;
	}

	@Column(name="SUBNET")
	public Integer getSubnet() {
		return subnet;
	}


	public void setSubnet(Integer subnet) {
		this.subnet = subnet;
	}
}





