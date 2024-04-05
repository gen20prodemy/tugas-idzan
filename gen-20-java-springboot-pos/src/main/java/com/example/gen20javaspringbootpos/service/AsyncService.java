package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.CategoryDTO;
import com.example.gen20javaspringbootpos.repository.CategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {

    @Autowired
    private CategoryRepository categoryRepository;

    public void processSave(CategoryDTO cr) throws InterruptedException {
        log.info("initiate payment for order " + cr.getName());
        //call actual payment gateway
        Thread.sleep(2000);
        log.info("completed payment for order " + cr.getName());
    }
    @Async
    public void notifyUser(CategoryDTO Category) throws InterruptedException {
        Thread.sleep(15000);
        log.info("Notified to the user " + Thread.currentThread().getName());
    }
    @Async
    public void assignVendor(CategoryDTO Category) throws InterruptedException {
        Thread.sleep(5000);
        log.info("Assign Category to vendor " + Thread.currentThread().getName());
    }
    @Async
    public void packaging(CategoryDTO Category) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Category packaging completed " + Thread.currentThread().getName());
    }
    @Async
    public void assignDeliveryPartner(CategoryDTO Category) throws InterruptedException {
        Thread.sleep(10000);
        log.info("Delivery partner assigned " + Thread.currentThread().getName());
    }

    @Async
    public void assignTrailerAndDispatch(CategoryDTO Category) throws InterruptedException {
        Thread.sleep(3000);
        log.info("Trailer assigned and Category dispatched " + Thread.currentThread().getName());
    }
}
