package org.br.camunda.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrinterDelegate implements JavaDelegate {

    private Logger logger = LoggerFactory.getLogger(PrinterDelegate.class);

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        logger.info("ProcessDefinitionId : " + execution.getProcessDefinitionId());
        logger.info("ActivityInstanceId : " + execution.getActivityInstanceId());
        logger.info("CurrentActivityId : " + execution.getCurrentActivityId());
        logger.info("CurrentTransitionId : " + execution.getCurrentTransitionId());
        logger.info("CurrentActivityName : " + execution.getCurrentActivityName());
        logger.info("ParentActivityInstanceId : " + execution.getParentActivityInstanceId());
        logger.info("ParentId : " + execution.getParentId());
        logger.info("ProcessInstanceId : " + execution.getProcessInstanceId());
        logger.info("TenantId : " + execution.getTenantId());
    }
}
