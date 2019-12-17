package com.sidd.javademo.application.designpattern.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbtype, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbtype) {
            case MYSQL:
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();
                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateMySqlHtmlReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getOracleDBConection();
                OracleHelper oracleHelper = new OracleHelper();
                switch (reportType) {
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, con);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, con);
                        break;
                }
                break;

        }
    }

    public static enum DBTypes {
        MYSQL, ORACLE
    }

    public static enum ReportTypes {
        HTML, PDF
    }
}
