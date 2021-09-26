import example.One
import spock.lang.*

@Title("向指定账号存款")
@Narrative("""关于测试的大段文本描述""")
@Subject(One)  //标明被测试的类是One
class OneTest extends Specification {
  def setupSpec() {
   	//TODO: 设置每个测试类的环境
  }

  def setup() {
    //TODO: 设置每个测试方法的环境，每个测试方法执行一次
  }	

  @Issue(["问题#23","问题#34"])
  def "向A账号存入100元"() {

    given: "A账号余额10元"
    One one = new One()
    
    and: "其他前置条件"
    def a = 1
    //Account account = new Account()
    //account.balance = 10

    when: "向A账号存入100元"
    def result = one.foo()
    
    //account.deposit(100)

    then: "A账号余额为110元"
    //account.balance == 110
    a == 1
    result == "foo"
  }

  def "Stub and Mock"() {
  	given: "arrange"
    def one = Mock(One) {
        foo(_) >> "3355"
    }

    when: "act"
    def result = one.foo()

    then: "assert"
    1 * one.foo()
    //result == "foo"

  }

 
}