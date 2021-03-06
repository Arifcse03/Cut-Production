package mnj.ont.model.lov.views;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Feb 19 16:30:59 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class popupVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        BpoId {
            public Object get(popupVORowImpl obj) {
                return obj.getBpoId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setBpoId((Number)value);
            }
        }
        ,
        StnSequence {
            public Object get(popupVORowImpl obj) {
                return obj.getStnSequence();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setStnSequence((Number)value);
            }
        }
        ,
        WipEntityId {
            public Object get(popupVORowImpl obj) {
                return obj.getWipEntityId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setWipEntityId((Number)value);
            }
        }
        ,
        Style {
            public Object get(popupVORowImpl obj) {
                return obj.getStyle();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        Bpo {
            public Object get(popupVORowImpl obj) {
                return obj.getBpo();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setBpo((String)value);
            }
        }
        ,
        ItemDescription {
            public Object get(popupVORowImpl obj) {
                return obj.getItemDescription();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setItemDescription((String)value);
            }
        }
        ,
        OrderedQty {
            public Object get(popupVORowImpl obj) {
                return obj.getOrderedQty();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setOrderedQty((Number)value);
            }
        }
        ,
        ExtraPer {
            public Object get(popupVORowImpl obj) {
                return obj.getExtraPer();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setExtraPer((Number)value);
            }
        }
        ,
        CutPlanNo {
            public Object get(popupVORowImpl obj) {
                return obj.getCutPlanNo();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setCutPlanNo((String)value);
            }
        }
        ,
        BelanceProduction {
            public Object get(popupVORowImpl obj) {
                return obj.getBelanceProduction();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setBelanceProduction((Number)value);
            }
        }
        ,
        PreviousProduction {
            public Object get(popupVORowImpl obj) {
                return obj.getPreviousProduction();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setPreviousProduction((Number)value);
            }
        }
        ,
        PocId {
            public Object get(popupVORowImpl obj) {
                return obj.getPocId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setPocId((Number)value);
            }
        }
        ,
        StyleName {
            public Object get(popupVORowImpl obj) {
                return obj.getStyleName();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setStyleName((String)value);
            }
        }
        ,
        BpoNo {
            public Object get(popupVORowImpl obj) {
                return obj.getBpoNo();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setBpoNo((String)value);
            }
        }
        ,
        RatioplanId {
            public Object get(popupVORowImpl obj) {
                return obj.getRatioplanId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setRatioplanId((Number)value);
            }
        }
        ,
        Stn {
            public Object get(popupVORowImpl obj) {
                return obj.getStn();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setStn((String)value);
            }
        }
        ,
        OrderNumber {
            public Object get(popupVORowImpl obj) {
                return obj.getOrderNumber();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setOrderNumber((Number)value);
            }
        }
        ,
        HeaderId {
            public Object get(popupVORowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        OrgId {
            public Object get(popupVORowImpl obj) {
                return obj.getOrgId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setOrgId((Number)value);
            }
        }
        ,
        OrderedItem {
            public Object get(popupVORowImpl obj) {
                return obj.getOrderedItem();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setOrderedItem((String)value);
            }
        }
        ,
        InventoryItemId {
            public Object get(popupVORowImpl obj) {
                return obj.getInventoryItemId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setInventoryItemId((Number)value);
            }
        }
        ,
        PrevProd {
            public Object get(popupVORowImpl obj) {
                return obj.getPrevProd();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setPrevProd((Number)value);
            }
        }
        ,
        Season {
            public Object get(popupVORowImpl obj) {
                return obj.getSeason();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setSeason((String)value);
            }
        }
        ,
        BuyerId {
            public Object get(popupVORowImpl obj) {
                return obj.getBuyerId();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        ExtraCutPercent {
            public Object get(popupVORowImpl obj) {
                return obj.getExtraCutPercent();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setExtraCutPercent((Number)value);
            }
        }
        ,
        ProdQty {
            public Object get(popupVORowImpl obj) {
                return obj.getProdQty();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setProdQty((Number)value);
            }
        }
        ,
        BelQty {
            public Object get(popupVORowImpl obj) {
                return obj.getBelQty();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setBelQty((Number)value);
            }
        }
        ,
        MultiSelect {
            public Object get(popupVORowImpl obj) {
                return obj.getMultiSelect();
            }

            public void put(popupVORowImpl obj, Object value) {
                obj.setMultiSelect((Boolean)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(popupVORowImpl object);

        public abstract void put(popupVORowImpl object, Object value);

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


    public static final int BPOID = AttributesEnum.BpoId.index();
    public static final int STNSEQUENCE = AttributesEnum.StnSequence.index();
    public static final int WIPENTITYID = AttributesEnum.WipEntityId.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int BPO = AttributesEnum.Bpo.index();
    public static final int ITEMDESCRIPTION = AttributesEnum.ItemDescription.index();
    public static final int ORDEREDQTY = AttributesEnum.OrderedQty.index();
    public static final int EXTRAPER = AttributesEnum.ExtraPer.index();
    public static final int CUTPLANNO = AttributesEnum.CutPlanNo.index();
    public static final int BELANCEPRODUCTION = AttributesEnum.BelanceProduction.index();
    public static final int PREVIOUSPRODUCTION = AttributesEnum.PreviousProduction.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int STYLENAME = AttributesEnum.StyleName.index();
    public static final int BPONO = AttributesEnum.BpoNo.index();
    public static final int RATIOPLANID = AttributesEnum.RatioplanId.index();
    public static final int STN = AttributesEnum.Stn.index();
    public static final int ORDERNUMBER = AttributesEnum.OrderNumber.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int ORGID = AttributesEnum.OrgId.index();
    public static final int ORDEREDITEM = AttributesEnum.OrderedItem.index();
    public static final int INVENTORYITEMID = AttributesEnum.InventoryItemId.index();
    public static final int PREVPROD = AttributesEnum.PrevProd.index();
    public static final int SEASON = AttributesEnum.Season.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int EXTRACUTPERCENT = AttributesEnum.ExtraCutPercent.index();
    public static final int PRODQTY = AttributesEnum.ProdQty.index();
    public static final int BELQTY = AttributesEnum.BelQty.index();
    public static final int MULTISELECT = AttributesEnum.MultiSelect.index();

    /**
     * This is the default constructor (do not remove).
     */
    public popupVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute BpoId.
     * @return the BpoId
     */
    public Number getBpoId() {
        return (Number) getAttributeInternal(BPOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BpoId.
     * @param value value to set the  BpoId
     */
    public void setBpoId(Number value) {
        setAttributeInternal(BPOID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StyleName.
     * @return the StyleName
     */
    public String getStyleName() {
        return (String) getAttributeInternal(STYLENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StyleName.
     * @param value value to set the  StyleName
     */
    public void setStyleName(String value) {
        setAttributeInternal(STYLENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute WipEntityId.
     * @return the WipEntityId
     */
    public Number getWipEntityId() {
        return (Number) getAttributeInternal(WIPENTITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute WipEntityId.
     * @param value value to set the  WipEntityId
     */
    public void setWipEntityId(Number value) {
        setAttributeInternal(WIPENTITYID, value);
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
     * Gets the attribute value for the calculated attribute Bpo.
     * @return the Bpo
     */
    public String getBpo() {
        return (String) getAttributeInternal(BPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Bpo.
     * @param value value to set the  Bpo
     */
    public void setBpo(String value) {
        setAttributeInternal(BPO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BpoNo.
     * @return the BpoNo
     */
    public String getBpoNo() {
        return (String) getAttributeInternal(BPONO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BpoNo.
     * @param value value to set the  BpoNo
     */
    public void setBpoNo(String value) {
        setAttributeInternal(BPONO, value);
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
     * Gets the attribute value for the calculated attribute Stn.
     * @return the Stn
     */
    public String getStn() {
        return (String) getAttributeInternal(STN);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Stn.
     * @param value value to set the  Stn
     */
    public void setStn(String value) {
        setAttributeInternal(STN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute StnSequence.
     * @return the StnSequence
     */
    public Number getStnSequence() {
        return (Number) getAttributeInternal(STNSEQUENCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute StnSequence.
     * @param value value to set the  StnSequence
     */
    public void setStnSequence(Number value) {
        setAttributeInternal(STNSEQUENCE, value);
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
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrgId.
     * @return the OrgId
     */
    public Number getOrgId() {
        return (Number) getAttributeInternal(ORGID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrgId.
     * @param value value to set the  OrgId
     */
    public void setOrgId(Number value) {
        setAttributeInternal(ORGID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ItemDescription.
     * @return the ItemDescription
     */
    public String getItemDescription() {
        return (String) getAttributeInternal(ITEMDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ItemDescription.
     * @param value value to set the  ItemDescription
     */
    public void setItemDescription(String value) {
        setAttributeInternal(ITEMDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderedItem.
     * @return the OrderedItem
     */
    public String getOrderedItem() {
        return (String) getAttributeInternal(ORDEREDITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderedItem.
     * @param value value to set the  OrderedItem
     */
    public void setOrderedItem(String value) {
        setAttributeInternal(ORDEREDITEM, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OrderedQty.
     * @return the OrderedQty
     */
    public Number getOrderedQty() {
        return (Number) getAttributeInternal(ORDEREDQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute OrderedQty.
     * @param value value to set the  OrderedQty
     */
    public void setOrderedQty(Number value) {
        setAttributeInternal(ORDEREDQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtraCutPercent.
     * @return the ExtraCutPercent
     */
    public Number getExtraCutPercent() {
        return (Number) getAttributeInternal(EXTRACUTPERCENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExtraCutPercent.
     * @param value value to set the  ExtraCutPercent
     */
    public void setExtraCutPercent(Number value) {
        setAttributeInternal(EXTRACUTPERCENT, value);
    }

    /**
     * Gets the attribute value for the calculated attribute ExtraPer.
     * @return the ExtraPer
     */
    public Number getExtraPer() {
        return (Number) getAttributeInternal(EXTRAPER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ExtraPer.
     * @param value value to set the  ExtraPer
     */
    public void setExtraPer(Number value) {
        setAttributeInternal(EXTRAPER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PrevProd.
     * @return the PrevProd
     */
    public Number getPrevProd() {
        return (Number) getAttributeInternal(PREVPROD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PrevProd.
     * @param value value to set the  PrevProd
     */
    public void setPrevProd(Number value) {
        setAttributeInternal(PREVPROD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CutPlanNo.
     * @return the CutPlanNo
     */
    public String getCutPlanNo() {
        return (String) getAttributeInternal(CUTPLANNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CutPlanNo.
     * @param value value to set the  CutPlanNo
     */
    public void setCutPlanNo(String value) {
        setAttributeInternal(CUTPLANNO, value);
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
     * Gets the attribute value for the calculated attribute ProdQty.
     * @return the ProdQty
     */
    public Number getProdQty() {
        return (Number) getAttributeInternal(PRODQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProdQty.
     * @param value value to set the  ProdQty
     */
    public void setProdQty(Number value) {
        setAttributeInternal(PRODQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BelQty.
     * @return the BelQty
     */
    public Number getBelQty() {
        return (Number) getAttributeInternal(BELQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BelQty.
     * @param value value to set the  BelQty
     */
    public void setBelQty(Number value) {
        setAttributeInternal(BELQTY, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PreviousProduction.
     * @return the PreviousProduction
     */
    public Number getPreviousProduction() {
        return (Number) getAttributeInternal(PREVIOUSPRODUCTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PreviousProduction.
     * @param value value to set the  PreviousProduction
     */
    public void setPreviousProduction(Number value) {
        setAttributeInternal(PREVIOUSPRODUCTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PocId.
     * @return the PocId
     */
    public Number getPocId() {
        return (Number) getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute PocId.
     * @param value value to set the  PocId
     */
    public void setPocId(Number value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BelanceProduction.
     * @return the BelanceProduction
     */
    public Number getBelanceProduction() {
        return (Number) getAttributeInternal(BELANCEPRODUCTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute BelanceProduction.
     * @param value value to set the  BelanceProduction
     */
    public void setBelanceProduction(Number value) {
        setAttributeInternal(BELANCEPRODUCTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MultiSelect.
     * @return the MultiSelect
     */
    public Boolean getMultiSelect() {
        return (Boolean) getAttributeInternal(MULTISELECT);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute MultiSelect.
     * @param value value to set the  MultiSelect
     */
    public void setMultiSelect(Boolean value) {
        setAttributeInternal(MULTISELECT, value);
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
