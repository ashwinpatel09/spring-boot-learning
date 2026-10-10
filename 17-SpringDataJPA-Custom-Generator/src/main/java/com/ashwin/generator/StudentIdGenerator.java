
package com.ashwin.generator;

import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.generator.BeforeExecutionGenerator;
import org.hibernate.generator.EventType;
import org.hibernate.generator.EventTypeSets;

public class StudentIdGenerator implements BeforeExecutionGenerator {

    private static final AtomicLong counter = new AtomicLong(1000);

    @Override
    public Object generate(
            SharedSessionContractImplementor session,
            Object owner,
            Object currentValue,
            EventType eventType) {

        return "STU-" + counter.incrementAndGet();
    }

    @Override
    public java.util.EnumSet<EventType> getEventTypes() {
        return EventTypeSets.INSERT_ONLY;
    }
}
