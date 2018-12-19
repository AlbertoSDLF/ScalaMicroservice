package com.asitc.scalamicroservice

class PersonRoutesSpec extends BaseTestAppServer {

  "The service" should {
    "return an empty JSon array if there are no categories" in {
      Get("/search/category") ~> routes ~> check {
        responseAs[List[Category]] shouldBe List(Category("DevOps"), Category("Java"))
      }
    }
  }

}
