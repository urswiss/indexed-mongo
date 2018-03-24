package ch.tripleap.kotlinsample

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document

/**
 * @author Urs Wiss
 */
@Document(collection ="streets")
class Street {
    @Id
    private var id: String? = null
    @Indexed
    private var zipCode: String? = null

    constructor(zipCode: String?) {
        this.zipCode = zipCode
    }
}
