package benchmark

import org.openjdk.jmh.annotations.*
import org.openjdk.jmh.runner.Runner
import org.openjdk.jmh.runner.options.OptionsBuilder
import java.util.concurrent.TimeUnit

/**
 * Created by tony on 2018-12-10.
 */
@BenchmarkMode(Mode.Throughput) // 基准测试的模式，采用整体吞吐量的模式
@Warmup(iterations = 3) // 预热次数
@Measurement(iterations = 10, time = 5, timeUnit = TimeUnit.SECONDS) // 测试参数，iterations = 10 表示进行10轮测试
@Threads(8) // 每个进程中的测试线程数
@Fork(2)  // 进行 fork 的次数，表示 JMH 会 fork 出两个进程来进行测试
@OutputTimeUnit(TimeUnit.MILLISECONDS) // 基准测试结果的时间类型
open class InlineBenchmark {

    fun nonInlined(block: () -> Unit) { // 不用内联的函数
        block()
    }

    inline fun inlined(block: () -> Unit) { // 使用内联的函数
        block()
    }

    @Benchmark
    fun testNonInlined() {
        nonInlined {
            println("")
        }
    }

    @Benchmark
    fun testInlined() {
        inlined {
            println("")
        }
    }

}

fun main() {

    val options = OptionsBuilder()
            .include(InlineBenchmark::class.java.simpleName)
            .output("benchmark_inline.log")
            .build()
    Runner(options).run()
}