package com.CentralHub.Central.Hub.Service;

import com.CentralHub.Central.Hub.VO.ApiResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "money-management",
        url = "https://money-management-latest-1.onrender.com/"
)
public interface MoneyManagementService {


    @GetMapping("/public/about")
    ApiResponse getDataAbout();
}
