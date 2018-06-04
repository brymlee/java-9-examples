module brymlee.evens{
    requires java.base;
    exports brymlee.evens.external;
    provides brymlee.evens.external.EvensService 
        with brymlee.evens.internal.EvensServiceImplementation;
}