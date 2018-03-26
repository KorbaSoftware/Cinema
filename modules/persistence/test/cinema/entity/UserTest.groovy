package cinema.entity

import spock.lang.Specification

class UserTest extends Specification {
    void "should pass"() {
        when:
            def a = 1
        then:
            1 == 1
    }

    void "should fail"() {
        when:
            def a = 1
        then:
            1 == 2
    }
}
