package com.github.ckroeger.openapi.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

@Slf4j
class ModelSubTypRegisterTest {

    @Test
    void test(){
        ObjectMapper objectMapper = Mockito.mock(ObjectMapper.class);
        ModelSubTypRegister uut = new ModelSubTypRegister(objectMapper);
        uut.registerSubTypes();
        verify(objectMapper, Mockito.times(3)).registerSubtypes((NamedType) Mockito.any());
    }
}
