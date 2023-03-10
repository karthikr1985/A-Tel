package th.co.ais.ipfm.domain1;
// Generated 27 ?.?. 2553, 17:13:55 by Hibernate Tools 3.2.1.GA


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import th.co.ais.ipfm.domain.MasterDomain;

/**
 * IpFunction generated by hbm2java
 */
@Entity
@Table(name="IP_FUNCTION"
    , uniqueConstraints = @UniqueConstraint(columnNames="ROW_ID") 
)
public class IpFunction extends MasterDomain implements java.io.Serializable , Cloneable {


     /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
	 private String funcId;
     private Long version;
     private String funcName;
     private Integer menuLevel;
     private Integer menuSeq;
     private String funcMatherId;
     private String programId;
     private String actionUrl;
     private String rowId;

    public IpFunction() {
    }

	
    public IpFunction(String funcId) {
        this.funcId = funcId;
    }
    public IpFunction(String funcId, String funcName, Integer menuLevel, Integer menuSeq, String funcMatherId, String programId, String actionUrl, String statusAdd, String statusUpdate, String statusDelete, String statusView, String statusAdvance, String rowId) {
       this.funcId = funcId;
       this.funcName = funcName;
       this.menuLevel = menuLevel;
       this.menuSeq = menuSeq;
       this.funcMatherId = funcMatherId;
       this.programId = programId;
       this.actionUrl = actionUrl;
       this.rowId = rowId;
    }
   
     @Id 
    
    @Column(name="FUNC_ID", unique=true, nullable=false, length=10)
    public String getFuncId() {
        return this.funcId;
    }
    
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }
    @Version
    @Column(name="VERSION", precision=10, scale=0)
    public Long getVersion() {
        return this.version;
    }
    
    public void setVersion(Long version) {
        this.version = version;
    }
    
    @Column(name="FUNC_NAME", length=100)
    public String getFuncName() {
        return this.funcName;
    }
    
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }
    
    @Column(name="MENU_LEVEL", precision=22, scale=0)
    public Integer getMenuLevel() {
        return this.menuLevel;
    }
    
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }
    
    @Column(name="MENU_SEQ", precision=22, scale=0)
    public Integer getMenuSeq() {
        return this.menuSeq;
    }
    
    public void setMenuSeq(Integer menuSeq) {
        this.menuSeq = menuSeq;
    }
    
    @Column(name="FUNC_MATHER_ID", length=10)
    public String getFuncMatherId() {
        return this.funcMatherId;
    }
    
    public void setFuncMatherId(String funcMatherId) {
        this.funcMatherId = funcMatherId;
    }
    
    @Column(name="PROGRAM_ID", length=20)
    public String getProgramId() {
        return this.programId;
    }
    
    public void setProgramId(String programId) {
        this.programId = programId;
    }
    
    @Column(name="ACTION_URL", length=1000)
    public String getActionUrl() {
        return this.actionUrl;
    }
    
    public void setActionUrl(String actionUrl) {
        this.actionUrl = actionUrl;
    }
    
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
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
		IpFunction another = (IpFunction) super.clone();
        //? take care of any deep copies to be made here
        return another;
    }


}


