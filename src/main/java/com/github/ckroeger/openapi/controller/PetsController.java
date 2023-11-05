package com.github.ckroeger.openapi.controller;

import com.github.ckroeger.openapi.api.PetsApi;
import com.github.ckroeger.openapi.model.MixedData;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController()
public class PetsController implements PetsApi {

//    @Override
//    public ResponseEntity<Void> createPets() {
//        getRequest().ifPresent(nativeWebRequest -> {
//            log.debug(nativeWebRequest.getNativeRequest().toString());
//        });
//        return PetsApi.super.createPets();
//    }

//    @Override
//    public ResponseEntity<Void> patchPet(MixedData mixedData) {
//        log.debug(ToStringBuilder.reflectionToString(mixedData));
//        return PetsApi.super.patchPet(mixedData);
//    }


//    @Override
//    public ResponseEntity<Void> patchPet(Animal comGithubCkroegerOpenapiModelAnimal) {
//        return PetsApi.super.patchPet(comGithubCkroegerOpenapiModelAnimal);
//    }


    @Override
    public ResponseEntity<Void> patchPet(MixedData mixedData) {
        log.info(ToStringBuilder.reflectionToString(mixedData));
        return PetsApi.super.patchPet(mixedData);
    }
}
