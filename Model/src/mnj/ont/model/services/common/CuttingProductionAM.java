package mnj.ont.model.services.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 29 12:05:24 PKT 2015
// ---------------------------------------------------------------------
public interface CuttingProductionAM extends ApplicationModule {
    String IssueToFloor(int rangeId);

    String callPost(int rangeId);

    String submitCompletion(int rangeId);

    void populateOrderLines1(String style);

    void findSelLines1();

    void TotalCutPlanQuantity();

    void setSessionValues(String orgId, String userId, String respId,
                          String respAppl);

    void CuttingProductionAssignment();
}
