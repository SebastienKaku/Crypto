public class Cryptography
{
    private int rotations = 13;  // used in the second part

    public Cryptography()
    {
        // no need to put anything here for now.
    }

    public int convertToNumbers(char letter)
    {
        // fill in this method!
        return (int) letter;
    }
   public char applyRotation(int n) {
       int temp = n;
       temp -= 65;  
       temp += 13;
       
       if (temp >= 26) {
           temp -= 26;  // Wrap around if necessary
       } else if (temp < 0) {
           temp += 26;  // Wrap around if necessary
       }
       
       return (char) (temp += 65);
   }

    // create a similar method for the ROT13 portion.
    // This method will return a character instead.
}
