package com.mangalsathi.identity.dao;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.time.Instant;
import java.util.List;

public interface RsaKeyPairRepository {
    List<RsaKeyPairRepository.RsaKeyPair> findKeyPairs();

    void save(RsaKeyPairRepository.RsaKeyPair rsaKeyPair);

    record RsaKeyPair(String id, Instant created, RSAPublicKey publicKey, RSAPrivateKey privateKey) {
    }
}