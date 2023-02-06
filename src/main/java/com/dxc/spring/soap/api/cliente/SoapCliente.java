package com.dxc.spring.soap.api.cliente;

import com.dxc.spring.soap.api.loaneligibility.Acknowledgement;
import com.dxc.spring.soap.api.loaneligibility.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapCliente {
    @Autowired
    private Jaxb2Marshaller marshaller;
    private WebServiceTemplate template;


    public Acknowledgement getLoanStatus(CustomerRequest request) {
        template = new WebServiceTemplate(marshaller);
        return (Acknowledgement) template.marshalSendAndReceive("http://localhost:8080/ws", request);
    }
}
