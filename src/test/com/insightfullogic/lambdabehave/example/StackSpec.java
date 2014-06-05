package com.insightfullogic.lambdabehave.example;

import com.insightfullogic.lambdabehave.JunitBehaveRunner;
import org.junit.runner.RunWith;

import java.util.Stack;

import static com.insightfullogic.lambdabehave.Lets.given;
import static com.insightfullogic.lambdabehave.Lets.describe;

@RunWith(JunitBehaveRunner.class)
public class StackSpec {{

    Stack<Integer> stack = new Stack<>();

    describe("a stack", it -> {

        given(stack::clear);

        it.should("be empty when created", expect -> {
            expect.that(stack).isEmpty();
        });

        it.should("push new elements onto the top of the stack", expect -> {
            stack.push(1);

            expect.that(stack.get(0)).isEqualTo(1);
        });

        it.should("pop the last element pushed onto the stack", expect -> {
            stack.push(2);
            stack.push(1);

            expect.that(stack.pop()).isEqualTo(2);
        });

    });

}}