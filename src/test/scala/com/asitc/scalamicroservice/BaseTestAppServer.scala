package com.asitc.scalamicroservice

import org.scalamock.scalatest.MockFactory
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpec}

class BaseTestAppServer extends WordSpec
  with ScalatestRouteTest
  with Matchers
  with MockFactory
  with Routes
  with BeforeAndAfterAll {

  implicit val executionContext: ExecutionContextExecutor = system.dispatcher

}
