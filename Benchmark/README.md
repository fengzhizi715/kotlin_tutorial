
先执行 ./gradlew build

## 对比 Sequence 和 List

运行 SequenceBenchmark.kt

基准测试得到如下的结果：

```
# Run complete. Total time: 00:05:23

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                        Mode  Cnt      Score     Error   Units
SequenceBenchmark.testList      thrpt   20  15924.272 ± 305.825  ops/ms
SequenceBenchmark.testSequence  thrpt   20  23099.938 ± 515.524  ops/ms
```

## 内联函数和非内联函数

运行 InlineBenchmark.kt

基准测试得到如下的结果：

```
# Run complete. Total time: 00:05:23

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                        Mode  Cnt   Score   Error   Units
InlineBenchmark.testInlined     thrpt   20  95.866 ± 4.085  ops/ms
InlineBenchmark.testNonInlined  thrpt   20  92.736 ± 3.085  ops/ms
```


## 协程和RxJava

运行 CoroutinesBenchmark.kt

基准测试得到如下的结果：

```
# Run complete. Total time: 00:05:23

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                            Mode  Cnt   Score   Error   Units
CoroutinesBenchmark.testCoroutines  thrpt   20  17.719 ± 2.249  ops/ms
CoroutinesBenchmark.testRxJava      thrpt   20  18.151 ± 0.429  ops/ms
```
