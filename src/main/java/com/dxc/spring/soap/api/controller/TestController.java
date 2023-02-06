package com.dxc.spring.soap.api.controller;

import com.dxc.spring.soap.api.cliente.SoapCliente;
import com.dxc.spring.soap.api.loaneligibility.Acknowledgement;
import com.dxc.spring.soap.api.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private SoapCliente soapCliente;

    @PostMapping
    public Acknowledgement getLoanStatus(@RequestBody CustomerRequest request) {
        return soapCliente.getLoanStatus(request);
    }
}
