package mnj.ont.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 18 19:23:21 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CutNumberLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        CutNo {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getCutNo();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setCutNo((String)value);
            }
        }
        ,
        NoOfPly {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getNoOfPly();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setNoOfPly((Number)value);
            }
        }
        ,
        RatioplanNumber {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getRatioplanNumber();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setRatioplanNumber((String)value);
            }
        }
        ,
        Style {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getStyle();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Season {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getSeason();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        BuyerName {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getBuyerName();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setBuyerName((String)value);
            }
        }
        ,
        CutQty {
            public Object get(CutNumberLOVRowImpl obj) {
                return obj.getCutQty();
            }

            public void put(CutNumberLOVRowImpl obj, Object value) {
                obj.setCutQty((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CutNumberLOVRowImpl object);

        public abstract void put(CutNumberLOVRowImpl object, Object value);

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


    public static final int CUTNO = AttributesEnum.CutNo.index();
    public static final int NOOFPLY = AttributesEnum.NoOfPly.index();
    public static final int RATIOPLANNUMBER = AttributesEnum.RatioplanNumber.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int BUYERNAME = AttributesEnum.BuyerName.index();
    public static final int CUTQTY = AttributesEnum.CutQty.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CutNumberLOVRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CutNo.
     * @return the CutNo
     */
    public String getCutNo() {
        return (String) getAttributeInternal(CUTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CutNo.
     * @param value value to set the  CutNo
     */
    public void setCutNo(String value) {
        setAttributeInternal(CUTNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute NoOfPly.
     * @return the NoOfPly
     */
    public Number getNoOfPly() {
        return (Number) getAttributeInternal(NOOFPLY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute NoOfPly.
     * @param value value to set the  NoOfPly
     */
    public void setNoOfPly(Number value) {
        setAttributeInternal(NOOFPLY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute RatioplanNumber.
     * @return the RatioplanNumber
     */
    public String getRatioplanNumber() {
        return (String) getAttributeInternal(RATIOPLANNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RatioplanNumber.
     * @param value value to set the  RatioplanNumber
     */
    public void setRatioplanNumber(String value) {
        setAttributeInternal(RATIOPLANNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Style.
     * @return the Style
     */
    public String getStyle() {
        return (String) getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Style.
     * @param value value to set the  Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Season.
     * @return the Season
     */
    public String getSeason() {
        return (String) getAttributeInternal(SEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Season.
     * @param value value to set the  Season
     */
    public void setSeason(String value) {
        setAttributeInternal(SEASON, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerName.
     * @return the BuyerName
     */
    public String getBuyerName() {
        return (String) getAttributeInternal(BUYERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerName.
     * @param value value to set the  BuyerName
     */
    public void setBuyerName(String value) {
        setAttributeInternal(BUYERNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CutQty.
     * @return the CutQty
     */
    public Number getCutQty() {
        return (Number) getAttributeInternal(CUTQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CutQty.
     * @param value value to set the  CutQty
     */
    public void setCutQty(Number value) {
        setAttributeInternal(CUTQTY, value);
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
}
