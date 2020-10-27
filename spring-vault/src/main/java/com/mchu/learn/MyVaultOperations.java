package com.mchu.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.vault.VaultException;
import org.springframework.vault.core.*;
import org.springframework.vault.support.VaultResponse;
import org.springframework.vault.support.VaultResponseSupport;
import org.springframework.web.client.RestClientException;

import java.util.List;

public class MyVaultOperations implements VaultOperations {

    @Override
    public VaultKeyValueOperations opsForKeyValue(String s, VaultKeyValueOperationsSupport.KeyValueBackend keyValueBackend) {
        return null;
    }

    @Override
    public VaultVersionedKeyValueOperations opsForVersionedKeyValue(String s) {
        return null;
    }

    @Override
    public VaultPkiOperations opsForPki() {
        return null;
    }

    @Override
    public VaultPkiOperations opsForPki(String s) {
        return null;
    }

    @Override
    public VaultSysOperations opsForSys() {
        return null;
    }

    @Override
    public VaultTokenOperations opsForToken() {
        return null;
    }

    @Override
    public VaultTransitOperations opsForTransit() {
        return null;
    }

    @Override
    public VaultTransitOperations opsForTransit(String s) {
        return null;
    }

    @Override
    public VaultWrappingOperations opsForWrapping() {
        return null;
    }

    @Override
    public VaultResponse read(String s) {
        return null;
    }

    @Override
    public <T> VaultResponseSupport<T> read(String s, Class<T> aClass) {
        return null;
    }

    @Override
    public List<String> list(String s) {
        return null;
    }

    @Override
    public VaultResponse write(String path) {
        return null;
    }

    @Override
    public VaultResponse write(String s, Object o) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public <T> T doWithVault(RestOperationsCallback<T> restOperationsCallback) throws VaultException, RestClientException {
        return null;
    }

    @Override
    public <T> T doWithSession(RestOperationsCallback<T> restOperationsCallback) throws VaultException, RestClientException {
        return null;
    }

}
