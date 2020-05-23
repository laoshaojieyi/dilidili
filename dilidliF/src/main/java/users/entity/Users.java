package users.entity;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Users {
    private Integer userId;

    private String userName;

    private String userPassword;

    private BigDecimal userMoney;

    private Integer userVip;

    private String userTelnum;

    private Integer userBlack;

    private Integer userReportnum;

   
}