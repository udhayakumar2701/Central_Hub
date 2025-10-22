package com.CentralHub.Central.Hub.Controller;


import com.CentralHub.Central.Hub.Service.MoneyManagementService;
import com.CentralHub.Central.Hub.VO.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentralController {


    private static final Logger log = LoggerFactory.getLogger(CentralController.class);

    @Autowired
    MoneyManagementService money;

    @GetMapping("/")
    String moneyManagement(){
        ApiResponse response = money.getDataAbout();
        log.info("Response from the Money - Management :: {}",response);
      return "";
    }
}
