package com.abbeymicrosvs.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    /**   use to audit the database columns
     * Returns the current auditor of the application
     * @return the current audiotor
     */

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Abbey_MS");
    }
}
