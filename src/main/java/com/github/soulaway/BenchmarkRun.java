package com.github.soulaway;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.results.Result;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class BenchmarkRun {
    public static void main(String[] args) throws RunnerException {
        Options opts = new OptionsBuilder()
                .include(CollectionsIterateBenchmmark.class.getSimpleName())
        		.include(CollectionsInsertBenchmmark.class.getSimpleName())
        		.mode(Mode.AverageTime)
        		.timeUnit(TimeUnit.MICROSECONDS)
                .forks(1)
                .warmupIterations(10)
                .threads(1)
                .build();

        Collection<RunResult> runResult = new Runner(opts).run();
        for (RunResult r : runResult){
        	Result<?> result = r.getPrimaryResult();
            System.out.println();
            System.out.println("API replied benchmark score: " + result.getScore() + " " + result.getScoreUnit() + " over " + result.getStatistics().getN() + " iterations.");        
        }
    }
}
