package com.sidd.javademo.application.designpattern.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleDBConection() {
        //get the Oracle DB connection using the connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        //get the data from table and generate the PDF report.
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        //get the data from the table and generate the HTML Report.
    }

}
