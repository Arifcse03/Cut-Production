package view.backing_bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import javax.servlet.http.HttpSession;

import mnj.ont.model.services.CuttingProductionAMImpl;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichColumn;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;

import oracle.adfinternal.view.faces.model.binding.FacesCtrlHierNodeBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;

public class Main {
    private RichOutputText p_RatioPln_Id;
    private RichInputListOfValues component_Id;
    private RichColumn p_locatorId;
    private RichColumn p_component_item_id;
    private RichInputText component_itemID;
    private RichInputText rangeID;
    private RichInputText saleOrderLineID;
    private RichInputText ratioPlanIdNew;
    private RichTable cuttingDetailTable;
    private RichInputComboboxListOfValues style;
    private RichInputText cutPlanQuantity;
    private RichInputText buyerId;
    private RichInputListOfValues cutPlanNumber;


    public Main() {
        super();
    }
    
   
    public CuttingProductionAMImpl getAppModuleImpl() {
        DCBindingContainer bindingContainer =
            (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        //BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc =
            bindingContainer.findDataControl("CuttingProductionAMDataControl"); // Name of application module in datacontrolBinding.cpx
        CuttingProductionAMImpl appM = (CuttingProductionAMImpl)dc.getDataProvider();
        return appM;
    }
    CuttingProductionAMImpl am =  getAppModuleImpl();
   
   

    public void setP_RatioPln_Id(RichOutputText p_RatioPln_Id) {
        this.p_RatioPln_Id = p_RatioPln_Id;
        setRationplnIdS(p_RatioPln_Id);
    }

    public RichOutputText getP_RatioPln_Id() {
        return p_RatioPln_Id;
    }
    
    public void setRationplnIdS(RichOutputText id){        
         FacesContext fctx = FacesContext.getCurrentInstance();
         ExternalContext ectx = fctx.getExternalContext();
         HttpSession userSession = (HttpSession) ectx.getSession(false);
         userSession.setAttribute("RationplnIdS", id.getValue());   
     
     }
    
    public void setinventoryIdS(RichInputText id){        
         FacesContext fctx = FacesContext.getCurrentInstance();
         ExternalContext ectx = fctx.getExternalContext();
         HttpSession userSession = (HttpSession) ectx.getSession(false);
         userSession.setAttribute("inventoryIdS", id.getValue());   
     
     }

    public void setComponent_itemID(RichInputText component_itemID) {
        this.component_itemID = component_itemID;
        setinventoryIdS(component_itemID);
    }

    public RichInputText getComponent_itemID() {
        return component_itemID;
    }
    public String Issue() {


        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("IssueToFloor");
        operationBinding.getParamsMap().put("rangeId", getRangeID().getValue());     
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        
        return null;
        
    }

    public void setRangeID(RichInputText rangeID) {
        this.rangeID = rangeID;
    }

    public RichInputText getRangeID() {
        return rangeID;
    }

    public String Post() {


        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("callPost");
        operationBinding.getParamsMap().put("rangeId", getRangeID().getValue());     
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        
        return null;
        
    }
    public String completion() {


        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("submitCompletion");
        operationBinding.getParamsMap().put("rangeId", getRangeID().getValue());     
        //invoke method
        operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            System.out.println("if errors-->");
            // List errors = operationBinding.getErrors();
        }
        //optional
        Object methodReturnValue = operationBinding.getResult();
        String message = null;
        if (methodReturnValue != null) {
            message = methodReturnValue.toString();
        } else {
            message = "Failed! .";
        }
        FacesMessage fm = new FacesMessage(message);
        fm.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, fm);
        
