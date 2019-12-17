package com.sidd.javademo.application.designpattern.facade;

import java.sql.Connection;

public class FacadePatternTest {
    public static void main(String args[]) {
        String tableName = "Employee";

        //Generating MYSQL HTML report and Oracle PDF report.

        MySqlHelper mySqlHelper =  new MySqlHelper();
        Connection con  = MySqlHelper.getMySqlDBConnection();
        mySqlHelper.generateMySqlHtmlReport(tableName, con);

        Connection con1 = OracleHelper.getOracleDBConection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //Generating the MYSQL HTML and ORACLE PDF report

        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);



    }
}
