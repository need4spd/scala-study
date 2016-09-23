package functionalthinking

object PalindromeTest {

  def isPalindrome(x: String)  = x == x.reverse
  def findPalindrome(s: Seq[String]) = s find isPalindrome

  findPalindrome(List("des", "ble", "fox", "bob").view take 1000000)
}
