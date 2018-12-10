package benchmark

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import java.util.concurrent.TimeUnit

/**
 * Created by tony on 2018-12-10.
 */
@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 3)
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS)
@Threads(8)
@Fork(2)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
open class SequenceBenchmark {

    @Benchmark
    fun testSequence():Int {

        return sequenceOf(1,2,3,4,5,6,7,8,9,10)
                .map{ it * 2 }
                .filter { it % 3  == 0 }
                .map{ it+1 }
                .sum()
    }

    @Benchmark
    fun testList():Int {

        return listOf(1,2,3,4,5,6,7,8,9,10)
                .map{ it * 2 }
                .filter { it % 3  == 0 }
                .map{ it+1 }
                .sum()
    }
}

fun main() {

    val options = OptionsBuilder()
            .include(SequenceBenchmark::class.java.simpleName)
            .output("Benchmark.log")
            .build()
    Runner(options).run()
}