package io.cucumber.plugin.event;

import org.apiguardian.api.API;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

@API(status = API.Status.EXPERIMENTAL)
public final class TestCaseDefined extends TestCaseEvent {
    private final TestCase testCase;
    private final String id = UUID.randomUUID().toString();

    public TestCaseDefined(Instant timeInstant, TestCase testCase) {
      super(timeInstant, testCase);
      this.testCase = Objects.requireNonNull(testCase);
    }

    @Override
    public TestCase getTestCase() {
        return testCase;
    }

    public String getId() {
        return id;
    }
}