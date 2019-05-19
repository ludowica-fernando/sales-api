package com.ludowica.salesapi.service;

import com.ludowica.salesapi.models.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ItemService {

    private final String mmItemsUrl = "https://api.myjson.com/bins/v0bsm";

    public List<Item> getAllItems() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Item[]> mmItemsResponseEntity = restTemplate.getForEntity(mmItemsUrl, Item[].class);

        Item[] items = mmItemsResponseEntity.getBody();
        List<Item> itemsList = Arrays.asList(items);

        return itemsList;
    }

}
