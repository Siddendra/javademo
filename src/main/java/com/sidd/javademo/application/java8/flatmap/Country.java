package com.sidd.javademo.application.java8.flatmap;

import java.util.Optional;

public class Country {
    Optional<PrimeMinister> primeMinister;

    public Country() {
    }

    public Country(Optional<PrimeMinister> primeMinister) {
        this.primeMinister = primeMinister;
    }

    public Optional<PrimeMinister> getPrimeMinister() {
        return primeMinister;
    }

    public void setPrimeMinister(Optional<PrimeMinister> primeMinister) {
        this.primeMinister = primeMinister;
    }
}
