package mnj.ont.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jun 26 17:38:28 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CutNoLovRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        RatioplanId {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getRatioplanId();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setRatioplanId((Number)value);
            }
        }
        ,
        CutNumber {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getCutNumber();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setCutNumber((String)value);
            }
        }
        ,
        TotalRatio {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getTotalRatio();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setTotalRatio((Number)value);
            }
        }
        ,
        Fabricwidth {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getFabricwidth();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setFabricwidth((String)value);
            }
        }
        ,
        Markerlength {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getMarkerlength();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setMarkerlength((Number)value);
            }
        }
        ,
        ExtraMtr {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getExtraMtr();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setExtraMtr((Number)value);
            }
        }
        ,
        FabricPattern {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getFabricPattern();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setFabricPattern((String)value);
            }
        }
        ,
        Cf {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getCf();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setCf((Number)value);
            }
        }
        ,
        PlylineId {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getPlylineId();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setPlylineId((Number)value);
            }
        }
        ,
        OrderLineId {
            public Object get(CutNoLovRowImpl obj) {
                return obj.getOrderLineId();
            }

            public void put(CutNoLovRowImpl obj, Object value) {
                obj.setOrderLineId((Number)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(CutNoLovRowImpl object);

        public abstract void put(CutNoLovRowImpl object, Object value);

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


    public static final int RATIOPLANID = AttributesEnum.RatioplanId.index();
    public static final int CUTNUMBER = AttributesEnum.CutNumber.index();
    public static final int TOTALRATIO = AttributesEnum.TotalRatio.index();
    public static final int FABRICWIDTH = AttributesEnum.Fabricwidth.index();
    public static final int MARKERLENGTH = AttributesEnum.Markerlength.index();
    public static final int EXTRAMTR = AttributesEnum.ExtraMtr.index();
    public static final int FABRICPATTERN = AttributesEnum.FabricPattern.index();
    public static final int CF = AttributesEnum.Cf.index();
    public static final int PLYLINEID = AttributesEnum.PlylineId.index();
    public static final int ORDERLINEID = AttributesEnum.OrderLineId.index();

    /**
     * This is the default constructor (do not remove).
     */
    public CutNoLovRowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute RatioplanId.
     * @return the RatioplanId
     */
    public Number getRatioplanId() {
        return (Number) getAttributeInternal(RATIOPLANID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RatioplanId.
     * @param value value to set the  RatioplanId
     */
    public void setRatioplanId(Number value) {
        setAttributeInternal(RATIOPLANID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CutNumber.
     * @return the CutNumber
     */
    public String getCutNumber() {
        return (String) getAttributeInternal(CUTNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CutNumber.
     * @param value value to set the  CutNumber
     */
    public void setCutNumber(String value) {
        setAttributeInternal(CUTNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute TotalRatio.
     * @return the TotalRatio
     */
    public Number getTotalRatio() {
        return (Number) getAttributeInternal(TOTALRATIO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute TotalRatio.
     * @param value value to set the  TotalRatio
     */
    public void setTotalRatio(Number value) {
        setAttributeInternal(TOTALRATIO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Fabricwidth.
     * @return the Fabricwidth
     */
    public String getFabricwidth() {
        return (String) getAttributeInternal(FABRICWIDTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Fabricwidth.
     * @param value value to set the  Fabricwidth
     */
    public void setFabricwidth(String value) {
        setAttributeInternal(FABRICWIDTH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Markerlength.
     * @return the Markerlength
     */
    public Number getMarkerlength() {
        return (Number) getAttributeInternal(MARKERLENGTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Markerlength.
     * @param value value to set the  Markerlength
     */
    public void setMarkerlength(Number value) {
        setAttributeInternal(MARKERLENGTH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtraMtr.
     * @return the ExtraMtr
     */
    public Number getExtraMtr() {
        return (Number) getAttributeInternal(EXTRAMTR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExtraMtr.
     * @param value value to set the  ExtraMtr
     */
    public void setExtraMtr(Number value) {
        setAttributeInternal(EXTRAMTR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute FabricPattern.
     * @return the FabricPattern
     */
    public String getFabricPattern() {
        return (String) getAttributeInternal(FABRICPATTERN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute FabricPattern.
     * @param value value to set the  FabricPattern
     */
    public void setFabricPattern(String value) {
        setAttributeInternal(FABRICPATTERN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Cf.
     * @return the Cf
     */
    public Number getCf() {
        return (Number) getAttributeInternal(CF);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Cf.
     * @param value value to set the  Cf
     */
    public void setCf(Number value) {
        setAttributeInternal(CF, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PlylineId.
     * @return the PlylineId
     */
    public Number getPlylineId() {
        return (Number) getAttributeInternal(PLYLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PlylineId.
     * @param value value to set the  PlylineId
     */
    public void setPlylineId(Number value) {
        setAttributeInternal(PLYLINEID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderLineId.
     * @return the OrderLineId
     */
    public Number getOrderLineId() {
        return (Number) getAttributeInternal(ORDERLINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderLineId.
     * @param value value to set the  OrderLineId
     */
    public void setOrderLineId(Number value) {
        setAttributeInternal(ORDERLINEID, value);
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
