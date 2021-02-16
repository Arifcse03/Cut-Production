package mnj.ont.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 28 17:49:50 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RatioPlanNOLOVRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        RatioplanId {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getRatioplanId();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setRatioplanId((Number)value);
            }
        }
        ,
        RatioplanNumber {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getRatioplanNumber();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setRatioplanNumber((Number)value);
            }
        }
        ,
        Inseams {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getInseams();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setInseams((String)value);
            }
        }
        ,
        SalesorderId {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getSalesorderId();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setSalesorderId((Number)value);
            }
        }
        ,
        OrderNumber {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getOrderNumber();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setOrderNumber((Number)value);
            }
        }
        ,
        Description {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getDescription();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setDescription((String)value);
            }
        }
        ,
        Segment2 {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getSegment2();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setSegment2((String)value);
            }
        }
        ,
        InventoryItemId {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getInventoryItemId();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setInventoryItemId((Number)value);
            }
        }
        ,
        DivisionId {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getDivisionId();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setDivisionId((String)value);
            }
        }
        ,
        OrderLineId {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getOrderLineId();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setOrderLineId((Number)value);
            }
        }
        ,
        Obsno {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getObsno();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setObsno((String)value);
            }
        }
        ,
        UserItemDescription {
            public Object get(RatioPlanNOLOVRowImpl obj) {
                return obj.getUserItemDescription();
            }

            public void put(RatioPlanNOLOVRowImpl obj, Object value) {
                obj.setUserItemDescription((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(RatioPlanNOLOVRowImpl object);

        public abstract void put(RatioPlanNOLOVRowImpl object, Object value);

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
   // public static final int SEGMENT2 = AttributesEnum.Segment2.index();


    public static final int RATIOPLANID = AttributesEnum.RatioplanId.index();
    public static final int RATIOPLANNUMBER = AttributesEnum.RatioplanNumber.index();
    public static final int INSEAMS = AttributesEnum.Inseams.index();
    public static final int SALESORDERID = AttributesEnum.SalesorderId.index();
    public static final int ORDERNUMBER = AttributesEnum.OrderNumber.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int SEGMENT2 = AttributesEnum.Segment2.index();
    public static final int INVENTORYITEMID = AttributesEnum.InventoryItemId.index();
    public static final int DIVISIONID = AttributesEnum.DivisionId.index();
    public static final int ORDERLINEID = AttributesEnum.OrderLineId.index();
    public static final int OBSNO = AttributesEnum.Obsno.index();
    public static final int USERITEMDESCRIPTION = AttributesEnum.UserItemDescription.index();

    /**
     * This is the default constructor (do not remove).
     */
    public RatioPlanNOLOVRowImpl() {
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
     * Gets the attribute value for the calculated attribute RatioplanNumber.
     * @return the RatioplanNumber
     */
    public Number getRatioplanNumber() {
        return (Number) getAttributeInternal(RATIOPLANNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RatioplanNumber.
     * @param value value to set the  RatioplanNumber
     */
    public void setRatioplanNumber(Number value) {
        setAttributeInternal(RATIOPLANNUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Obsno.
     * @return the Obsno
     */
    public String getObsno() {
        return (String) getAttributeInternal(OBSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Obsno.
     * @param value value to set the  Obsno
     */
    public void setObsno(String value) {
        setAttributeInternal(OBSNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Inseams.
     * @return the Inseams
     */
    public String getInseams() {
        return (String) getAttributeInternal(INSEAMS);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Inseams.
     * @param value value to set the  Inseams
     */
    public void setInseams(String value) {
        setAttributeInternal(INSEAMS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SalesorderId.
     * @return the SalesorderId
     */
    public Number getSalesorderId() {
        return (Number) getAttributeInternal(SALESORDERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SalesorderId.
     * @param value value to set the  SalesorderId
     */
    public void setSalesorderId(Number value) {
        setAttributeInternal(SALESORDERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderNumber.
     * @return the OrderNumber
     */
    public Number getOrderNumber() {
        return (Number) getAttributeInternal(ORDERNUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderNumber.
     * @param value value to set the  OrderNumber
     */
    public void setOrderNumber(Number value) {
        setAttributeInternal(ORDERNUMBER, value);
    }


    /**
     * Gets the attribute value for the calculated attribute UserItemDescription.
     * @return the UserItemDescription
     */
    public String getUserItemDescription() {
        return (String) getAttributeInternal(USERITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute UserItemDescription.
     * @param value value to set the  UserItemDescription
     */
    public void setUserItemDescription(String value) {
        setAttributeInternal(USERITEMDESCRIPTION, value);
    }


    /**
     * Gets the attribute value for the calculated attribute Segment2.
     * @return the Segment2
     */
//    public String getSegment2() {
//        return (String) getAttributeInternal(SEGMENT2);
//    }
//
//    /**
//     * Sets <code>value</code> as the attribute value for the calculated attribute Segment2.
//     * @param value value to set the  Segment2
//     */
//    public void setSegment2(String value) {
//        setAttributeInternal(SEGMENT2, value);
//    }

    /**
     * Gets the attribute value for the calculated attribute Description.
     * @return the Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Description.
     * @param value value to set the  Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Segment2.
     * @return the Segment2
     */
    public String getSegment2() {
        return (String) getAttributeInternal(SEGMENT2);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Segment2.
     * @param value value to set the  Segment2
     */
    public void setSegment2(String value) {
        setAttributeInternal(SEGMENT2, value);
    }

    /**
     * Gets the attribute value for the calculated attribute InventoryItemId.
     * @return the InventoryItemId
     */
    public Number getInventoryItemId() {
        return (Number) getAttributeInternal(INVENTORYITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute InventoryItemId.
     * @param value value to set the  InventoryItemId
     */
    public void setInventoryItemId(Number value) {
        setAttributeInternal(INVENTORYITEMID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute DivisionId.
     * @return the DivisionId
     */
    public String getDivisionId() {
        return (String) getAttributeInternal(DIVISIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute DivisionId.
     * @param value value to set the  DivisionId
     */
    public void setDivisionId(String value) {
        setAttributeInternal(DIVISIONID, value);
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