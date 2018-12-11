package benchmark

import io.reactivex.Observable
import kotlinx.coroutines.runBlocking
import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger


/**
 * Created by tony on 2018-12-11.
 */
@BenchmarkMode(Mode.Throughput) // 基准测试的模式，采用整体吞吐量的模式
@Warmup(iterations = 3) // 预热次数
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS) // 测试参数，iterations = 10 表示进行10轮测试
@Threads(8) // 每个进程中的测试线程数
@Fork(2)  // 进行 fork 的次数，表示 JMH 会 fork 出两个进程来进行测试
@OutputTimeUnit(TimeUnit.MILLISECONDS) // 基准测试结果的时间类型
@State(Scope.Thread) // 为每个线程独享
open class CoroutinesBenchmark {

    var counter1 = AtomicInteger()
    var counter2 = AtomicInteger()

    @Setup
    fun prepare() {

        counter1.set(0)
        counter2.set(0)
    }

    fun calculate(counter:AtomicInteger): Double {

        val result = ArrayList<Int>()

        for (i in 0 until 10_000) {

            result.add(counter.incrementAndGet())
        }

        return result.asSequence().filter { it % 3 ==0 }.map { it *2 + 1 }.average()
    }

    @Benchmark
    fun testCoroutines() = runBlocking {

        calculate(counter1)
    }

    @Benchmark
    fun testRxJava() = Observable.fromCallable { calculate(counter2) }.blockingFirst()

}

fun main() {

    val options = OptionsBuilder()
            .include(CoroutinesBenchmark::class.java.simpleName)
            .output("benchmark_coroutines.log")
            .build()
    Runner(options).run()
}