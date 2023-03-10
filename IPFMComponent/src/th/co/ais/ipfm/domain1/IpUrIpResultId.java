package th.co.ais.ipfm.domain1;

// Generated 9 �.�. 2553, 12:00:07 by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IpUrIpResultId generated by hbm2java
 */
@Embeddable
public class IpUrIpResultId  implements java.io.Serializable {


     private String urNo;
     private BigDecimal seq;

    public IpUrIpResultId() {
    }

    public IpUrIpResultId(String urNo, BigDecimal seq) {
       this.urNo = urNo;
       this.seq = seq;
    }
   

    @Column(name="UR_NO", nullable=false, length=20)
    public String getUrNo() {
        return this.urNo;
    }
    
    public void setUrNo(String urNo) {
        this.urNo = urNo;
    }

    @Column(name="SEQ", nullable=false, precision=22, scale=0)
    public BigDecimal getSeq() {
        return this.seq;
    }
    
    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof IpUrIpResultId) ) return false;
		 IpUrIpResultId castOther = ( IpUrIpResultId ) other; 
         
		 return ( (this.getUrNo()==castOther.getUrNo()) || ( this.getUrNo()!=null && castOther.getUrNo()!=null && this.getUrNo().equals(castOther.getUrNo()) ) )
 && ( (this.getSeq()==castOther.getSeq()) || ( this.getSeq()!=null && castOther.getSeq()!=null && this.getSeq().equals(castOther.getSeq()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUrNo() == null ? 0 : this.getUrNo().hashCode() );
         result = 37 * result + ( getSeq() == null ? 0 : this.getSeq().hashCode() );
         return result;
   }   


}


