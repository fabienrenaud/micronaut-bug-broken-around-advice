# Micronaut - Broken Around Advice

## Tests

Bug:

1. Run `gradle test`
2. Notice only "foo" is printed.
3. In build.gradle, downgrade micronaut to 1.2.8 or 1.3.0.M1
4. Run the test again.
5. Notice "INTERCEPTED" + "foo" are printed.

## Main source

1. Run `gradle run`
2. `curl localhost:8080/service`
3. Notice only "BAR INVOKED" is printed.
4. In build.gradle, downgrade micronaut to 1.2.8 or 1.3.0.M1
5. Repeat steps 1 & 2
6. Notice "INTERCEPT" + "BAR INVOKED" are printed
