package com.stratio.conditionalconfiguration.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

@Configuration
@Slf4j
@ConditionalOnProperty(prefix = "conditional.properties", name = "exist")
public class ConditionalProperty extends AbstractVaultConfiguration {

    @Override public VaultEndpoint vaultEndpoint() {
        log.info("Conditional Property -> Exist");
        return null;
    }

    @Override public ClientAuthentication clientAuthentication() {
        log.info("Conditional Property -> Exist");
        return null;
    }
}
