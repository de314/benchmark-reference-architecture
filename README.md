## Results

#### Mapping

```
Benchmark                                              Mode  Cnt     Score   Error   Units
HardCodedByConstructorBenchmark.mapLarge              thrpt    2  2747.094          ops/us
HardCodedByConstructorBenchmark.mapLargeEntity        thrpt    2  2767.742          ops/us
HardCodedByConstructorBenchmark.mapPublicAntipattern  thrpt    2  2806.057          ops/us
HardCodedByConstructorBenchmark.mapSimple             thrpt    2  2817.281          ops/us
HardCodedByConstructorBenchmark.mapSmall              thrpt    2  2151.779          ops/us
HardCodedBySettersBenchmark.mapLarge                  thrpt    2  2661.755          ops/us
HardCodedBySettersBenchmark.mapLargeEntity            thrpt    2  2774.466          ops/us
HardCodedBySettersBenchmark.mapPublicAntipattern      thrpt    2  2770.130          ops/us
HardCodedBySettersBenchmark.mapSimple                 thrpt    2  2771.344          ops/us
HardCodedBySettersBenchmark.mapSmall                  thrpt    2  2720.057          ops/us
MapstructBenchmark.mapLarge                           thrpt    2  2838.008          ops/us
MapstructBenchmark.mapLargeEntity                     thrpt    2  2758.764          ops/us
MapstructBenchmark.mapPublicAntipattern               thrpt    2  2917.489          ops/us
MapstructBenchmark.mapSimple                          thrpt    2  2801.487          ops/us
MapstructBenchmark.mapSmall                           thrpt    2  2714.215          ops/us
OrikaBenchmark.mapLarge                               thrpt    2     1.424          ops/us
OrikaBenchmark.mapLargeEntity                         thrpt    2     1.366          ops/us
OrikaBenchmark.mapPublicAntipattern                   thrpt    2     1.931          ops/us
OrikaBenchmark.mapSimple                              thrpt    2     2.115          ops/us
OrikaBenchmark.mapSmall                               thrpt    2     2.111          ops/us
PublicAntipatternBenchmark.mapLarge                   thrpt    2  2757.877          ops/us
PublicAntipatternBenchmark.mapLargeEntity             thrpt    2  2787.642          ops/us
PublicAntipatternBenchmark.mapPublicAntipattern       thrpt    2  2695.439          ops/us
PublicAntipatternBenchmark.mapSimple                  thrpt    2  2791.518          ops/us
PublicAntipatternBenchmark.mapSmall                   thrpt    2  2691.930          ops/us

Benchmark result is saved to benchmark-result/Wed Feb 07 23:13:46 EST 2018.json

Process finished with exit code 0
```

#### Streaming

```
Benchmark                                                 Mode  Cnt    Score   Error  Units
BatchJ8StreamsServiceBenchmark.streamSmall_fast          thrpt    2  161.092          ops/s
BatchJ8StreamsServiceBenchmark.streamSmall_slow          thrpt    2    1.402          ops/s
BatchStreamsServiceBenchmark.streamSmall_fast            thrpt    2  163.899          ops/s
BatchStreamsServiceBenchmark.streamSmall_slow            thrpt    2    1.402          ops/s
InlineStreamsServiceBenchmark.streamSmall_fast           thrpt    2   16.407          ops/s
InlineStreamsServiceBenchmark.streamSmall_slow           thrpt    2    0.665          ops/s
J8StreamsServiceBenchmark.streamSmall_fast               thrpt    2   16.320          ops/s
J8StreamsServiceBenchmark.streamSmall_slow               thrpt    2    0.666          ops/s
ParallelBatchJ8StreamsServiceBenchmark.streamSmall_fast  thrpt    2  162.416          ops/s
ParallelBatchJ8StreamsServiceBenchmark.streamSmall_slow  thrpt    2    1.401          ops/s
ParallelBatchStreamsServiceBenchmark.streamSmall_fast    thrpt    2   43.946          ops/s
ParallelBatchStreamsServiceBenchmark.streamSmall_slow    thrpt    2    2.716          ops/s
ParallelInlineStreamsServiceBenchmark.streamSmall_fast   thrpt    2   44.099          ops/s
ParallelInlineStreamsServiceBenchmark.streamSmall_slow   thrpt    2    2.725          ops/s
ParallelJ8StreamsServiceBenchmark.streamSmall_fast       thrpt    2   16.144          ops/s
ParallelJ8StreamsServiceBenchmark.streamSmall_slow       thrpt    2    0.665          ops/s
```