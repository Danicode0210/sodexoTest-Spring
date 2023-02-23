package com.sodexo.testsodexo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "comunasClient", url = "http://private-anon-d717001a83-gonzalobulnes.apiary-mock.com/comunas")
public interface ComunasClient {
    @GetMapping("/comunas")
    List<Comuna> getAll();
}




