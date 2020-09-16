package service;

import java.io.Serializable;

public class UtilToSql implements Serializable {

    public static java.sql.Date convert(java.util.Date uDate) {
        java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
    }
}
