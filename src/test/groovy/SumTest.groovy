import com.spock.Sum
import spock.lang.Specification

/**
 * Created by hongsen on 16/1/31.
 */
class SumTest extends Specification {
    def sum = new Sum();

    def "sum should return first + second"() {
        expect:
        sum.sum(1, 1) == 2
    }

    def "max of two numbers"() {
        expect:
        Math.max(a, b) == c;

        where:
        a | b || c
        3 | 5 || 5
        7 | 0 || 7
        0 | 0 || 0
    }
}
