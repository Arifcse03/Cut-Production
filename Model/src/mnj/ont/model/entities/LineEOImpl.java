package mnj.ont.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Mar 24 13:37:56 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class LineEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DivisionId {
            public Object get(LineEOImpl obj) {
                return obj.getDivisionId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setDivisionId((String)value);
            }
        }
        ,
        RangeId {
            public Object get(LineEOImpl obj) {
                return obj.getRangeId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setRangeId((Number)value);
            }
        }
        ,
        RlineId {
            public Object get(LineEOImpl obj) {
                return obj.getRlineId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setRlineId((Number)value);
            }
        }
        ,
        FabjobId {
            public Object get(LineEOImpl obj) {
                return obj.getFabjobId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setFabjobId((String)value);
            }
        }
        ,
        LotId {
            public Object get(LineEOImpl obj) {
                return obj.getLotId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setLotId((String)value);
            }
        }
        ,
        Shade {
            public Object get(LineEOImpl obj) {
                return obj.getShade();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setShade((String)value);
            }
        }
        ,
        TotalPly {
            public Object get(LineEOImpl obj) {
                return obj.getTotalPly();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setTotalPly((Number)value);
            }
        }
        ,
        Fabcons {
            public Object get(LineEOImpl obj) {
                return obj.getFabcons();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setFabcons((Number)value);
            }
        }
        ,
        Plyform {
            public Object get(LineEOImpl obj) {
                return obj.getPlyform();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setPlyform((Number)value);
            }
        }
        ,
        Plyto {
            public Object get(LineEOImpl obj) {
                return obj.getPlyto();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setPlyto((Number)value);
            }
        }
        ,
        TotalPcs {
            public Object get(LineEOImpl obj) {
                return obj.getTotalPcs();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setTotalPcs((Number)value);
            }
        }
        ,
        PoNo {
            public Object get(LineEOImpl obj) {
                return obj.getPoNo();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setPoNo((String)value);
            }
        }
        ,
        FabricType {
            public Object get(LineEOImpl obj) {
                return obj.getFabricType();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setFabricType((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(LineEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(LineEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(LineEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreatedBy {
            public Object get(LineEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        RangeoblineId {
            public Object get(LineEOImpl obj) {
                return obj.getRangeoblineId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setRangeoblineId((Number)value);
            }
        }
        ,
        IssueStatus {
            public Object get(LineEOImpl obj) {
                return obj.getIssueStatus();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setIssueStatus((String)value);
            }
        }
        ,
        LocatorId {
            public Object get(LineEOImpl obj) {
                return obj.getLocatorId();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setLocatorId((Number)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(LineEOImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setLastUpdateLogin((Number)value);
            }
        }
        ,
        Attribute1 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute1();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute1((String)value);
            }
        }
        ,
        Attribute2 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute2();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute2((String)value);
            }
        }
        ,
        Attribute3 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute3();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute3((String)value);
            }
        }
        ,
        Attribute4 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute4();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute4((String)value);
            }
        }
        ,
        Attribute5 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute5();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute5((String)value);
            }
        }
        ,
        Attribute6 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute6();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute6((String)value);
            }
        }
        ,
        Attribute7 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute7();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute7((String)value);
            }
        }
        ,
        Attribute8 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute8();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute8((String)value);
            }
        }
        ,
        Attribute9 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute9();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute9((String)value);
            }
        }
        ,
        Attribute10 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute10();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute10((String)value);
            }
        }
        ,
        Attribute11 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute11();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute11((String)value);
            }
        }
        ,
        Attribute12 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute12();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute12((String)value);
            }
        }
        ,
        Attribute13 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute13();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute13((String)value);
            }
        }
        ,
        Attribute14 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute14();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute14((String)value);
            }
        }
        ,
        Attribute15 {
            public Object get(LineEOImpl obj) {
                return obj.getAttribute15();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setAttribute15((String)value);
            }
        }
        ,
        OnhandQuantity {
            public Object get(LineEOImpl obj) {
                return obj.getOnhandQuantity();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setOnhandQuantity((Number)value);
            }
        }
        ,
        HederEO {
            public Object get(LineEOImpl obj) {
                return obj.getHederEO();
            }

            public void put(LineEOImpl obj, Object value) {
                obj.setHederEO((HederEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(LineEOImpl object);

        public abstract void put(LineEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DIVISIONID = AttributesEnum.DivisionId.index();
    public static final int RANGEID = AttributesEnum.RangeId.index();
    public static final int RLINEID = AttributesEnum.RlineId.index();
    public static final int FABJOBID = AttributesEnum.FabjobId.index();
    public static final int LOTID = AttributesEnum.LotId.index();
    public static final int SHADE = AttributesEnum.Shade.index();
    public static final int TOTALPLY = AttributesEnum.TotalPly.index();
    public static final int FABCONS = AttributesEnum.Fabcons.index();
    public static final int PLYFORM = AttributesEnum.Plyform.index();
    public static final int PLYTO = AttributesEnum.Plyto.index();
    public static final int TOTALPCS = AttributesEnum.TotalPcs.index();
    public static final int PONO = AttributesEnum.PoNo.index();
    public static final int FABRICTYPE = AttributesEnum.FabricType.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int RANGEOBLINEID = AttributesEnum.RangeoblineId.index();
    public static final int ISSUESTATUS = AttributesEnum.IssueStatus.index();
    public static final int LOCATORID = AttributesEnum.LocatorId.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int ATTRIBUTE1 = AttributesEnum.Attribute1.index();
    public static final int ATTRIBUTE2 = AttributesEnum.Attribute2.index();
    public static final int ATTRIBUTE3 = AttributesEnum.Attribute3.index();
    public static final int ATTRIBUTE4 = AttributesEnum.Attribute4.index();
    public static final int ATTRIBUTE5 = AttributesEnum.Attribute5.index();
    public static final int ATTRIBUTE6 = AttributesEnum.Attribute6.index();
    public static final int ATTRIBUTE7 = AttributesEnum.Attribute7.index();
    public static final int ATTRIBUTE8 = AttributesEnum.Attribute8.index();
    public static final int ATTRIBUTE9 = AttributesEnum.Attribute9.index();
    public static final int ATTRIBUTE10 = AttributesEnum.Attribute10.index();
    public static final int ATTRIBUTE11 = AttributesEnum.Attribute11.index();
    public static final int ATTRIBUTE12 = AttributesEnum.Attribute12.index();
    public static final int ATTRIBUTE13 = AttributesEnum.Attribute13.index();
    public static final int ATTRIBUTE14 = AttributesEnum.Attribute14.index();
    public static final int ATTRIBUTE15 = AttributesEnum.Attribute15.index();
    public static final int ONHANDQUANTITY = AttributesEnum.OnhandQuantity.index();
    public static final int HEDEREO = AttributesEnum.HederEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public LineEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.ont.model.entities.LineEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DivisionId, using the alias name DivisionId.
     * @return the DivisionId
     */
    public String getDivisionId() {
        return (String)getAttributeInternal(DIVISIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DivisionId.
     * @param value value to set the DivisionId
     */
    public void setDivisionId(String value) {
        setAttributeInternal(DIVISIONID, value);
    }

    /**
     * Gets the attribute value for RangeId, using the alias name RangeId.
     * @return the RangeId
     */
    public Number getRangeId() {
        return (Number)getAttributeInternal(RANGEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RangeId.
     * @param value value to set the RangeId
     */
    public void setRangeId(Number value) {
        setAttributeInternal(RANGEID, value);
    }

    /**
     * Gets the attribute value for RlineId, using the alias name RlineId.
     * @return the RlineId
     */
    public Number getRlineId() {
        return (Number)getAttributeInternal(RLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RlineId.
     * @param value value to set the RlineId
     */
    public void setRlineId(Number value) {
        setAttributeInternal(RLINEID, value);
    }

    /**
     * Gets the attribute value for FabjobId, using the alias name FabjobId.
     * @return the FabjobId
     */
    public String getFabjobId() {
        return (String)getAttributeInternal(FABJOBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabjobId.
     * @param value value to set the FabjobId
     */
    public void setFabjobId(String value) {
        setAttributeInternal(FABJOBID, value);
    }

    /**
     * Gets the attribute value for LotId, using the alias name LotId.
     * @return the LotId
     */
    public String getLotId() {
        return (String)getAttributeInternal(LOTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LotId.
     * @param value value to set the LotId
     */
    public void setLotId(String value) {
        setAttributeInternal(LOTID, value);
    }

    /**
     * Gets the attribute value for Shade, using the alias name Shade.
     * @return the Shade
     */
    public String getShade() {
        return (String)getAttributeInternal(SHADE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shade.
     * @param value value to set the Shade
     */
    public void setShade(String value) {
        setAttributeInternal(SHADE, value);
    }

    /**
     * Gets the attribute value for TotalPly, using the alias name TotalPly.
     * @return the TotalPly
     */
    public Number getTotalPly() {
        return (Number)getAttributeInternal(TOTALPLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalPly.
     * @param value value to set the TotalPly
     */
    public void setTotalPly(Number value) {
        setAttributeInternal(TOTALPLY, value);
    }

    /**
     * Gets the attribute value for Fabcons, using the alias name Fabcons.
     * @return the Fabcons
     */
    public Number getFabcons() {
        return (Number)getAttributeInternal(FABCONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Fabcons.
     * @param value value to set the Fabcons
     */
    public void setFabcons(Number value) {
        setAttributeInternal(FABCONS, value);
    }

    /**
     * Gets the attribute value for Plyform, using the alias name Plyform.
     * @return the Plyform
     */
    public Number getPlyform() {
        return (Number)getAttributeInternal(PLYFORM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Plyform.
     * @param value value to set the Plyform
     */
    public void setPlyform(Number value) {
        setAttributeInternal(PLYFORM, value);
    }

    /**
     * Gets the attribute value for Plyto, using the alias name Plyto.
     * @return the Plyto
     */
    public Number getPlyto() {
        return (Number)getAttributeInternal(PLYTO);
    }

    /**
     * Sets <code>value</code> as the attribute value for Plyto.
     * @param value value to set the Plyto
     */
    public void setPlyto(Number value) {
        setAttributeInternal(PLYTO, value);
    }

    /**
     * Gets the attribute value for TotalPcs, using the alias name TotalPcs.
     * @return the TotalPcs
     */
    public Number getTotalPcs() {
        return (Number)getAttributeInternal(TOTALPCS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalPcs.
     * @param value value to set the TotalPcs
     */
    public void setTotalPcs(Number value) {
        setAttributeInternal(TOTALPCS, value);
    }

    /**
     * Gets the attribute value for PoNo, using the alias name PoNo.
     * @return the PoNo
     */
    public String getPoNo() {
        return (String)getAttributeInternal(PONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PoNo.
     * @param value value to set the PoNo
     */
    public void setPoNo(String value) {
        setAttributeInternal(PONO, value);
    }

    /**
     * Gets the attribute value for FabricType, using the alias name FabricType.
     * @return the FabricType
     */
    public String getFabricType() {
        return (String)getAttributeInternal(FABRICTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabricType.
     * @param value value to set the FabricType
     */
    public void setFabricType(String value) {
        setAttributeInternal(FABRICTYPE, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for RangeoblineId, using the alias name RangeoblineId.
     * @return the RangeoblineId
     */
    public Number getRangeoblineId() {
        return (Number)getAttributeInternal(RANGEOBLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RangeoblineId.
     * @param value value to set the RangeoblineId
     */
    public void setRangeoblineId(Number value) {
        setAttributeInternal(RANGEOBLINEID, value);
    }

    /**
     * Gets the attribute value for IssueStatus, using the alias name IssueStatus.
     * @return the IssueStatus
     */
    public String getIssueStatus() {
        return (String)getAttributeInternal(ISSUESTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for IssueStatus.
     * @param value value to set the IssueStatus
     */
    public void setIssueStatus(String value) {
        setAttributeInternal(ISSUESTATUS, value);
    }

    /**
     * Gets the attribute value for LocatorId, using the alias name LocatorId.
     * @return the LocatorId
     */
    public Number getLocatorId() {
        return (Number)getAttributeInternal(LOCATORID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocatorId.
     * @param value value to set the LocatorId
     */
    public void setLocatorId(Number value) {
        setAttributeInternal(LOCATORID, value);
    }

    /**
     * Gets the attribute value for LastUpdateLogin, using the alias name LastUpdateLogin.
     * @return the LastUpdateLogin
     */
    public Number getLastUpdateLogin() {
        return (Number)getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateLogin.
     * @param value value to set the LastUpdateLogin
     */
    public void setLastUpdateLogin(Number value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for Attribute1, using the alias name Attribute1.
     * @return the Attribute1
     */
    public String getAttribute1() {
        return (String)getAttributeInternal(ATTRIBUTE1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute1.
     * @param value value to set the Attribute1
     */
    public void setAttribute1(String value) {
        setAttributeInternal(ATTRIBUTE1, value);
    }

    /**
     * Gets the attribute value for Attribute2, using the alias name Attribute2.
     * @return the Attribute2
     */
    public String getAttribute2() {
        return (String)getAttributeInternal(ATTRIBUTE2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute2.
     * @param value value to set the Attribute2
     */
    public void setAttribute2(String value) {
        setAttributeInternal(ATTRIBUTE2, value);
    }

    /**
     * Gets the attribute value for Attribute3, using the alias name Attribute3.
     * @return the Attribute3
     */
    public String getAttribute3() {
        return (String)getAttributeInternal(ATTRIBUTE3);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute3.
     * @param value value to set the Attribute3
     */
    public void setAttribute3(String value) {
        setAttributeInternal(ATTRIBUTE3, value);
    }

    /**
     * Gets the attribute value for Attribute4, using the alias name Attribute4.
     * @return the Attribute4
     */
    public String getAttribute4() {
        return (String)getAttributeInternal(ATTRIBUTE4);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute4.
     * @param value value to set the Attribute4
     */
    public void setAttribute4(String value) {
        setAttributeInternal(ATTRIBUTE4, value);
    }

    /**
     * Gets the attribute value for Attribute5, using the alias name Attribute5.
     * @return the Attribute5
     */
    public String getAttribute5() {
        return (String)getAttributeInternal(ATTRIBUTE5);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute5.
     * @param value value to set the Attribute5
     */
    public void setAttribute5(String value) {
        setAttributeInternal(ATTRIBUTE5, value);
    }

    /**
     * Gets the attribute value for Attribute6, using the alias name Attribute6.
     * @return the Attribute6
     */
    public String getAttribute6() {
        return (String)getAttributeInternal(ATTRIBUTE6);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute6.
     * @param value value to set the Attribute6
     */
    public void setAttribute6(String value) {
        setAttributeInternal(ATTRIBUTE6, value);
    }

    /**
     * Gets the attribute value for Attribute7, using the alias name Attribute7.
     * @return the Attribute7
     */
    public String getAttribute7() {
        return (String)getAttributeInternal(ATTRIBUTE7);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute7.
     * @param value value to set the Attribute7
     */
    public void setAttribute7(String value) {
        setAttributeInternal(ATTRIBUTE7, value);
    }

    /**
     * Gets the attribute value for Attribute8, using the alias name Attribute8.
     * @return the Attribute8
     */
    public String getAttribute8() {
        return (String)getAttributeInternal(ATTRIBUTE8);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute8.
     * @param value value to set the Attribute8
     */
    public void setAttribute8(String value) {
        setAttributeInternal(ATTRIBUTE8, value);
    }

    /**
     * Gets the attribute value for Attribute9, using the alias name Attribute9.
     * @return the Attribute9
     */
    public String getAttribute9() {
        return (String)getAttributeInternal(ATTRIBUTE9);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute9.
     * @param value value to set the Attribute9
     */
    public void setAttribute9(String value) {
        setAttributeInternal(ATTRIBUTE9, value);
    }

    /**
     * Gets the attribute value for Attribute10, using the alias name Attribute10.
     * @return the Attribute10
     */
    public String getAttribute10() {
        return (String)getAttributeInternal(ATTRIBUTE10);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute10.
     * @param value value to set the Attribute10
     */
    public void setAttribute10(String value) {
        setAttributeInternal(ATTRIBUTE10, value);
    }

    /**
     * Gets the attribute value for Attribute11, using the alias name Attribute11.
     * @return the Attribute11
     */
    public String getAttribute11() {
        return (String)getAttributeInternal(ATTRIBUTE11);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute11.
     * @param value value to set the Attribute11
     */
    public void setAttribute11(String value) {
        setAttributeInternal(ATTRIBUTE11, value);
    }

    /**
     * Gets the attribute value for Attribute12, using the alias name Attribute12.
     * @return the Attribute12
     */
    public String getAttribute12() {
        return (String)getAttributeInternal(ATTRIBUTE12);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute12.
     * @param value value to set the Attribute12
     */
    public void setAttribute12(String value) {
        setAttributeInternal(ATTRIBUTE12, value);
    }

    /**
     * Gets the attribute value for Attribute13, using the alias name Attribute13.
     * @return the Attribute13
     */
    public String getAttribute13() {
        return (String)getAttributeInternal(ATTRIBUTE13);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute13.
     * @param value value to set the Attribute13
     */
    public void setAttribute13(String value) {
        setAttributeInternal(ATTRIBUTE13, value);
    }

    /**
     * Gets the attribute value for Attribute14, using the alias name Attribute14.
     * @return the Attribute14
     */
    public String getAttribute14() {
        return (String)getAttributeInternal(ATTRIBUTE14);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute14.
     * @param value value to set the Attribute14
     */
    public void setAttribute14(String value) {
        setAttributeInternal(ATTRIBUTE14, value);
    }

    /**
     * Gets the attribute value for Attribute15, using the alias name Attribute15.
     * @return the Attribute15
     */
    public String getAttribute15() {
        return (String)getAttributeInternal(ATTRIBUTE15);
    }

    /**
     * Sets <code>value</code> as the attribute value for Attribute15.
     * @param value value to set the Attribute15
     */
    public void setAttribute15(String value) {
        setAttributeInternal(ATTRIBUTE15, value);
    }

    /**
     * Gets the attribute value for OnhandQuantity, using the alias name OnhandQuantity.
     * @return the OnhandQuantity
     */
    public Number getOnhandQuantity() {
        return (Number)getAttributeInternal(ONHANDQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for OnhandQuantity.
     * @param value value to set the OnhandQuantity
     */
    public void setOnhandQuantity(Number value) {
        setAttributeInternal(ONHANDQUANTITY, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity HederEOImpl.
     */
    public HederEOImpl getHederEO() {
        return (HederEOImpl)getAttributeInternal(HEDEREO);
    }

    /**
     * Sets <code>value</code> as the associated entity HederEOImpl.
     */
    public void setHederEO(HederEOImpl value) {
        setAttributeInternal(HEDEREO, value);
    }

    /**
     * @param rangeId key constituent
     * @param rlineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number rangeId, Number rlineId) {
        return new Key(new Object[]{rangeId, rlineId});
    }

    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        Integer empno =Integer.parseInt(new oracle.jbo.server.SequenceImpl("MNJ_MFG_RANGE_RLINE_S", getDBTransaction()).getSequenceNumber().toString());
           oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_RANGE_RLINE_S",getDBTransaction());
           oracle.jbo.domain.Number sVal = s.getSequenceNumber();
           setRlineId(sVal);
    }


}
