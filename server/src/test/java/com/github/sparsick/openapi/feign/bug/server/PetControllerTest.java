package com.github.sparsick.openapi.feign.bug.server;

import com.github.sparsick.openapi.feign.bug.client.ApiClient;
import com.github.sparsick.openapi.feign.bug.client.api.PetsApi;
import com.github.sparsick.openapi.feign.bug.client.model.Fish;
import com.github.sparsick.openapi.feign.bug.client.model.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PetControllerTest {

    @LocalServerPort
    private int port;

    @Test
    void test(){
        ApiClient apiClient = new ApiClient();
        PetsApi petsApi = apiClient.setBasePath("http://localhost:" + port).buildClient(PetsApi.class);
        Pet pet = petsApi.petGet();

        assertThat(pet.getKindOf()).isNotNull().isInstanceOf(Fish.class).extracting("location").isEqualTo("water");
    }

}