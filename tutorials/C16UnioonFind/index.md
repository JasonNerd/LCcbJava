---
title: "C16UnioonFind"
date: 2023-03-23T16:20:20+08:00
draft: true
tags: ["Java", "算法", "UnioonFind", "LeetCode"]
categories: ["LeetCode"]
twemoji: true
lightgallery: true
---

*   灵活使用并查集的思想，熟练掌握并查集的 [模板](https://books.halfrost.com/leetcode/ChapterThree/UnionFind/)，模板中有两种并查集的实现方式，一种是路径压缩 + 秩优化的版本，另外一种是计算每个集合中元素的个数 + 最大集合元素个数的版本，这两种版本都有各自使用的地方。能使用第一类并查集模板的题目有：第 128 题，第 130 题，第 547 题，第 684 题，第 721 题，第 765 题，第 778 题，第 839 题，第 924 题，第 928 题，第 947 题，第 952 题，第 959 题，第 990 题。能使用第二类并查集模板的题目有：第 803 题，第 952 题。第 803 题秩优化和统计集合个数这些地方会卡时间，如果不优化，会 TLE。
*   并查集是一种思想，有些题需要灵活使用这种思想，而不是死套模板，如第 399 题，这一题是 stringUnionFind，利用并查集思想实现的。这里每个节点是基于字符串和 map 的，而不是单纯的用 int 节点编号实现的。
*   有些题死套模板反而做不出来，比如第 685 题，这一题不能路径压缩和秩优化，因为题目中涉及到有向图，需要知道节点的前驱节点，如果路径压缩了，这一题就没法做了。这一题不需要路径压缩和秩优化。
*   灵活的抽象题目给的信息，将给定的信息合理的编号，使用并查集解题，并用 map 降低时间复杂度，如第 721 题，第 959 题。
*   关于地图，砖块，网格的题目，可以新建一个特殊节点，将四周边缘的砖块或者网格都 union() 到这个特殊节点上。第 130 题，第 803 题。
*   能用并查集的题目，一般也可以用 DFS 和 BFS 解答，只不过时间复杂度会高一点。


No.|Title|Solution|Difficulty|TimeComplexity|SpaceComplexity|Favorite|Acceptance
|:-:|:-|:-|:-|:-|:-|:-|:-|
0128|Longest Consecutive Sequence|[Go](https://books.halfrost.com/leetcode/ChapterFour/0100~0199/0128.Longest-Consecutive-Sequence/)|Medium|O(n)|O(n)|❤️|49.0%
0130|Surrounded Regions|[Go](https://books.halfrost.com/leetcode/ChapterFour/0100~0199/0130.Surrounded-Regions/)|Medium|O(m\*n)|O(m\*n)|35.8%
0200|Number of Islands|[Go](https://books.halfrost.com/leetcode/ChapterFour/0200~0299/0200.Number-of-Islands/)|Medium|O(m\*n)|O(m\*n)|56.1%
0399|Evaluate Division|[Go](https://books.halfrost.com/leetcode/ChapterFour/0300~0399/0399.Evaluate-Division/)|Medium|O(n)|O(n)|59.5%
0547|Number of Provinces|[Go](https://books.halfrost.com/leetcode/ChapterFour/0500~0599/0547.Number-of-Provinces/)|Medium|O(n^2)|O(n)|63.2%
0684|Redundant Connection|[Go](https://books.halfrost.com/leetcode/ChapterFour/0600~0699/0684.Redundant-Connection/)|Medium|O(n)|O(n)|62.0%
0685|Redundant Connection II|[Go](https://books.halfrost.com/leetcode/ChapterFour/0600~0699/0685.Redundant-Connection-II/)|Hard|O(n)|O(n)|34.1%
0695|Max Area of Island|[Go](https://books.halfrost.com/leetcode/ChapterFour/0600~0699/0695.Max-Area-of-Island/)|Medium|71.6%
0721|Accounts Merge|[Go](https://books.halfrost.com/leetcode/ChapterFour/0700~0799/0721.Accounts-Merge/)|Medium|O(n)|O(n)|❤️|56.3%
0765|Couples Holding Hands|[Go](https://books.halfrost.com/leetcode/ChapterFour/0700~0799/0765.Couples-Holding-Hands/)|Hard|O(n)|O(n)|❤️|56.9%
0778|Swim in Rising Water|[Go](https://books.halfrost.com/leetcode/ChapterFour/0700~0799/0778.Swim-in-Rising-Water/)|Hard|O(n^2)|O(n)|❤️|59.6%
0785|Is Graph Bipartite?|[Go](https://books.halfrost.com/leetcode/ChapterFour/0700~0799/0785.Is-Graph-Bipartite/)|Medium|52.6%
0803|Bricks Falling When Hit|[Go](https://books.halfrost.com/leetcode/ChapterFour/0800~0899/0803.Bricks-Falling-When-Hit/)|Hard|O(n^2)|O(n)|❤️|34.3%
0839|Similar String Groups|[Go](https://books.halfrost.com/leetcode/ChapterFour/0800~0899/0839.Similar-String-Groups/)|Hard|O(n^2)|O(n)|47.5%
0924|Minimize Malware Spread|[Go](https://books.halfrost.com/leetcode/ChapterFour/0900~0999/0924.Minimize-Malware-Spread/)|Hard|O(m\*n)|O(n)|42.1%
0928|Minimize Malware Spread II|[Go](https://books.halfrost.com/leetcode/ChapterFour/0900~0999/0928.Minimize-Malware-Spread-II/)|Hard|O(m\*n)|O(n)|❤️|42.6%
0947|Most Stones Removed with Same Row or Column|[Go](https://books.halfrost.com/leetcode/ChapterFour/0900~0999/0947.Most-Stones-Removed-with-Same-Row-or-Column/)|Medium|O(n)|O(n)|57.0%
0952|Largest Component Size by Common Factor|[Go](https://books.halfrost.com/leetcode/ChapterFour/0900~0999/0952.Largest-Component-Size-by-Common-Factor/)|Hard|O(n)|O(n)|❤️|40.3%
0959|Regions Cut By Slashes|[Go](https://books.halfrost.com/leetcode/ChapterFour/0900~0999/0959.Regions-Cut-By-Slashes/)|Medium|O(n^2)|O(n^2)|❤️|69.1%
0990|Satisfiability of Equality Equations|[Go](https://books.halfrost.com/leetcode/ChapterFour/0900~0999/0990.Satisfiability-of-Equality-Equations/)|Medium|O(n)|O(n)|50.7%
1020|Number of Enclaves|[Go](https://books.halfrost.com/leetcode/ChapterFour/1000~1099/1020.Number-of-Enclaves/)|Medium|64.8%
1202|Smallest String With Swaps|[Go](https://books.halfrost.com/leetcode/ChapterFour/1200~1299/1202.Smallest-String-With-Swaps/)|Medium|57.5%
1254|Number of Closed Islands|[Go](https://books.halfrost.com/leetcode/ChapterFour/1200~1299/1254.Number-of-Closed-Islands/)|Medium|64.2%
1319|Number of Operations to Make Network Connected|[Go](https://books.halfrost.com/leetcode/ChapterFour/1300~1399/1319.Number-of-Operations-to-Make-Network-Connected/)|Medium|58.3%
1579|Remove Max Number of Edges to Keep Graph Fully Traversable|[Go](https://books.halfrost.com/leetcode/ChapterFour/1500~1599/1579.Remove-Max-Number-of-Edges-to-Keep-Graph-Fully-Traversable/)|Hard|52.7%
1631|Path With Minimum Effort|[Go](https://books.halfrost.com/leetcode/ChapterFour/1600~1699/1631.Path-With-Minimum-Effort/)|Medium|55.3%