        return null;
        
    }

    public void setSaleOrderLineID(RichInputText saleOrderLineID) {
        this.saleOrderLineID = saleOrderLineID;
        setSessionSaleOrderLineID(saleOrderLineID);
    }

    public RichInputText getSaleOrderLineID() {
        return saleOrderLineID;
    }

    public void setSessionSaleOrderLineID(RichInputText id){        
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("saleOrderLineIdS", id.getValue());   
    
    }

    public void setRatioPlanIdNew(RichInputText ratioPlanIdNew) {
        this.ratioPlanIdNew = ratioPlanIdNew;
        setRatioPlanIdNewSession(ratioPlanIdNew);
    }

    public RichInputText getRatioPlanIdNew() {
        return ratioPlanIdNew;
    }
    
    
    public void setRatioPlanIdNewSession(RichInputText id){        
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("ratioIdNewS", id.getValue());   
    
    }

   /**
    * Manual executing cutting tab Create insert button
    * #{bindings.CreateInsert2.execute}
    * **/

    public String createCuttingTabRow() {
        // Add event code here...
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =
            bindings.getOperationBinding("CreateInsert2");       
        operationBinding.execute();
        setInseamSessionId();
        return null;
    }
   
   
   public void setInseamSessionId(){
        
        oracle.adf.view.rich.component.UIXTable table = getCuttingDetailTable();
        // Get the Selected Row key set iterator
        java.util.Iterator selectionIt = table.getSelectedRowKeys().iterator();
        String InseamId = null;
        while (selectionIt.hasNext()) {
            Object rowKey = selectionIt.next();
            table.setRowKey(rowKey);
            int index = table.getRowIndex();
            FacesCtrlHierNodeBinding row =
                (FacesCtrlHierNodeBinding)table.getRowData(index);
            Row selectedRow = row.getRow();
          

            try {
                InseamId =selectedRow.getAttribute("InseamId").toString();
            } catch (Exception e) {
                ;
            }
           
        }
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExternalContext ectx = fctx.getExternalContext();
            HttpSession userSession = (HttpSession) ectx.getSession(false);
            userSession.setAttribute("inseamIdS", InseamId);   
      
        }

    public void setCuttingDetailTable(RichTable cuttingDetailTable) {
        this.cuttingDetailTable = cuttingDetailTable;
    }

    public RichTable getCuttingDetailTable() {
        return cuttingDetailTable;
    }
    
    //////papolate stn///////////
    
    public void editPopupFetchListener1(PopupFetchEvent popupFetchEvent) {
        
         
         setWhereClause1();
       }
    public void setWhereClause1(){
        
        BindingContext bctx = BindingContext.getCurrent();
        BindingContainer bindings = bctx.getCurrentBindingsEntry();
        OperationBinding operationBinding =bindings.getOperationBinding("populateOrderLines1");           
        operationBinding.execute();
        //setCutPlanWhrcls();
        if (!operationBinding.getErrors().isEmpty()) {
           System.out.println("if errors-->");
           // List errors = operationBinding.getErrors();
        }
        
        }
    public void editDialogListener1(DialogEvent dialogEvent) {
           if (dialogEvent.getOutcome().name().equals("ok")) {       
             callPopulate1();
             AdfFacesContext.getCurrentInstance().addPartialTarget(cuttingDetailTable);
                
           } else if (dialogEvent.getOutcome().name().equals("cancel")) {          
            ;
           }
       }
    
    public void editPopupCancelListener1(PopupCanceledEvent popupCanceledEvent) {
           
       }
    public void callPopulate1()
    {
            
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bindings = bctx.getCurrentBindingsEntry();
            OperationBinding operationBinding =bindings.getOperationBinding("findSelLines1");           
            operationBinding.execute();
            
            if (!operationBinding.getErrors().isEmpty()) {
               System.out.println("call populate-->");
               // List errors = operationBinding.getErrors();
            }
            
        }//end of callPopulate method


    public void setStyle(RichInputComboboxListOfValues style) {
        this.style = style;
    }

    public RichInputComboboxListOfValues getStyle() {
        return style;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String Save() {
        
        getTotalCutPlanQuantity();
       // AdfFacesContext.getCurrentInstance().addPartialTarget(cutPlanQuantity);
        
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
    
    // Code for Total Cut Plan Quantity
    
    public void getTotalCutPlanQuantity()
    {
            
            BindingContext bctx = BindingContext.getCurrent();
            BindingContainer bindings = bctx.getCurrentBindingsEntry();
            OperationBinding operationBinding =bindings.getOperationBinding("CuttingProductionAssignment");           
            operationBinding.execute();
            
            if (!operationBinding.getErrors().isEmpty()) {
               System.out.println("call TotalCutPlanQuantity-->");
               // List errors = operationBinding.getErrors();
            }
            
        }//end of Total Cut Plan Quantity

    public void setCutPlanQuantity(RichInputText cutPlanQuantity) {
        this.cutPlanQuantity = cutPlanQuantity;
    }

    public RichInputText getCutPlanQuantity() {
        return cutPlanQuantity;
    }

    public void setBuyerId(RichInputText buyerId) {
        this.buyerId = buyerId;
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExternalContext ectx = fctx.getExternalContext();
        HttpSession userSession = (HttpSession) ectx.getSession(false);
        userSession.setAttribute("BuyerId", buyerId.getValue());
    }

    public RichInputText getBuyerId() {
        return buyerId;
    }

    

    

    private void setCutPlanWhrcls() {
      ViewObject popupV = am.getpopupVO1();
        String cutplanNo=cutPlanNumber.getValue().toString();
        
        popupV.setWhereClause("CUT_PLAN_NO = '"+cutplanNo+"'");
        popupV.executeQuery();
        
    }

    public void setCutPlanNumber(RichInputListOfValues cutPlanNumber) {
        this.cutPlanNumber = cutPlanNumber;
    }

    public RichInputListOfValues getCutPlanNumber() {
        return cutPlanNumber;
    }
}

