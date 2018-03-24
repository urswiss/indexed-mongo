package ch.tripleap.indexed.mongo

import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@DataMongoTest
class IndexedMongoApplicationTests {

	@Autowired
	lateinit var mongoTemplate: MongoTemplate

	@Test
	fun contextLoads() {
		val street = Street("4658")
		mongoTemplate.save(street)
		val result = mongoTemplate.findAll(Class.forName("ch.tripleap.indexed.mongo.Street"))
        assertNotNull(result)
        assertTrue(mongoTemplate.indexOps("streets").indexInfo.size == 2)
	}

}
