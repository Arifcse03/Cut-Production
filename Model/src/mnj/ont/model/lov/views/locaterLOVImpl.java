package mnj.ont.model.lov.views;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 28 18:05:47 PKT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class locaterLOVImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public locaterLOVImpl() {
    }


    /**
     * Returns the bind variable value for p_component_item_id.
     * @return bind variable value for p_component_item_id
     */
    public String getp_component_item_id() {
        return (String)getNamedWhereClauseParam("p_component_item_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_component_item_id.
     * @param value value to bind as p_component_item_id
     */
    public void setp_component_item_id(String value) {
        setNamedWhereClauseParam("p_component_item_id", value);
    }

    /**
     * Returns the variable value for p_lotNo.
     * @return variable value for p_lotNo
     */
    public String getp_lotNo() {
        return (String)ensureVariableManager().getVariableValue("p_lotNo");
    }

    /**
     * Sets <code>value</code> for variable p_lotNo.
     * @param value value to bind as p_lotNo
     */
    public void setp_lotNo(String value) {
        ensureVariableManager().setVariableValue("p_lotNo", value);
    }

    /**
     * Returns the variable value for p_locator.
     * @return variable value for p_locator
     */
    public String getp_locator() {
        return (String)ensureVariableManager().getVariableValue("p_locator");
    }

    /**
     * Sets <code>value</code> for variable p_locator.
     * @param value value to bind as p_locator
     */
    public void setp_locator(String value) {
        ensureVariableManager().setVariableValue("p_locator", value);
    }

    /**
     * Returns the bind variable value for p_org_id.
     * @return bind variable value for p_org_id
     */
    public String getp_org_id() {
        return (String)getNamedWhereClauseParam("p_org_id");
    }

    /**
     * Sets <code>value</code> for bind variable p_org_id.
     * @param value value to bind as p_org_id
     */
    public void setp_org_id(String value) {
        setNamedWhereClauseParam("p_org_id", value);
    }
}
