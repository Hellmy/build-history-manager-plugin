package pl.damianszczepanik.jenkins.buildhistorymanager.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import hudson.model.Job;
import pl.damianszczepanik.jenkins.buildhistorymanager.model.conditions.Condition;

/**
 * @author Damian Szczepanik (damianszczepanik@github)
 */
public class ConditionBuilder {

    public static final List<Condition> sampleConditions = Collections.unmodifiableList(Arrays.asList(
            new SampleCondition(), new SampleCondition()));

    private static final class SampleCondition extends Condition {

        @Override
        public boolean matches(Job<?, ?> job) {
            return false;
        }
    }
}