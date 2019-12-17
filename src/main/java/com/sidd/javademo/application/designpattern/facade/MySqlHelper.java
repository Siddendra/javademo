package com.sidd.javademo.application.designpattern.facade;

import java.sql.Connection;

public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        //get mysql DB connection using the connection parameter
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get the data from the table and generate the PDF.
    }

    public void generateMySqlHtmlReport(String tableName, Connection con) {
        // get the data from the table and generate the HTML
    }



}
