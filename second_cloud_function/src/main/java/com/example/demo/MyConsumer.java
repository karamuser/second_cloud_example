package com.example.demo;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MyConsumer implements Consumer<String> {
@Override
public void accept(String s) {
	System.out.println("hii"+s);
	System.out.println("saqnath");
	System.out.println("karam");
	System.out.println("irshad");
}
}
