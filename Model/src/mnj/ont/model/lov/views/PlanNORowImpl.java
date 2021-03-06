package mnj.ont.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 18 18:56:58 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PlanNORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        RatioplanNumber {
            public Object get(PlanNORowImpl obj) {
                return obj.getRatioplanNumber();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setRatioplanNumber((String)value);
            }
        }
        ,
        Style {
            public Object get(PlanNORowImpl obj) {
                return obj.getStyle();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Color {
            public Object get(PlanNORowImpl obj) {
                return obj.getColor();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        BuyerId {
            public Object get(PlanNORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        Season {
            public Object get(PlanNORowImpl obj) {
                return obj.getSeason();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        RatioPlanQty {
            public Object get(PlanNORowImpl obj) {
                return obj.getRatioPlanQty();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setRatioPlanQty((Number)value);
            }
        }
        ,
        CurrentStyle {
            public Object get(PlanNORowImpl obj) {
                return obj.getCurrentStyle();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setCurrentStyle((String)value);
            }
        }
        ,
        CurrentSeason {
            public Object get(PlanNORowImpl obj) {
                return obj.getCurrentSeason();
            }

            public void put(PlanNORowImpl obj, Object value) {
                obj.setCurrentSeason((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PlanNORowImpl object);

        public abstract void put(PlanNORowImpl object, Object value);

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


    public static final int RATIOPLANNUMBER = AttributesEnum.RatioplanNumber.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int RATIOPLANQTY = AttributesEnum.RatioPlanQty.index();
    public static final int CURRENTSTYLE = AttributesEnum.CurrentStyle.index();
    public static final int CURRENTSEASON = AttributesEnum.CurrentSeason.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PlanNORowImpl() {
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
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number) getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BuyerId.
     * @param value value to set the  BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
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
     * Gets the attribute value for the calculated attribute RatioPlanQty.
     * @return the RatioPlanQty
     */
    public Number getRatioPlanQty() {
        return (Number) getAttributeInternal(RATIOPLANQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RatioPlanQty.
     * @param value value to set the  RatioPlanQty
     */
    public void setRatioPlanQty(Number value) {
        setAttributeInternal(RATIOPLANQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentStyle.
     * @return the CurrentStyle
     */
    public String getCurrentStyle() {
        return (String) getAttributeInternal(CURRENTSTYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentStyle.
     * @param value value to set the  CurrentStyle
     */
    public void setCurrentStyle(String value) {
        setAttributeInternal(CURRENTSTYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CurrentSeason.
     * @return the CurrentSeason
     */
    public String getCurrentSeason() {
        return (String) getAttributeInternal(CURRENTSEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CurrentSeason.
     * @param value value to set the  CurrentSeason
     */
    public void setCurrentSeason(String value) {
        setAttributeInternal(CURRENTSEASON, value);
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
