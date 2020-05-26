package com.tsp

object Config {
  object chance {
    def edgeExists: Double = 0.9
  }

  object graph {
    def maxWeight: Int = 100
  }

  object printing {
    def spacing: Int = 8
    def pathDelimiter: String = "->"
  }

  object concurrency {
    def parallelism: Int = 16
    def batching: Int = 512
  }
}
