package com.github.sparsick.openapi.feign.bug.server;

import com.github.sparsick.openapi.feign.bug.server.api.PetApi;
import com.github.sparsick.openapi.feign.bug.server.model.Fish;
import com.github.sparsick.openapi.feign.bug.server.model.OneOfFishMammal;
import com.github.sparsick.openapi.feign.bug.server.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController implements PetApi {

    @Override
    public ResponseEntity<Pet> petGet() {
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("a pet");
        OneOfFishMammal kindOf = new OneOfFishMammal();
        Fish fish = new Fish();
        fish.setLocation("water");
        kindOf.setFish(fish);
        pet.setKindOf(kindOf);
        return new ResponseEntity<>(pet,HttpStatus.OK);
    }
}
