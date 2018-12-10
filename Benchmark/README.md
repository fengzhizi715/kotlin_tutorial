
先执行 ./gradlew build

然后再运行 SequenceBenchmarkKt

基准测试得到如下的结果：

```
# Run complete. Total time: 00:05:24

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                        Mode  Cnt      Score      Error   Units
SequenceBenchmark.testList      thrpt   20  13384.619 ± 1052.883  ops/ms
SequenceBenchmark.testSequence  thrpt   20  19881.438 ±  822.850  ops/ms
```
