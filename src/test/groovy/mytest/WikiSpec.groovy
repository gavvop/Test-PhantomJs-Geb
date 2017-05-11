
package mytest;

import geb.Browser;
import spock.lang.Specification;

class WikiSpec extends Specification {
  def "check hello world page title"() {

    setup:
    def browser = new Browser();
    
    when:
    browser.go("https://it.wikipedia.org/wiki/Hello_world")

    then:
    browser.title == "Hello world - Wikipedia"
    
  }
}
