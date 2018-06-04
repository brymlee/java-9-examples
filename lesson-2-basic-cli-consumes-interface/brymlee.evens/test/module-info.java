module brymlee.evens.test{
    requires java.base;
    requires hamcrest.all;
    requires junit;
    requires brymlee.evens;
    opens brymlee.evens.test;
    uses brymlee.evens.external.EvensService;
}