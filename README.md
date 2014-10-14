jse8collectionBenchmark
=======================
Contains Jmh based benchmark of all JSE1.8 Collections, tested for inserting and iterating

Benchmark                                                  (elementsCount)  Mode  Samples        Score   Score error  Units
c.g.s.CollectionsInsertBenchmmark.insertArrayList                     1000  avgt       20      303,898       208,252  us/op
c.g.s.CollectionsInsertBenchmmark.insertArrayList                    10000  avgt       20     2507,628      1854,427  us/op
c.g.s.CollectionsInsertBenchmmark.insertArrayList                   100000  avgt       20    22061,459     16485,199  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashMap                       1000  avgt       20       71,729         3,434  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashMap                      10000  avgt       20      750,957        24,132  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashMap                     100000  avgt       20    11409,823       555,813  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashSet                       1000  avgt       20       15,247         0,572  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashSet                      10000  avgt       20      181,513         7,043  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashSet                     100000  avgt       20     2229,216        87,318  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashtable                     1000  avgt       20       74,809         1,647  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashtable                    10000  avgt       20      845,400        26,430  us/op
c.g.s.CollectionsInsertBenchmmark.insertHashtable                   100000  avgt       20    12380,291       273,260  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedHashMap                 1000  avgt       20       65,582         2,254  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedHashMap                10000  avgt       20      754,995        51,448  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedHashMap               100000  avgt       20    10088,895       492,633  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedHashSet                 1000  avgt       20       16,249         0,393  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedHashSet                10000  avgt       20      151,299        12,447  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedHashSet               100000  avgt       20     2067,855        75,533  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedList                    1000  avgt       20      478,360       264,308  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedList                   10000  avgt       20     4712,262      2083,982  us/op
c.g.s.CollectionsInsertBenchmmark.insertLinkedList                  100000  avgt       20    57311,028     25618,846  us/op
c.g.s.CollectionsInsertBenchmmark.insertStack                         1000  avgt       20      262,775       196,342  us/op
c.g.s.CollectionsInsertBenchmmark.insertStack                        10000  avgt       20     2508,782      1896,062  us/op
c.g.s.CollectionsInsertBenchmmark.insertStack                       100000  avgt       20    23858,126     19059,583  us/op
c.g.s.CollectionsInsertBenchmmark.insertTreeMap                       1000  avgt       20      153,757         3,424  us/op
c.g.s.CollectionsInsertBenchmmark.insertTreeMap                      10000  avgt       20     2662,791       678,968  us/op
c.g.s.CollectionsInsertBenchmmark.insertTreeMap                     100000  avgt       20    37846,911      1742,537  us/op
c.g.s.CollectionsInsertBenchmmark.insertTreeSet                       1000  avgt       20       59,664         1,464  us/op
c.g.s.CollectionsInsertBenchmmark.insertTreeSet                      10000  avgt       20      917,894       121,208  us/op
c.g.s.CollectionsInsertBenchmmark.insertTreeSet                     100000  avgt       20    16321,537      1628,201  us/op
c.g.s.CollectionsInsertBenchmmark.insertVector                        1000  avgt       20      226,938       191,585  us/op
c.g.s.CollectionsInsertBenchmmark.insertVector                       10000  avgt       20     2267,452      1790,362  us/op
c.g.s.CollectionsInsertBenchmmark.insertVector                      100000  avgt       20    27005,313     20380,374  us/op
c.g.s.CollectionsIterateBenchmmark.iterateArrayList                   1000  avgt       20        0,922         0,027  us/op
c.g.s.CollectionsIterateBenchmmark.iterateArrayList                  10000  avgt       20        9,451         0,186  us/op
c.g.s.CollectionsIterateBenchmmark.iterateArrayList                 100000  avgt       20      489,996         8,270  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashMap                     1000  avgt       20       15,784         0,391  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashMap                    10000  avgt       20      355,043        17,729  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashMap                   100000  avgt       20     6628,517        71,999  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashSet                     1000  avgt       20        7,376         0,152  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashSet                    10000  avgt       20       78,443        11,026  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashSet                   100000  avgt       20     2598,615        50,674  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashtable                   1000  avgt       20        8,207         0,220  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashtable                  10000  avgt       20       85,512         7,610  us/op
c.g.s.CollectionsIterateBenchmmark.iterateHashtable                 100000  avgt       20     3478,790        48,210  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedHashMap               1000  avgt       20        7,278         0,222  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedHashMap              10000  avgt       20      110,602        38,834  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedHashMap             100000  avgt       20     2630,701        41,416  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedHashSet               1000  avgt       20        4,980         0,094  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedHashSet              10000  avgt       20       55,464        16,280  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedHashSet             100000  avgt       20     1811,769        31,089  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedList                  1000  avgt       20        2,363         0,047  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedList                 10000  avgt       20       54,035        35,366  us/op
c.g.s.CollectionsIterateBenchmmark.iterateLinkedList                100000  avgt       20     2898,540        22,019  us/op
c.g.s.CollectionsIterateBenchmmark.iterateStack                       1000  avgt       20        1,155         0,053  us/op
c.g.s.CollectionsIterateBenchmmark.iterateStack                      10000  avgt       20       10,861         0,288  us/op
c.g.s.CollectionsIterateBenchmmark.iterateStack                     100000  avgt       20      530,108         9,364  us/op
c.g.s.CollectionsIterateBenchmmark.iterateTreeMap                     1000  avgt       20       10,872         0,123  us/op
c.g.s.CollectionsIterateBenchmmark.iterateTreeMap                    10000  avgt       20      364,739         7,930  us/op
c.g.s.CollectionsIterateBenchmmark.iterateTreeMap                   100000  avgt       20     4851,716        58,050  us/op
c.g.s.CollectionsIterateBenchmmark.iterateTreeSet                     1000  avgt       20        8,425         0,164  us/op
c.g.s.CollectionsIterateBenchmmark.iterateTreeSet                    10000  avgt       20      182,234        12,495  us/op
c.g.s.CollectionsIterateBenchmmark.iterateTreeSet                   100000  avgt       20     3683,417        41,142  us/op
c.g.s.CollectionsIterateBenchmmark.iterateVector                      1000  avgt       20        1,169         0,023  us/op
c.g.s.CollectionsIterateBenchmmark.iterateVector                     10000  avgt       20       11,062         0,441  us/op
c.g.s.CollectionsIterateBenchmmark.iterateVector                    100000  avgt       20      535,978        10,650  us/op

<a href="https://github.com/soulaway/jse8collectionBenchmark/blob/master/benchmark.res">Full test results</a> for 1 Fork, 10 Wormup, 20 Iterations, {1000, 10000, 100000} elementsCount
