package com.github.ckroeger.openapi.model;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.reflections.Reflections;

@Slf4j
@AllArgsConstructor
//@Component
public class ModelSubTypRegister {

    public static final String PACKAGE_TO_SCAN = "com.github.ckroeger.openapi.model";
    private ObjectMapper objectMapper;

    @PostConstruct
    public void registerSubTypes(){
        Reflections reflections = new Reflections(PACKAGE_TO_SCAN);
        var subtypes = reflections.getSubTypesOf(MixedDataAnimal.class);
        for (Class<?> subType : subtypes) {
            NamedType namedType = new NamedType(subType, subType.getSimpleName());
            log.info(ToStringBuilder.reflectionToString(namedType));
            objectMapper.registerSubtypes(namedType);
        }
    }
}
